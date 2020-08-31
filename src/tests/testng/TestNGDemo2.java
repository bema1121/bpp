package tests.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNGDemo2 {

    //How do you ignore test cases in the suite?
    @Test(enabled = false)//Same as @Ignore annotation.
    public void test1(){

        System.out.println("Test 1 in TestNG Demo");
    }
    @Ignore
    @Test
    public void test2() {

        System.out.println("Test 2 in TestNG Demo");
    }
    //TestNg doesnt report the ignored tests.

}
