package com.javafortesters.chap010.examples;

import static org.junit.Assert.*;
import org.junit.Test;
import com.javafortesters.chap009.examples.ArrraysLoops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by csabi on 2/27/17.
 */
public class Collections {


    String[] months = new String[]{"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
    List<String> numerics = new ArrayList<>();
    List<String> monthcoll = Arrays.asList(months);

    public List<String> arrayToList(){

        List<String> monthlist = Arrays.asList(months);

        return monthlist;
    }

    @Test
    public void simpleCollectionExample(){

        List<String> coll1 = arrayToList();
        assertEquals("Mar", coll1.get(2));

        for(String month : coll1){
            System.out.print(month + "/");
        }
    }


    public List<String> returnDynamicCollection(){

        numerics.add("five");
        numerics.add("four");
        numerics.add("three");
        numerics.add("two");
        numerics.add("one");
        numerics.add("zero");

        assertEquals("two", numerics.get(3));
        assertEquals("zero", numerics.get(5));
        assertEquals("five", numerics.get(0));

        return numerics;
    }

    @Test
    public void countDown(){

        for(String number : returnDynamicCollection()){
            System.out.print(number + ", ");
        }
    }

    @Test
    public void whileLoopExample(){
        int i = 0;
        List<String> numsToPrint = returnDynamicCollection();

        while (i < numsToPrint.size()){
            System.out.println(numsToPrint.get(i));
            i++;
        }
    }

    @Test
    public void doWhileLoopExample(){

        int i = 0;
        List<String> numsToPrint = returnDynamicCollection();

        do {
            System.out.println(numsToPrint.get(i));
            i++;
        } while (i < numsToPrint.size());

    }

    @Test
    public void findMonthForEach(){
        int i = 0;
        for(String month : monthcoll){
            if(month.equals("Mar")){
                break;
            }
            i++;
        }
        System.out.println(i);
        assertEquals("Mar", monthcoll.get(i));
    }

    @Test
    public void findMonthFor(){

        int i;
        for(i = 0; i < monthcoll.size(); i++){
            if (monthcoll.get(i).equals("Dec")){
                System.out.println(i);
                break;
            }
        }
        assertEquals("Dec", monthcoll.get(i));

    }

    @Test
    public void findMonthWhile(){

        int i = 0;
        while (!monthcoll.get(i).equals("Nov")){
            i++;
        }

        System.out.println(i);
        assertEquals("Nov", monthcoll.get(i));

    }

    @Test
    public void findMonthDoWhile(){

        int i = -1;
        do{
            i++;
        }
        while(monthcoll.get(i).equals("Jan"));

        System.out.println(i);
        assertEquals("Jan",monthcoll.get(i));
    }

    @Test
    public void forInsteadOfWhileExercise(){
        int i;
        for (i =0; !monthcoll.get(i).equals("Nov"); i++){
        }

        System.out.println(i);
        assertEquals("Nov", monthcoll.get(i));
    }

}
