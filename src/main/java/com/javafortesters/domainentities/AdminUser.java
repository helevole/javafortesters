package com.javafortesters.domainentities;

/**
 * Created by csabi on 3/28/17.
 */
public class AdminUser extends User{

    //default constructor method
    public AdminUser(){
        this("admin","password");
    }

    //constructor method
    public AdminUser(String username, String password){
        //this is the usage for calling the "super constructor, i.e. the constructor method on the parent class.
        //this way this constructor just delegates the task to the parent
        super(username, password);
    }

    //reimplementation of User.getPermission
    //adding the Override annotation ensures the that availability of the User.getPermission method is checked at compile time and that the declaration didnt change
    //it helps to prevent simple errors
    @Override
    public String getPermission(){
        return "Elevated";
    }

}
