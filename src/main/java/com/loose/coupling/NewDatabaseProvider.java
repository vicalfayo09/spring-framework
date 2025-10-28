package com.loose.coupling;

public class NewDatabaseProvider implements UserDataProvider {

    @Override
    public String getUserDetails() {
        return "Welcome DB2 to my project";
    }

}
