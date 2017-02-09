package com.javafortesters.chap008.examples;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by csabi on 2/8/17.
 */
public class SelectionDecision {

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
}
