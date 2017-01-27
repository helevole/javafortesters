package com.javafortesters.chap003myfirsttest.examples;

import org.junit.Test;

import static java.lang.Integer.toHexString;
import static org.junit.Assert.assertEquals;


/**
 * Created by csabi on 1/27/17.
 */
public class IntegerExampleTest {

    @Test
    public void integerExploration(){

        Integer four = new Integer(4);
        assertEquals("object returns intValue 4", 4, four.intValue());

        Integer five = new Integer("5");
        assertEquals("object returns intvalue 5", 5, five.intValue());

        Integer six = 6;
        assertEquals("object returns intvalue 6", 6, six.intValue());
    }

    @Test
    public void integerToHex(){
        Integer eleven = 11;
        assertEquals("object returns hex value b", "b", Integer.toHexString(eleven));

        Integer ten = 10;
        assertEquals("object returns hex value a", "a", Integer.toHexString(ten));

        Integer three = 3;
        assertEquals("object returns hex value 3", "3", Integer.toHexString(three));

        Integer twentyone = 21;
        assertEquals("object returns hex value 15", "15", Integer.toHexString(twentyone));
    }

    @Test
    public void integerMinMaxConstants(){

        assertEquals("object returns min value of integer -2147483648", -2147483648, Integer.MIN_VALUE);
        assertEquals("object returns max value of integer 2147483647", 2147483647, Integer.MAX_VALUE);
    }

}
