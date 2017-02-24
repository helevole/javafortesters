package com.javafortesters.chap009.examples;

import com.javafortesters.domainentities.User;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;

/**
 * Created by csabi on 2/23/17.
 */
public class ArrraysLoops {

    String[] months = new String[] {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};

    User user1 = new User("userone","passone");
    User user2 = new User("usertwo","passtwo");
    User user3 = new User("userthree","passthree");

    User[] users = new User[] {user1, user2, user3};

    @Test
    public void printUserName(){
        System.out.println(user1.getUsername());
        System.out.println(user2.getUsername());
        System.out.println(user3.getUsername());
        assertEquals("userone",user1.getUsername());
    }

    @Test
    public void simpleArrayExample(){
        String[] array = {"nulla","egy", "ketto","harom"};

        for (String numbertext : array){
            System.out.println(numbertext);
        }

        assertEquals("egy", array[1]);
        assertEquals("harom", array[3]);

    }

    @Test
    public void arrayCreationExample(){
        int[] integers = new int[10];
        int []moreInts = new int[10];
        int lastInts[] = new int[10];

        int[] zeroLength = new int[0];
        int[] noMembers = {};

        int[] uninitialized;
        uninitialized = new int[] {1,2,3};



        assertEquals("Jan",months[0]);
        assertEquals("May", months[4]);
        assertEquals("Oct", months[9]);
        assertEquals("Dec", months[11]);

    }



    @Test
    public void forEachLoopExample(){

        String result = "";

        for(String month : months){
            result = result + month + "|";
            System.out.println(month);
        }

       // assertEquals("Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec|", result);

    }

    @Test
    public void forEachUserExercise(){

        for(User currentUser : users){
            System.out.println(currentUser.getUsername());
        }
    }

    @Test
    public void forLoopExample(){

        String springmonths = "";

        for(int i = 2; i > 1 && i < 5; i++){
            springmonths = springmonths + months[i] + "-" + (i+1) + "-" + "|";
            System.out.println("Found " + months[i] + " at position " + (i+1));
        }

        assertEquals("Mar-3-|Apr-4-|May-5-|", springmonths);
    }

    @Test
    public void forEachWithIndex(){

        int i = 0;

        for( String month : months){
            System.out.println("Found " + month + " at position " + (i+1));
            i++;
        }
    }

    @Test
    public void hundredUserArrayExercise(){

        User[] hundred = new User[100];

        for(int i=0; i < 100; i++){

            hundred[i] = new User("user" + (i+1),"password" + (i+1));
            System.out.println(hundred[i].getUsername());
        }

        for(int i = 0; i < hundred.length ; i++){
            System.out.println("The name of the user in position " + (i+1) + " is " + hundred[i].getUsername() + " with the password " + hundred[i].getPassword());
            assertEquals("user" + (i+1), hundred[i].getUsername());
            assertEquals("password" + (i+1), hundred[i].getPassword());
        }

    }

    @Test
    public void arrayLengthExample(){

        User[] fifty = new User[50];
        assertEquals(50, fifty.length);

        for(int i=0; i < months.length; i++){
            System.out.println(months[i]);
        }
    }

    @Test
    public void arrayMethodsCopyOfExample(){

        String[] twoyears;
        twoyears = Arrays.copyOf(months, 24);

        assertEquals("Dec", twoyears[11]);
        assertEquals(null, twoyears[12]);

        for(int i=12; i < twoyears.length; i++){
            twoyears[i] = months[i-12];
            System.out.println(twoyears[i]);
        }

        assertEquals("Dec", twoyears[11]);
        assertEquals("Jan", twoyears[12]);
        assertEquals("May", twoyears[16]);
    }

    @Test
    public void arrayMethodsCopyOfRangeExample(){

        String result = "";
        String[] fallmonths;

        fallmonths = Arrays.copyOfRange(months,8,11);

        assertEquals(3, fallmonths.length);
        assertEquals("Sep", fallmonths[0]);
        assertEquals("Nov", fallmonths[2]);

        for(String month : fallmonths){
            result = result + month + "|";
        }

        System.out.println(result);
    }

    @Test
    public void arrayMethodsFillExample(){

        int[] rand = new int[] {5,8,36,7,1,6,78,2,6,4,9,6,27,8};
        int[] randMore;
        randMore = Arrays.copyOf(rand, 20);

        Arrays.fill(randMore, 14, 19, 1);
        assertEquals(5, randMore[0]);
        assertEquals(8, randMore[13]);
        assertEquals(1, randMore[14]);
        assertEquals(1, randMore[17]);
        assertEquals(0, randMore[19]);
    }

    @Test
    public void arrayMethodsSortExample(){
        String[] orderedMonths;
        orderedMonths = Arrays.copyOf(months,12);

        Arrays.sort(orderedMonths);

        assertEquals("Apr",orderedMonths[0]);
        assertEquals("Sep",orderedMonths[11]);
        assertEquals("Aug",orderedMonths[1]);

        for(int i = 0; i < orderedMonths.length; i++){
            System.out.println(orderedMonths[i]);
        }
    }
}




