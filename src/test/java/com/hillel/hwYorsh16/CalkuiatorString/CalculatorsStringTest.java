package com.hillel.hwYorsh16.CalkuiatorString;

import com.hillel.hwYorsh16.Calculators;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorsStringTest {

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
    public void testCalculatesStringNull() {
        String actual = calculatorsString.calculate("5", null, "2");
        Assert.assertEquals("-1", actual);
    }

    @Test
    public void testCalculatesStringString() {
        String actual = calculatorsString.calculate("g", "/", "2");
        Assert.assertEquals("-1", actual);
    }
}