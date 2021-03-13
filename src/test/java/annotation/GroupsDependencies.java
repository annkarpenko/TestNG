package annotation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupsDependencies {

    @Test
    public void createAccount (){
        System.out.println("Creation account");
        Assert.assertEquals(1,1);
    }

    @Test (dependsOnMethods = "createAccount")
     public void depositOpen (){
        System.out.println("deposit is opened");
        int a = 5 ;
        int b = 3;
        Assert.assertFalse(a==b);
    }

    @Test (dependsOnMethods = "createAccount")
    public void creditOpen (){
        System.out.println("credit is opened");
    }

    @Test
    public void recipientRequisites (){
        System.out.println("Get recipient requisites");
    }

    @Test (dependsOnMethods = "recipientRequisites")
    public void bankTransferPost(){
        System.out.println("Post transfer");
    }

    @Test (dependsOnMethods = "bankTransferPost")
    public void bankTransferDelete(){
        System.out.println("Delete transfer");
    }

}
