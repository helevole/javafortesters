package com.javafortesters.domainentities;

import com.javafortesters.domainobject.TestAppEnv;

/**
 * Created by HeleVole on 29-Jan-17.
 */
public class User {

    private String username;
    private String password;

    public User(){
        this("username","password");
    }

    public User(String username, String password){
        this.username = username;
        setPassword(password);
    }

    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password)
    {
        if (password.length() < 7){
            throw new IllegalArgumentException("The password has to be at least 7 characters long");
        } else {
            this.password = password;
        }
    }

    public String getPermission(){
        return "Normal";
    }
}
