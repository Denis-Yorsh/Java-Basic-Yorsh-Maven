package com.hillel.hwYorsh16.CalculatorDouble;

import com.hillel.hwYorsh16.Calculators;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorsZeroDoubleTest {

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
    public void testCalculatesStringNull() {
        double actual = calculators.calculate(50, null, 0);
        Assert.assertEquals(-1, actual, 0.0);
    }

    @Test
    public void testCalculateDivideIsZeros() {
        calculators.calculate(45, "/", 0);
    }
}