package com.javafortesters.chap010.examples;

import static org.junit.Assert.*;

import com.javafortesters.chap008.examples.SelectionDecision;
import com.javafortesters.domainentities.User;
import org.junit.Test;
import com.javafortesters.chap009.examples.ArrraysLoops;

import java.util.*;

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

    @Test
    public void collectionInterfaceBasics(){
        ArrayList<String> mycollection;
        mycollection = new <String>ArrayList();

        assertEquals(2, monthcoll.indexOf("Mar"));

    }

    @Test
    public void instantiateImplementExample(){
        Collection workdays;
        workdays = new ArrayList();

        List<String> allweek = new ArrayList<String>();

        // Equivalent syntaxes for creating collections below
        Collection<String> colA = new ArrayList<String>();
        Collection<String> colB = new <String>ArrayList();
        Collection<String> colC = new ArrayList<>();

        //Adding elements to the workdays collection created earlier
        workdays.add("Monday");
        workdays.add("Tuesday");
        workdays.add("Wednesday");
        workdays.add("Thursday");
        workdays.add("Friday");

        assertEquals(5, workdays.size());

        allweek.addAll(workdays);
        allweek.add("Saturday");
        allweek.add("Sunday");

        for(String weekday : allweek){
            System.out.println(weekday);
        }

        System.out.println("");

        for(int i = 0; i < allweek.size(); i++ ){
            System.out.println(allweek.get(i));
        }

        System.out.println("");

        assertTrue(allweek.containsAll(workdays));

        Collection<String> weekend = new ArrayList<String>();

        for (int i = 4; i < 7; i++){
            weekend.add(allweek.get(i));
        }

        weekend.remove("Friday");

        assertTrue(!weekend.contains("Friday"));
        assertTrue(weekend.contains("Saturday"));

        System.out.println("");

        // Example for not declaring a collection with a specific type and then casting it as a string when necessary

        Collection seasons = new ArrayList();

        seasons.add("Spring");
        seasons.add("Summer");
        seasons.add("Autumn");
        seasons.add("Winter");

        for(Object season : seasons){
            String output = (String)season;
            System.out.println(output);
        }

        System.out.println("");

        // Examples for clear and isEmpty methods from the Collection interface

        assertEquals(4, seasons.size());

        seasons.clear();

        assertEquals(0, seasons.size());
        assertTrue(seasons.isEmpty());

        // Examples for the removeAll and containsAll methods from the Collection interface

        allweek.removeAll(workdays);

        assertEquals(weekend, allweek);
        assertEquals(2, allweek.size());
        assertTrue(allweek.containsAll(weekend));
        assertTrue(!allweek.containsAll(workdays));

        allweek.clear();
        assertTrue(allweek.size() == 0);

        //Example for the retainAll method from the Collection interface

        allweek.addAll(workdays);
        allweek.addAll(weekend);

        assertEquals("Saturday", allweek.get(5));
        assertEquals(7, allweek.size());

        allweek.retainAll(workdays);

        assertEquals("Friday", allweek.get(4));
        assertEquals(5, allweek.size());
        assertTrue(allweek.containsAll(workdays));
        assertFalse(allweek.containsAll(weekend));



        for(String day : allweek){
            System.out.println(day);
        }

        System.out.println("");

        allweek.addAll(weekend);

        //Examples for the toArray method from the Collection interface

        Object[] allWeekArray = allweek.toArray();
        assertEquals(7, allWeekArray.length);

        //Casting elements of the resulting array as a String

        assertEquals("Monday".length(), ((String)allWeekArray[0]).length());

        //Example for the toArray(anArray) usage

        String[] anotherArray = new String[allweek.size()];
        //Above the array of type String has been initialized to the same length as the original collection

        allweek.toArray(anotherArray);

        assertEquals("Sunday", anotherArray[6]);
        assertEquals(7, anotherArray.length);

    }

    @Test
    public void chap10CollectionExercise(){

        Collection<User> users = new ArrayList<>();

        assertEquals(0, users.size());
        assertTrue(users.isEmpty());

        User user1 = new User("userone","passone");
        User user2 = new User("usertwo","passtwo");

        users.add(user1);
        users.add(user2);

        assertEquals(2, users.size());
        assertFalse(users.isEmpty());

        Collection<User> otherusers = new ArrayList<>();

        User user3 = new User("userthree","passthree");
        User user4 = new User("userfour","passfour");

        users.add(user3);
        users.add(user4);

        users.addAll(otherusers);

        assertTrue(users.containsAll(otherusers));
        assertEquals(4, users.size());

        otherusers.removeAll(users);
        users.clear();

        assertEquals(0, users.size());
        assertEquals(0, otherusers.size());
        assertTrue(users.isEmpty());
        assertFalse(!otherusers.isEmpty());


    }


}
