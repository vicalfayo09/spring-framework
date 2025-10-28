package com.ioc.coupling;

public class WebServiceDataProvider implements UserDataProvider {
    @Override
    public String getUserDetails(){
        return "User 1 fetched from Web Service";
    }
}
