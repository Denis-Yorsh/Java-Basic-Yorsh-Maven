package com.hillel.hwYorsh16.CalculatorDouble;

import com.hillel.hwYorsh16.Calculators;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorsOperationsTest {

    Calculators calculators;

    @Before
    public void setUp() throws Exception {
        calculators = new Calculators();
        System.out.println("before");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("after");
    }

    @Test
    public void testCalculatePlus() {
        double actual = calculators.calculate(20, "+", 10);
        Assert.assertEquals(30, actual, 0.0);
    }

    @Test
    public void testCalculateMinus() {
        double actual = calculators.calculate(50, "-", 10);
        Assert.assertEquals(40, actual, 0.0);
    }

    @Test
    public void testCalculateMultiply() {
        double actual = calculators.calculate(50, "*", 2);
        Assert.assertEquals(100, actual, 0.0);
    }

    @Test
    public void testCalculateDivide() {
        double actual = calculators.calculate(50, "/", 2);
        Assert.assertEquals(25, actual, 0.0);
    }
}