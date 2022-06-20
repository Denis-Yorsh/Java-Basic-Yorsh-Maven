package com.hillel.hwYorsh16.CalkuiatorString;

import com.hillel.hwYorsh16.Calculators;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorsZeroStringTest {

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
    public void testCalculatePlusIsZero() {
        String actual = calculatorsString.calculate("20", "+", "0");
        Assert.assertEquals("20.0", actual);
    }

    @Test
    public void testCalculateMinusIsZeroo() {
        String actual = calculatorsString.calculate("50", "-", "0");
        Assert.assertEquals("50.0", actual);
    }

    @Test
    public void testCalculateMultiplyIsZero() {
        String actual = calculatorsString.calculate("50", "*", "0");
        Assert.assertEquals("0.0", actual);
    }

    @Test
    public void testCalculatesStringNull() {
        String actual = calculatorsString.calculate("50", null, "0");
        Assert.assertEquals("-1", actual);
    }

    @Test
    public void testCalculateDivideIsZeros() {
        calculatorsString.calculate("50", "/", "0");
    }
}