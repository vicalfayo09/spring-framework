package com.example.ecommerce.service;

import java.util.List;

import com.example.ecommerce.model.Category;

public interface CategoryService {
    List<Category> getAllCategories();
    void createCategory(Category category);
    String deleteCategory(Long categoryId);
    Category updateCategory(Long categoryId, Category category);
}
