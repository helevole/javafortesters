package com.javafortesters.chap010.examples;

import com.javafortesters.domainentities.User;
import com.sun.corba.se.impl.encoding.OSFCodeSetRegistry;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.*;

/**
 * Created by HeleVole on 26-Mar-17.
 */
public class Maps {

    @Test
    public void mapExamples(){

        Map mapa = new HashMap();
        Map<String, User> mapb = new HashMap<>();

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");

        assertEquals(3, map.size());
        assertEquals("two", map.get(2));

        map.put(2, "ketto");

        assertEquals("ketto", map.get(2));

        //using Map.get with a missing key will return null

        assertEquals(null, map.get(4));

        //removing elements with Map.remove

        map.remove(2);
        assertEquals(2, map.size());

        //usage of Map.clear, isEmtpy and size

        map.clear();
        assertEquals(0, map.size());
        assertTrue(map.isEmpty());

        //usage of containsKey and containsValue

        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");

        assertTrue(map.containsKey(3));
        assertFalse(map.containsKey(4));

        assertTrue(map.containsValue("three"));
        assertTrue(!map.containsValue("four"));

        //usage of Map.putAll

        Map<Integer, String> newmap = new HashMap<>();

        assertEquals("two", map.get(2));

        newmap.put(2, "ketto");
        newmap.put(4, "four");
        newmap.put(5, "five");

        map.putAll(newmap);

        assertEquals(5, map.size());
        assertEquals("ketto", map.get(2));
        assertEquals("five", map.get(5));

        //usage of Map.values. IMPORTANT: values returns a Collection, so its imperative to declare the container variable as a Collection

        Collection<String> values = map.values();

        assertTrue(values.contains("five"));
        assertEquals(5, values.size());

        // usage of Map.keySet. IMPORTANT: this returns a Set

        Set<Integer> set = map.keySet();

        assertEquals(5, set.size());
        assertTrue(set.contains(4));

        // usage of Map.entrySet and the methods available for Entry objects (which are the key value pairs returned as a Set)

        Set<Map.Entry<Integer, String>> entryset = map.entrySet();

        assertEquals(5, entryset.size());

        //NOTE: Entry.getValue and Entry.getKey are not available for some reason

        //assertEquals("ketto", entryset.getValue(2));




        for(Map.Entry entry : entryset){
            entry.setValue("infinity");
        }

    }

    @Test
    public void mapExercise(){

        Map<String, User> users = new HashMap<>();

        assertEquals(0, users.size());

        User user1 = new User("userone","passone");
        User user2 = new User("usertwo","passtwo");

        users.put("playerone", user1);

        assertEquals(user1, users.get("playerone"));

        users.put("playerone", user2);

        assertEquals(user2, users.get("playerone"));
        assertEquals(1, users.size());
    }

}
