package com.javafortesters.chap012.examples;

import com.javafortesters.domainentities.AdminUser;
import com.javafortesters.domainentities.EmptyUser;
import com.javafortesters.domainentities.ReadOnlyUser;
import com.javafortesters.domainentities.User;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by csabi on 3/28/17.
 */
public class Inheritance {

    @Test
    public void basicInheritanceExample(){

        EmptyUser empty = new EmptyUser();

        assertEquals("username", empty.getUsername());
        assertEquals("password", empty.getPassword());
        assertEquals("http://192.123.0.3:67", empty.getUrl());
    }

    @Test
    public void userHasNormalPermisssions(){

        User user = new User();

        assertEquals("Normal", user.getPermission());
    }

    @Test
    public void adminUserDefaultConstructor(){

        AdminUser admin = new AdminUser();

        assertEquals("Elevated", admin.getPermission());
        assertEquals("admin", admin.getUsername());
        assertEquals("password", admin.getPassword());

    }

    @Test
    public void userHasElevatedPermissions(){

        AdminUser admin = new AdminUser("admin1", "p@ssw0rd");

        assertEquals("Elevated", admin.getPermission());
        assertEquals("admin1", admin.getUsername());
        assertEquals("p@ssw0rd", admin.getPassword());

    }

    @Test
    public void readOnlyUserExercise(){

        ReadOnlyUser readonly = new ReadOnlyUser();

        assertEquals("ReadOnly", readonly.getPermission());
        assertEquals("username", readonly.getUsername());
        assertEquals("password", readonly.getPassword());

    }
}
