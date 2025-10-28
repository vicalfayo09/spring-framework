package com.loose.coupling;

public class WebServiceDataProvider implements UserDataProvider {
    @Override
    public String getUserDetails(){
        return "User 1 fteched from Web Service";
    }
}
