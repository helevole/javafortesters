package com.javafortesters.chap010.examples;

import org.junit.Test;
import static org.junit.Assert.*;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by csabi on 3/24/17.
 */
public class Lists {

    String[] monthsArray = new String[]{"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};




    @Test
    public void listExamples(){

        List<String> monthsCollection = new ArrayList<>();

        for(int i=0; i < monthsArray.length; i++){
            monthsCollection.add(monthsArray[i]);
        //  System.out.println(monthsCollection.get(i));
        }

        //Example for the get method from the List interface

        assertEquals(12, monthsCollection.size());
        assertTrue(monthsCollection.get(6).equals("Jul"));

        //Examples for the remove method from the List interface

        List<String> incompleteMonths = new ArrayList<>();

        for(int i = 0; i < monthsCollection.size(); i++){
            incompleteMonths.add( i, monthsCollection.get(i));
        }

        assertEquals(12, incompleteMonths.size());
        assertTrue(incompleteMonths.get(6).equals("Jul"));

        incompleteMonths.remove(3);
        incompleteMonths.remove(6);
        incompleteMonths.remove(9);

        assertEquals(incompleteMonths.get(6), "Sep");
        assertEquals(9, incompleteMonths.size());

        //Example for the add(at specific index) method from the List interface

        incompleteMonths.add(3, "Noapr");
        incompleteMonths.add(7, "Noaug");
        incompleteMonths.add(11, "Nodec");

        System.out.println("");
/*
        for(String month : incompleteMonths){
            System.out.println(month);
        }
*/
        assertEquals(12, incompleteMonths.size());
        assertEquals("Jul", incompleteMonths.get(6));
        assertEquals("Nodec", incompleteMonths.get(11));

        //Example for the addAll method from the List interface

        List<String> missingseason = new ArrayList<>();
        List<String> summer = new ArrayList<>();

        summer.add("Jun");
        summer.add("Jul");
        summer.add("Aug");

        assertEquals( 3, summer.size());
        assertEquals("Jul", summer.get(1));
        assertEquals(0, missingseason.size());


        for(int i = 0; i < monthsCollection.size(); i++){
            missingseason.add( i, monthsCollection.get(i));
        }

        assertEquals(12, missingseason.size());

        missingseason.remove("Jun");
        missingseason.remove("Jul");
        missingseason.remove("Aug");

        assertEquals("Sep", missingseason.get(5));
        assertEquals("May", missingseason.get(4));
        assertEquals( 9, missingseason.size());

        missingseason.addAll(5, summer);

        assertEquals("Jun", missingseason.get(5));
        assertEquals("Aug", missingseason.get(7));
        assertEquals(12, missingseason.size());
/*
        for(String month : missingseason){
            System.out.println(month);
        }
*/
        //Example for the indexOf method from the List interface

        List<String> monthsIndexof = new ArrayList<>();


        for(int i = 0; i < monthsCollection.size(); i++){
        monthsIndexof.add(monthsCollection.get(i));
        }

        assertEquals(12, monthsIndexof.size());
        assertEquals(3, monthsIndexof.indexOf("Apr"));


        //Example for the lastIndexOf method from the List interface

        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(5);
        numbers.add(4);
        numbers.add(5);
        numbers.add(3);
        numbers.add(2);
        numbers.add(5);
        numbers.add(3);

        assertEquals(6, numbers.lastIndexOf(5));
        assertEquals(1, numbers.indexOf(5));
        assertEquals(7, numbers.lastIndexOf(3));

        //Example for the set method from the List interface

        numbers.set(6, 7);
        numbers.set(3, 7);

        assertEquals(1, numbers.lastIndexOf(5));
        assertEquals(1, numbers.indexOf(5));
        assertEquals(6, numbers.lastIndexOf(7));

        assertEquals(7, numbers.get(3).intValue());
        assertEquals(7, numbers.get(6).intValue());

        //Example for the subList method from the List interface

        List<Integer> lessNumbers = new ArrayList<>();
        lessNumbers = numbers.subList(2, 6);

    }




}
