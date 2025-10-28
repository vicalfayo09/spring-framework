package com.ioc.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCExample {
    public static void main(String[] args){
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationIoCLooseCoupling.xml");
        

        UserManager userManagerWithDB = (UserManager) context.getBean("userManagerWithUserDataProvider");
        System.out.println(userManagerWithDB.getUserInfo());

        
        UserManager userManagerWithWs = (UserManager) context.getBean("userManagerWithWebServiceProvider");
        System.out.println(userManagerWithWs.getUserInfo());

    
        UserManager userManagerWithNewDb = (UserManager) context.getBean("userManagerWithNewDatabaseProvider");
        System.out.println(userManagerWithNewDb.getUserInfo());
    }   
}
