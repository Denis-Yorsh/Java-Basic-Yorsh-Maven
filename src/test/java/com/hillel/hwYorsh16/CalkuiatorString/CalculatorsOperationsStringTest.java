package com.hillel.hwYorsh16.CalkuiatorString;

import com.hillel.hwYorsh16.Calculators;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorsOperationsStringTest {

    Calculators calculatorsString;

    @Before
    public void setUp() throws Exception {
        calculatorsString = new Calculators();
        System.out.println("before");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("after");
    }

    @Test
    public void testCalculatePlus() {
        String actual = calculatorsString.calculate("20", "+", "10");
        Assert.assertEquals("30.0", actual);
    }

    @Test
    public void testCalculateMinus() {
        String actual = calculatorsString.calculate("20", "-", "10");
        Assert.assertEquals("10.0", actual);
    }

    @Test
    public void testCalculateMultiply() {
        String actual = calculatorsString.calculate("20", "*", "10");
        Assert.assertEquals("200.0", actual);
    }

    @Test
    public void testCalculateDivide() {
        String actual = calculatorsString.calculate("20", "/", "10");
        Assert.assertEquals("2.0", actual);
    }
}