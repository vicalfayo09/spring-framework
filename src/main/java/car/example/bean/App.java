package car.example.bean;

import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        //@SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationBeanContext.xml");
        MyBean myBean = (MyBean) context.getBean("myBean");
        System.out.println(myBean);
    }
}
