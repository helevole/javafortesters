package com.javafortesters.chap007.examples;

import com.javafortesters.chaptersevenclasses.ClassExample;
import com.javafortesters.chaptersevenclasses.MiscMethods;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


/**
 * Created by HeleVole on 30-Jan-17.
 */
@SuppressWarnings("deprecation")
public class MiscTest {

    @Test
    public void aJavaDocComment(){

        MiscMethods misc = new MiscMethods();

        assertTrue(misc.addTwoNumbers(5, 7)==12);
    }

    @Test
    public void variableNaming(){
        String $aString="bob";
        float £owed=10F;
        int aMount=4;
        long Amount=5;
        String A0123456789bCd$f="ugh";
        assertEquals(4,aMount);
        assertEquals(5, Amount);
        assertEquals(10.0F, £owed, 0);
        assertEquals("bob", $aString);
        assertEquals("ugh", A0123456789bCd$f);
    }

    @Test
    public void canCompareClassField(){
        assertEquals("the string value should be as expected", "a class field", ClassExample.aClassField);
    }

    @Test
    public void canChangeClassField(){
        ClassExample instance = new ClassExample("name");

        instance.aClassField = "changed";

        assertEquals("the value of the class field should be changed", "changed", instance.aClassField);

        assertEquals("the value of the public field is the initially assigned one", "a public field", instance.pubfield);

        instance.pubfield = "amended public field";

        assertEquals("the value of the public field has been amended", "amended public field", instance.pubfield);
    }

    @Test public void booleanType(){

        Boolean truthey = true;
        Boolean falsey = false;

        assertTrue(truthey);
        assertFalse(falsey);

        truthey = Boolean.FALSE;
        falsey = Boolean.TRUE;

        assertTrue(falsey);
        assertFalse(truthey);

    }

    @Test
    public void integerTypes(){

        byte aByteHas1Byte;
        short aShortHas2Bytes;
        int anIntHas4Bytes;
        long aLongHas8Bytes;

        System.out.println(
            "* 'byte' range: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE
        );

        System.out.println(
                "* 'short' range: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE
        );

        System.out.println(
                "* 'int' range: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE
        );

        System.out.println(
                "* 'long' range: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE
        );

        aByteHas1Byte = 0b1010;
        assertEquals(10, aByteHas1Byte);

        aShortHas2Bytes = 0xAF;
        assertEquals(175, aShortHas2Bytes);



        aLongHas8Bytes = 13_132_465_798L;
        assertEquals(13132465798L, aLongHas8Bytes);

    }
    @Test
    public void floatingPointType(){

        float singlePrecision32bit;
        double doublePrecision64bit;

        System.out.println(
                "* 'float' range: " + Float.MIN_VALUE + " to " + Float.MAX_VALUE
        );

        System.out.println(
                "* 'Double' range: " + Double.MIN_VALUE + " to " + Double.MAX_VALUE
        );

        singlePrecision32bit = 26.31F;
        assertEquals(26.31F, singlePrecision32bit, 0.0F);

        doublePrecision64bit = 652.49;
        assertEquals(652.49, doublePrecision64bit, 0.0);
    }

    @Test
    public void characterType(){

        char aChar = '\u0040';
        assertEquals("compare hex value with char", '@', aChar);
    }

    @Test
    public void traditionalOperatorsExplored(){
        assertEquals(15, 3 + 12);
        assertEquals(43, 95 - 52);
        assertEquals(7.5F, 2.5F * 3.0F, 0);
        assertEquals(1.2, 3 / 2.5, 0);
        assertEquals("ab" + "cd", "abcd");
        assertEquals(4, 74%5);
    }

    @Test
    public void assignmentOperatorsExplored(){

        String ab = "ab";
        assertEquals("ab", ab);

        int num = 10;
        assertEquals(10, num);

        num += 13;
        assertEquals(23, num);

        num -= 5;
        assertEquals(18, num);

        num *= 2;
        assertEquals(36, num);

        num /= 4;
        assertEquals(9, num);

        num %= 5;
        assertEquals(4, num);
    }

    @Test
    public void incrementDecrementOperatorsExplored(){
        int num = 10;

        assertEquals(11, ++num);
        assertEquals(11, num);

        assertEquals(11, num++);
        assertEquals(12, num);

        assertEquals(11, --num);
        assertEquals(11, num);

        assertEquals(11, num--);
        assertEquals(10, num);
    }

    @Test
    public void booleanOperatorsExplored(){
        assertTrue(26 == 26);
        assertTrue(25 < 26);
        assertFalse(26 < 25);

    }
}
