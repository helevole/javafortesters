package com.javafortesters.chap011.examples;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by HeleVole on 26-Mar-17.
 */
public class Exceptions {

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
}
