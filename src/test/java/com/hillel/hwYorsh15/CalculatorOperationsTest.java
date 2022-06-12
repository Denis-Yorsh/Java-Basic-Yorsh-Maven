package com.hillel.hwYorsh15;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorOperationsTest {

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
    public void testCalculatePlus() {
        double actual = calculator.calculate(20, "+", 10);
        Assert.assertEquals(30, actual, 0.0);
    }

    @Test
    public void testCalculateMinus() {
        double actual = calculator.calculate(20, "-", 10);
        Assert.assertEquals(10, actual, 0.0);
    }

    @Test
    public void testCalculateMultiply() {
        double actual = calculator.calculate(20, "*", 10);
        Assert.assertEquals(200, actual, 0.0);
    }

    @Test
    public void testCalculateDivide() {
        double actual = calculator.calculate(500, "/", 10);
        Assert.assertEquals(50, actual, 0.0);
    }
}