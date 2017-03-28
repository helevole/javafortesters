package com.javafortesters.chap010.examples;

import com.javafortesters.domainentities.User;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;
import static org.junit.Assert.*;

/**
 * Created by HeleVole on 25-Mar-17.
 */
public class SetsTest {

    @Test
    public void setExamples() {
        Set someMonths = new HashSet();

        //example for how Set ignores the addition of duplicate values

        someMonths.add("Jan");
        someMonths.add("Feb");
        someMonths.add("Jan");
        someMonths.add("Jan");
        someMonths.add("Feb");
        someMonths.add("Mar");

        assertEquals(3, someMonths.size());
    }

    @Test
    public void setExercise(){

        User user1 = new User();

        Set users = new HashSet();

        assertEquals(0, users.size());

        users.add(user1);

        assertEquals(1, users.size());

        users.add(user1);

        assertEquals(1, users.size());


    }

}
