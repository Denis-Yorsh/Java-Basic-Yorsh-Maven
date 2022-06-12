package com.hillel.hwYorsh15;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorOperationsStringTest {

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
    public void testCalculateStringOperation() {
        double actual = calculator.calculate(500, "/+", 10);
        Assert.assertEquals(-1, actual, 0.0);
    }

    @Test
    public void testCalculateStringNull() {
        double actual = calculator.calculate(500, "null", 10);
        Assert.assertEquals(-1, actual, 0.0);
    }
}