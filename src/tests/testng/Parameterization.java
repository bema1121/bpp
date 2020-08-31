package tests.testng;

import org.junit.runners.Parameterized;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class Parameterization {

    //run same test against different set of data
    //ex: Login
    //positive ->
    //johndoe@gmail.com
    //v3ryh@rdpa$$
    //johndoe
    //123fggr

//    @Test
//    public void loginPositiveTest(){
//        System.out.println("johndoe@gmail.com");
//        System.out.println("v3ryh@rdpa$$");
//    }
//
//    @Test
//    public void loginNegativeTest2(){
//        System.out.println("johndoe");
//        System.out.println("wrongPass");
//    }
//
//    @Test
//    public void loginNegativeTest3(){
//        System.out.println("johndoe@gmail.com");
//        System.out.println("wrongPass");
//    }
//
    //Parameterization
    //Lets us run the same test against the data given in xml file.
    //Only one data can be provided and the test can only run against different
    //so if the test_framework user wanted to run
    //set of data they would have to manually change the data for test run
    @BeforeSuite
    @Parameters("browser")
    public static void beforeSuite(String browser){
        //All test configs are usually set up in BeforeSuite  hook
        //in order to provide params from xml we need to make sure parameter tag in xml
        //is declared as a direct child of suite tag;
        System.out.println("Before Suite");
        System.out.println(browser);
    }

    @Test
    //param must match the ones in xml file
    @Parameters({"userName","password"})
    public void loginNegativeTest3(String user, String pass) {
        System.out.println(user);
        System.out.println(pass);
    }

    @Test
    @Parameters({"quantity","price","isPrime"})
        public void testWithDoubleDataType(int quantity, double price, boolean isPrime){
        //I want to print out quantity * price
        //and is prime values

        System.out.println(quantity*price);
        //System.out.println(price);
        //System.out.println(isPrime);

    }

    //in the real world.
    //Groups
    //Parameterization: In Selenium we set the tests only once,
    //and in testNG xml we declare
    //parameters names: browser, value is one of chrome, firefox, safari
    //parameter name: environment, value, qa, integration, dev, uat.

    }
