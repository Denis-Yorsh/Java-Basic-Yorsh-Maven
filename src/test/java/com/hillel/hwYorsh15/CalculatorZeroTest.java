package com.hillel.hwYorsh15;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorZeroTest {

    Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
        System.out.println("before");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("after");
    }

    @Test
    public void testCalculatePlusIsZero() {
        double actual = calculator.calculate(20, "+", 0);
        Assert.assertEquals(20, actual, 0.0);
    }

    @Test
    public void testCalculateMinusIsZero() {
        double actual = calculator.calculate(20, "-", 0);
        Assert.assertEquals(20, actual, 0.0);
    }

    @Test
    public void testCalculateMultiplyIsZero() {
        double actual = calculator.calculate(20, "*", 0);
        Assert.assertEquals(0, actual, 0.0);
    }

    @Test
    public void testCalculateDivideIsZero() {
        double actual = calculator.calculate(0, "/", 50);
        Assert.assertEquals(-1, actual, 0.0);
    }

    @Test
    public void testCalculateDivideIsZeros() {
        double actual = calculator.calculate(50, "/", 0);
        Assert.assertEquals(-1, actual, 0.0);
    }

    @Test
    public void testCalculateDivideIsZiroPlus() {
        double actual = calculator.calculate(+30, "/", 0);
        Assert.assertEquals(-1, actual, 0.0);
    }

    @Test
    public void testCalculateDivideIsZiroMinus() {
        double actual = calculator.calculate(-50, "/", 0);
        Assert.assertEquals(-1, actual, 0.0);
    }
}