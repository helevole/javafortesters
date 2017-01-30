package com.javafortesters.chap007.examples;

import com.javafortesters.chaptersevenclasses.MiscMethods;
import org.junit.Test;

import static org.junit.Assert.assertTrue;


/**
 * Created by HeleVole on 30-Jan-17.
 */
public class MiscTests {

    @Test
    public void aJavaDocComment(){

        MiscMethods misc = new MiscMethods();

        assertTrue(misc.addTwoNumbers(5, 7)==12);
    }

}
