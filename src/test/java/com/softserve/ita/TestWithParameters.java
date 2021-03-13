package com.softserve.ita;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestWithParameters {

    @Parameters({"level", "description"})
    @Test
    public void levelTest (String level, String description) {
        System.out.println("Level : " + level + " - " + description );
    }


    @Test(dataProvider = "getData")
    public void directionsDataProviderTest (String code, String name) {
        System.out.println("Direction: " + code + " - " + name);
    }

    @DataProvider
    public Object[][] getData() {
        return new Object[][]{
                {"BE", "Back-end"},
                {"UI", "Front-end"},
                {"QC", "Tester"}
        };

    }

}
