package com.softserve.ita;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ArticleTest {

    @BeforeMethod
    public void setUp(){
        System.out.println("START: SetUp method has been called ");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("FINISHED: Test has been finished");
        System.out.println("================================");
    }

    @Test
    public void firstTest () {
        System.out.println("It`s the first test");
    }

    @Test
    public void secondTest () {
        System.out.println("It`s the second test");
    }






}
