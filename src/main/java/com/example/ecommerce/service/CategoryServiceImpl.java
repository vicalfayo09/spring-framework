package com.example.ecommerce.service;

//import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.ecommerce.model.Category;
import com.example.ecommerce.repositories.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {

     //private List<Category> categories = new ArrayList<>();
     private Long nextId = 1L; 
    
     @Autowired
     private CategoryRepository categoryRepository;
    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public void createCategory(Category category) {
        category.setCategoryId(nextId++);
        categoryRepository.save(category);
    }
    public String deleteCategory(Long categoryId){
        List<Category> categories = categoryRepository.findAll();   
        Category category = categories.stream()
                            .filter(c -> c.getCategoryId().equals(categoryId))
                            .findFirst()
                            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Resource not found"));

        categoryRepository.delete(category);
        return "Category with category id " + categoryId + " has been deleted successfully.";
    }
    
    @Override
    public Category updateCategory(Long categoryId, Category category){
        List<Category> categories = categoryRepository.findAll();
        Optional<Category> optionalCategory = categories.stream()
                                    .filter(c -> c.getCategoryId().equals(categoryId))
                                    .findFirst();
        if(optionalCategory.isPresent()){
            Category existingCategory = optionalCategory.get();
            existingCategory.setCategoryName(category.getCategoryName());
            Category savedCategory = categoryRepository.save(existingCategory);
            return savedCategory;
        }
        else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Category is not found");
        }
    }
}
