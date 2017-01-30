package com.javafortesters.chaptersevenclasses;

/**
 * Created by HeleVole on 30-Jan-17.
 */
public class MiscMethods {
    private Integer firstnumber;
    private Integer secondnumber;

    /**
     * Add firstnumber
     * to secondnumber
     */
    public Integer addTwoNumbers(Integer firstnumber, Integer secondnumber){

        this.firstnumber = firstnumber;
        this.secondnumber = secondnumber;

        return firstnumber + secondnumber;

    }
}
