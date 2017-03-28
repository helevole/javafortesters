package com.javafortesters.domainentities;

/**
 * Created by csabi on 3/28/17.
 */
public class ReadOnlyUser extends User{
/*
    public ReadOnlyUser(){
        this("username","password");
    }

    public ReadOnlyUser(String username, String password){
        super(username, password);
    }
*/
    @Override
    public String getPermission(){
        return "ReadOnly";
    }

}
