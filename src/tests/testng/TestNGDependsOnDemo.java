package tests.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGDependsOnDemo {

    //TestNG has an ability to run a test based on the result of another test
    //dependsOnMethods -> will ensure that the test runs only after the test it depends on
    //dependsOnMethods -> will ensure that the test runs only after the test it depends on passes.
    //Every test should be self independent, no dependencies on other test results.
    //False reporting -> 2 failures when there actually was only one failure.

    @Test(dependsOnMethods = {"test2"}, groups = {"regression"})
    public void printMessageTest()
    {
        System.out.println("Test PrintMessage");
    }

    @Test(groups = {"regression"})
    public void test2() {
        System.out.println("Depends on demo test 2");
        Assert.fail();
    }
    @Test(dependsOnMethods = {"differentTest"})
    public void test3() {
        System.out.println("Depends on demo test 3");
    }
    @Test
    public void differentTest(){

        System.out.println("Different Tests");
    }
}


