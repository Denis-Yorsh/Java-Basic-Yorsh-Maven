package com.hillel.hwYorsh16.CalculatorDouble;

import com.hillel.hwYorsh16.Calculators;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorsZeroTest {

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
    public void testCalculatePlusIsZero() {
        double actual = calculators.calculate(20, "+", 0);
        Assert.assertEquals(20, actual, 0.0);
    }

    @Test
    public void testCalculateMinusIsZeroo() {
        double actual = calculators.calculate(20, "-", 0);
        Assert.assertEquals(20, actual, 0.0);
    }

    @Test
    public void testCalculateMultiplyIsZero() {
        double actual = calculators.calculate(20, "*", 0);
        Assert.assertEquals(0, actual, 0.0);
    }

}