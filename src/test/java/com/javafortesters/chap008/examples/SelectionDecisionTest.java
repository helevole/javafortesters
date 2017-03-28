package com.javafortesters.chap008.examples;

// import com.sun.java.util.jar.pack.Instruction;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by csabi on 2/8/17.
 */
public class SelectionDecisionTest {

    @Test
    public void moreTernary(){
        String url = "www.dsl.sk";

        url = url.startsWith("http://") ? url : addHttp(url);
        Assert.assertTrue(url.startsWith("http://"));
    }

    public String addHttp(String url){
        return "http://" + url;
    }

    @Test
    public void catOrCatsTest(){

        Assert.assertEquals("cat", catOrCats(1));
        System.out.println("onecat " + catOrCats(1));
        Assert.assertEquals("cats", catOrCats(2));
        System.out.println("twocat " + catOrCats(2));
    }

    public String catOrCats(int numberOfCats){

        String output;

        output = numberOfCats > 1 ? "cats" : "cat";

        return output;
    }

    @Test
    public void ifAddHttp(){

        String url = "www.dsl.sk";

        if(!url.startsWith("http://")){
            url = addHttp(url);
        }

        Assert.assertEquals("http://www.dsl.sk", url);
    }

    @Test
    public void ifExercise(){
        boolean truthey = true;

        if(truthey == true){
            Assert.assertTrue(truthey);
            Assert.assertFalse(!truthey);
        }
    }

    @Test
    public void ifElseAddHttp(){

        String url = "www.dsl.sk";

        if(url.startsWith("http://")){
        }

        else{
            url = addHttp(url);
        }

        Assert.assertTrue(url.startsWith("http://"));
        Assert.assertEquals("http://www.dsl.sk", url);
    }

    @Test
    public void ifElseExercize(){

        boolean truthy = true;

        if(truthy == true) {
            Assert.assertTrue(truthy);
            Assert.assertFalse(!truthy);
        }
        else Assert.assertFalse(truthy);

    }

    @Test
    public void nestedIfElseExercise(){

        boolean truthy = false;
        boolean falsey =true;

        if(truthy == true){
            if(falsey == false){
                if(truthy == true && falsey == false){
                    if(truthy == true || falsey == true){
                        Assert.assertTrue(truthy);
                        Assert.assertFalse(falsey);
                        System.out.println("truthy is " + truthy + " and falsey is " + falsey);
                    }
                }
            }
            else {
                Assert.assertTrue(truthy);
                Assert.assertTrue(falsey);
                System.out.println("truthy is " + truthy + " and falsey is " + falsey);
            }
        }
        else{
            if(truthy == false){
                if(falsey == true){
                    Assert.assertFalse(truthy);
                    Assert.assertTrue(falsey);
                    System.out.println("truthy is " + truthy + " and falsey is " + falsey);
                }
                else{
                    Assert.assertFalse(truthy);
                    Assert.assertFalse(falsey);
                    System.out.println("truthy is " + truthy + " and falsey is " + falsey);
                }
            }
        }
    }

    @Test
    public void switchExample(){
        Assert.assertEquals("M", likelyGenderIs("sir"));
        Assert.assertEquals("M", likelyGenderIs("mr"));
        Assert.assertEquals("M", likelyGenderIs("master"));
        Assert.assertEquals("F", likelyGenderIs("miss"));
        Assert.assertEquals("F", likelyGenderIs("mrs"));
        Assert.assertEquals("F", likelyGenderIs("ms"));
        Assert.assertEquals("F", likelyGenderIs("lady"));
        Assert.assertEquals("F", likelyGenderIs("madam"));
    }

    public String likelyGenderIs(String title){

        String likelyGender;

        switch (title.toLowerCase()){
            case "sir":
                likelyGender = "M";
                break;
            case "mr":
                likelyGender = "M";
                break;
            case "master":
                likelyGender = "M";
                break;
            default:
                likelyGender = "F";
        }

        return likelyGender;
    }

    @Test
    public void switchExerciseShortCode(){
        Assert.assertEquals("United Kingdom", longName("UK"));
        Assert.assertEquals("United States", longName("US"));
        Assert.assertEquals("United States", longName("USA"));
        Assert.assertEquals("France", longName("FR"));
        Assert.assertEquals("Sweden", longName("SE"));
        Assert.assertEquals("Rest Of World", longName("SVK"));
        Assert.assertEquals("Rest Of World", longName("Us"));
        Assert.assertEquals("United Kingdom", longName("uK"));
        Assert.assertEquals("United Kingdom", longName("Uk"));
        Assert.assertEquals("United Kingdom", longName("uk"));
    }

    public String longName(String shortCode){

        String fullname;

        switch (shortCode){
            case "UK":
            case "Uk":
            case "uK":
            case "uk":
                fullname = "United Kingdom";
                break;
            case "US":
            case "USA":
                fullname = "United States";
                break;
            case "FR":
                fullname = "France";
                break;
            case "SE":
                fullname = "Sweden";
                break;
            default:
                fullname = "Rest Of World";
                break;
        }

        return fullname;

    }

    @Test
    public void switchExerciseInt(){
        Assert.assertEquals("One", intToString(1));
        Assert.assertEquals("Two", intToString(2));
        Assert.assertEquals("Three", intToString(3));
        Assert.assertEquals("Four", intToString(4));
        Assert.assertEquals("Too big", intToString(5));
        Assert.assertEquals("Too small", intToString(0));
    }

    public String intToString(int num){

        String str = null;

        if(num > 4){
            num = 5;
        }else if(num < 1){
            num = 0;
        }

        switch (num){
            case 1:
                str = "One";
                break;
            case 2:
                str = "Two";
                break;
            case 3:
                str = "Three";
                break;
            case 4:

                str = "Four";
                break;
            case 5:
                str = "Too big";
                break;
            case 0:
                str = "Too small";
                break;
        }

        return str;
    }

}
