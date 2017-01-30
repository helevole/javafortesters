package com.javafortesters.chap006domainentities.examples;


//import com.javafortesters.domainentities.User;
import com.javafortesters.domainentities.User;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by HeleVole on 29-Jan-17.
 */
public class UserTest {

    @Test
    public void userHasDefaultUsernameAndPassword(){

        User user = new User();

        assertEquals("user has default username", "username", user.getUsername());
        assertEquals("user has default password", "password", user.getPassword());

    }

    @Test
    public void canConstructANewUser(){
        User user = new User();
    }

    @Test
    public void canConstructUserWithPassword(){
        User auser = new User("admin","pa55w0rD");

        assertEquals("username is set to admin", "admin", auser.getUsername());
        assertEquals("password is set to custom value", "pa55w0rD", auser.getPassword());
    }

    @Test
    public void canSetPasswordAfterConstructed(){

        User user = new User();

        user.setPassword("PaZZwor6");

        assertEquals("the password is set to PaZZwor6", "PaZZwor6", user.getPassword());
    }
}

