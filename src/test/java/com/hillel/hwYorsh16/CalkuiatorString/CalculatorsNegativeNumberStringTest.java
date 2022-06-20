package com.hillel.hwYorsh16.CalkuiatorString;

import com.hillel.hwYorsh16.Calculators;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorsNegativeNumberStringTest {

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
    public void testCalculatePlusNegative() {
        String actual = calculatorsString.calculate("-20", "+", "-10");
        Assert.assertEquals("-30.0", actual);
    }

    @Test
    public void testCalculateMinusNegative() {
        String actual = calculatorsString.calculate("-20", "-", "-10");
        Assert.assertEquals("-10.0", actual);
    }

    @Test
    public void testCalculateMultiplyNegative() {
        String actual = calculatorsString.calculate("-20", "*", "-10");
        Assert.assertEquals("200.0", actual);
    }

    @Test
    public void testCalculateDivideNegative() {
        String actual = calculatorsString.calculate("-20", "/", "-10");
        Assert.assertEquals("2.0", actual);
    }

    @Test
    public void testCalculatePlusPositiveNegative() {
        String actual = calculatorsString.calculate("20", "+", "-10");
        Assert.assertEquals("10.0", actual);
    }

    @Test
    public void testCalculateMinusPositiveNegative() {
        String actual = calculatorsString.calculate("20", "-", "-10");
        Assert.assertEquals("30.0", actual);
    }

    @Test
    public void testCalculateMultiplyPositiveNegative() {
        String actual = calculatorsString.calculate("20", "*", "-10");
        Assert.assertEquals("-200.0", actual);
    }

    @Test
    public void testCalculateDividePositiveNegative() {
        String actual = calculatorsString.calculate("20", "/", "-10");
        Assert.assertEquals("-2.0", actual);
    }
}