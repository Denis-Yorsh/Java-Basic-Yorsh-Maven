package com.hillel.hwYorsh16.CalculatorDouble;

import com.hillel.hwYorsh16.Calculators;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorsNegativeNumberTest {

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
    public void testCalculatePlusNegative() {
        double actual = calculators.calculate(-20, "+", -10);
        Assert.assertEquals(-30, actual, 0.0);
    }

    @Test
    public void testCalculateMinusNegative() {
        double actual = calculators.calculate(-20, "-", -10);
        Assert.assertEquals(-10, actual, 0.0);
    }

    @Test
    public void testCalculateMultiplyNegative() {
        double actual = calculators.calculate(-20, "*", -10);
        Assert.assertEquals(200, actual, 0.0);
    }

    @Test
    public void testCalculateDivideNegative() {
        double actual = calculators.calculate(-20, "/", -10);
        Assert.assertEquals(2, actual, 0.0);
    }

    @Test
    public void testCalculatePlusPositiveNegative() {
        double actual = calculators.calculate(20, "+", -10);
        Assert.assertEquals(10, actual, 0.0);
    }

    @Test
    public void testCalculateMinusPositiveNegative() {
        double actual = calculators.calculate(20, "-", -10);
        Assert.assertEquals(30, actual, 0.0);
    }

    @Test
    public void testCalculateMultiplyPositiveNegative() {
        double actual = calculators.calculate(20, "*", -10);
        Assert.assertEquals(-200, actual, 0.0);
    }

    @Test
    public void testCalculateDividePositiveNegative() {
        double actual = calculators.calculate(20, "/", -10);
        Assert.assertEquals(-2, actual, 0.0);
    }
}