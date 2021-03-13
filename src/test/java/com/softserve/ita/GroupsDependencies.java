package com.softserve.ita;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsDependencies {

    @BeforeGroups("Product")
    public void setupPersonalData() {
        System.out.println("START: Setup personal data for registration PRODUCT");
    }

    @BeforeGroups("CashTransactions")
    public void setupWelcomeMessage() {
        System.out.println("START: CashTransactions");
    }

    @AfterGroups("Product")
    public void clearPersonalData(){
        System.out.println("FINISHED: Personal data are cleaned");
        System.out.println("=========================");
    }

    @Test(groups = {"Product"})
    public void createAccountTest (){
        System.out.println("Creation account");
        //Assert.assertEquals(1,1);
    }

   @Test (dependsOnMethods = "createAccountTest", groups = { "Product"})
     public void depositOpenTest (){
        System.out.println("Deposit is opened");
    }

   @Test (dependsOnMethods = "createAccountTest", groups = { "Product"})
    public void creditOpenTest (){
        System.out.println("Credit is opened");
    }

    @Test (groups = {"CashTransactions"})
    public void recipientRequisitesTest (){
        System.out.println("Get recipient requisites from client");
    }

    @Test (dependsOnMethods = "recipientRequisitesTest", groups = {"CashTransactions"})
    public void bankTransferPostTest(){
        System.out.println("Transfer has been posted");
    }

    @Test (dependsOnMethods = "recipientRequisitesTest", groups = {"CashTransactions"})
    public void bankTransferDeleteTest(){
        System.out.println("Delete transfer");
    }

}
