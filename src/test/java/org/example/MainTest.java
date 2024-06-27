package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MainTest {
    @Test
    public void verifyMain() {
        int i = 4;
        int j = 6;
        int sum = j+i;
        Assert.assertEquals(sum,10);

    }
}