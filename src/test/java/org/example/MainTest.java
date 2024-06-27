package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest {
    @Test
    public void verifyMain() {
        Calc calc = new Calc();
        int expected = 3;
        int actual = calc.add(1, 2);
        Assert.assertEquals(actual, expected, "sum is unexpected");

    }
}