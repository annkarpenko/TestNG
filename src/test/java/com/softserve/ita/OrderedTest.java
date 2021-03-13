package com.softserve.ita;

import org.testng.annotations.Test;

public class OrderedTest {

    @Test(priority = 3)
    public void thirdTest() {
        System.out.println("Test Case - 3");
    }

    @Test (priority = 2)
    public void secondTest() {
        System.out.println("Test Case - 2");
    }

    @Test (priority = 1)
    public void firstTest() {
        System.out.println("Test Case - 1");
    }


}
