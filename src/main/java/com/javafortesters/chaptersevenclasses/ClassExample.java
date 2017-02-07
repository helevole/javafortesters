package com.javafortesters.chaptersevenclasses;

/**
 * Created by csabi on 2/6/17.
 */
public class ClassExample {
    public static final String CONSTANT = "a constant string";
    public static String aClassField = "a class field";
    protected static String proField = "a class field";
    public String pubfield ="a public field";
    private String privfield = "a private field";
    private String name;

    public ClassExample(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

}
