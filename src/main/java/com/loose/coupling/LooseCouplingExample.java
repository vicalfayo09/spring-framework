package com.loose.coupling;

public class LooseCouplingExample {
    public static void main(String... args){
        UserDataProvider userDatabaseProvider = new UserDatabaseProvider();
        UserManager userManager = new UserManager(userDatabaseProvider);
        System.out.println(userManager.getUserInfo());

        UserDataProvider webServiceProvider = new WebServiceDataProvider();
        UserManager userManagerWithWs = new UserManager(webServiceProvider);
        System.out.println(userManagerWithWs.getUserInfo());

        UserDataProvider newDatabaseProvider = new NewDatabaseProvider();
        UserManager userManagerWithNewDb = new UserManager(newDatabaseProvider);
        System.out.println(userManagerWithNewDb.getUserInfo());
    }   
}
