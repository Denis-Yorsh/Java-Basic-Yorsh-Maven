package com.hillel.hwYorsh15;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorNegativeNumberTest {

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
    public void testCalculatePlusNegative() {
        double actual = calculator.calculate(-20, "+", -10);
        Assert.assertEquals(-30, actual, 0.0);
    }

    @Test
    public void testCalculateMinusNegative() {
        double actual = calculator.calculate(-20, "-", -10);
        Assert.assertEquals(-10, actual, 0.0);
    }

    @Test
    public void testCalculateMultiplyNegative() {
        double actual = calculator.calculate(-20, "*", -10);
        Assert.assertEquals(200, actual, 0.0);
    }

    @Test
    public void testCalculateDivideNegative() {
        double actual = calculator.calculate(-500, "/", -10);
        Assert.assertEquals(50, actual, 0.0);
    }

    @Test
    public void testCalculatePlusPositiveNegative() {
        double actual = calculator.calculate(230, "+", -310);
        Assert.assertEquals(-80, actual, 0.0);
    }

    @Test
    public void testCalculateMinusPositiveNegative() {
        double actual = calculator.calculate(230, "-", -130);
        Assert.assertEquals(360, actual, 0.0);
    }

    @Test
    public void testCalculateMultiplyPositiveNegative() {
        double actual = calculator.calculate(230, "*", -130);
        Assert.assertEquals(-29900, actual, 0.0);
    }

    @Test
    public void testCalculateDividePositiveNegative() {
        double actual = calculator.calculate(50, "/", -310);
        Assert.assertEquals(-0.16129032258064516, actual, 0.0);
    }
}