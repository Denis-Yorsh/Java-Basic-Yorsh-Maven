package com.hillel.hwYorsh16;

import org.junit.Assert;
import org.junit.Test;

import static com.hillel.hwYorsh16.Operations.*;

public class EnumOperationsTest {

    @Test
    public void testConvertPlus() {
        Operations actual = Operations.convert("+");
        Assert.assertEquals(PLUS, actual);
    }

    @Test
    public void testConvertMinus() {
        Operations actual = Operations.convert("-");
        Assert.assertEquals(MINUS, actual);
    }

    @Test
    public void testConvertMultiply() {
        Operations actual = Operations.convert("*");
        Assert.assertEquals(MULTIPLY, actual);
    }

    @Test
    public void testConvertDivide() {
        Operations actual = Operations.convert("/");
        Assert.assertEquals(DIVIDE, actual);
    }

    @Test
    public void testConvertDivideTwoSymbol() {
        Operations actual = Operations.convert("++");
        Assert.assertEquals(null, actual);
    }

    @Test
    public void testConvertDivideNull() {
        Operations actual = Operations.convert(null);
        Assert.assertEquals(null, actual);
    }
}