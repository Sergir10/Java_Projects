package com.udea.app.roman;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Sergir10 on 6/5/2016.
 */
public class MainTest {
    @Test // Verificando que el número sea 1
    public void romanToDecimal() throws Exception {
        String number = Main.romanToDecimal("I");
        assertEquals(number, "1");
    }

    @Test // Verificando que el número sea 2
    public void test2() throws Exception {
        String number = Main.romanToDecimal("II");
        assertEquals(number, "2");
    }

    @Test // Verificando que de 4
    public void test3() throws Exception {
        String number = Main.romanToDecimal("IV");
        assertEquals(number, "4");
    }

    @Test // Verificando que de 19
    public void test4() throws  Exception {
        String number = Main.romanToDecimal("XIX");
        assertEquals(number, "19");
    }

    @Test // Verificando que de 49
    public void test5() throws Exception {
        String number = Main.romanToDecimal("XLIX");
        assertEquals(number, "49");
    }

    @Test // Verificando el 99
    public void test6() throws  Exception {
        String number = Main.romanToDecimal("XCIX");
        assertEquals(number, "99");
    }

    @Test
    public void test7() throws Exception {
        String number = Main.romanToDecimal("CD");
        assertEquals(number, "400");
    }

    @Test
    public void test8() throws Exception {
        String number = Main.romanToDecimal("CDXCIX");
        assertEquals(number, "499");
    }

    @Test
    public void test9() throws Exception {
        String number = Main.romanToDecimal("CM");
        assertEquals(number, "900");
    }

    @Test
    public void test10() throws Exception {
        String number = Main.romanToDecimal("CMXCIX");
        assertEquals(number, "999");
    }
}