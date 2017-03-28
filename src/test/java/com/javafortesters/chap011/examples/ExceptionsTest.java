package com.javafortesters.chap011.examples;

import com.javafortesters.domainentities.User;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by HeleVole on 26-Mar-17.
 */
public class ExceptionsTest {

    //Example for NullPointerException

    @Test
    public void nullPointerExercise(){

        Integer age = null;

        //comment out the value assignment below to produce the NullPointerException
        age = 18;

        String ageAsString = age.toString();

        String yourAge = "You are " + ageAsString + " years old.";

        assertEquals("You are 18 years old.", yourAge);

    }

    @Test
    public void tryCatchExercise(){

        Integer age = null;
        String ageAsString;

        try{
            ageAsString = age.toString();
        } catch (NullPointerException e){
            age = 18;
            ageAsString = age.toString();
        }

        String yourAge = "You are " + ageAsString + " years old.";

        assertEquals("You are 18 years old.", yourAge);

    }

    @Test
    public void exceptionAsObjectExercise(){

        Integer age = null;
        String ageAsString;

        try {
            ageAsString = age.toString();
        } catch (NullPointerException e){
            age = 18;
            ageAsString = age.toString();

            System.out.println("getMessage - " + e.getMessage());
            System.out.println("getStacktrace - " + e.getStackTrace()[0]);
            System.out.println("printStacktrace");
            e.printStackTrace();
        }

        String yourAge = "You are " + ageAsString + " years old.";

        assertEquals("You are 18 years old.", yourAge);
    }

    @Test
    public void multipleExceptionsExample(){

        Integer age = null;
        String ageAsString;

        try{
            ageAsString = age.toString();
        } catch (NullPointerException e){
            age = 18;
            ageAsString = age.toString();
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }

    //The below method is an example of an exception expected by jUnit. Note the @Test annotation before the method declaration.
    //If the exception is not triggered, the method will not pass

    @Test(expected = NullPointerException.class)
    public void expectedException(){
        Integer age = null;
        age.toString();
    }

    @Test(expected = IllegalArgumentException.class)
    public void passwordTooShort(){

        User user;
        user = new User("userone", "short");

    }

    @Test
    public void passwordOk(){
        User user = new User("usertwo", "longpas");

        assertEquals("longpas", user.getPassword());
    }

    @Test
    public void finallyExample(){

        Integer age = null;
        String ageAsString;
        String yourAge;

        try {
            ageAsString = age.toString();
        } catch (NullPointerException e){
            System.out.println(e.getStackTrace()[0]);
            age = 18;
            ageAsString = age.toString();
        } finally {
            yourAge = "You are " + age.toString() + " years old.";
        }

        assertEquals("You are 18 years old.", yourAge);
    }

    @Test(expected = IllegalArgumentException.class)
    public void finallyRethrowException(){
        Integer age = null;

        try{
            System.out.println("1. generate a nullpointerexception");
            System.out.println(age.toString());
        } catch (NullPointerException e){
            System.out.println("2. handle the nullpointerexception");
            throw new IllegalArgumentException("The nullpointerexception became an illegalargumentexception", e);
        } finally {
            System.out.println("3. run code in the finally section (print this line)");
        }

    }

}
