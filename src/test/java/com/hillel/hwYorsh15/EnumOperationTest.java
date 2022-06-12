package com.hillel.hwYorsh15;

import org.junit.Assert;
import org.junit.Test;

import static com.hillel.hwYorsh15.Operation.*;

public class EnumOperationTest {

    @Test
    public void testConvertPlus() {
        Operation actual = Operation.convert("+");
        Assert.assertEquals(PLUS, actual);
    }

    @Test
    public void testConvertMinus() {
        Operation actual = Operation.convert("-");
        Assert.assertEquals(MINUS, actual);
    }

    @Test
    public void testConvertMultiply() {
        Operation actual = Operation.convert("*");
        Assert.assertEquals(MULTIPLY, actual);
    }

    @Test
    public void testConvertDivide() {
        Operation actual = Operation.convert("/");
        Assert.assertEquals(DIVIDE, actual);
    }

    @Test
    public void testConvertDivideTwoSymbol() {
        Operation actual = Operation.convert("++");
        Assert.assertEquals(null, actual);
    }

    @Test
    public void testConvertDivideNull() {
        Operation actual = Operation.convert(null);
        Assert.assertEquals(null, actual);
    }
}