package tests.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;




public class JunitDemo {
    // run button on the class level will run all of the tests
    // inside the class
    //Tests run in an alphabetical order of the method names
    //Rule(Best Testing Practise)  -- Tests must be independent
    //one result should not any how affect other test result


    @Test //gives me a result of the below method executed. If there are no failures


    //this test will be reported as passe
    public void test1(){  //run button on the test method level will run just a single test
        System.out.println("Test 1");
        System.out.println("Hello World");


    }
    @Test //when there is an issue in the method(Exceptions,Assertions)
    //Test will report a failure
    public void failingTestExample (){
        String str = "Hello";
        System.out.println("Failing test ");
        System.out.println(str);
        System.out.println(str.charAt(6));
    }
   @Test
    public void test3(){
      System.out.println("Test 3");
       System.out.println("Elon");
      System.out.println(5+10);
      System.out.println(100);
}
    @Before //will run once before every test
    //Hook is a keyword that represents @Before and @After Annotations
    //Hooks don't have test results
    //An error in the hook will cause an error of the test
    //even though Hooks and Tests are written separately.
    //Once run button is clicked they are treated as a single test.
    public void beforeHook(){
        System.out.println("About run a test");
        String str = "Hello";
        System.out.println(str.charAt(6));

}
    @Before
    public void beforeHook1(){

        System.out.println("Second Before");
}
    @After //Runs once after every test
    public void afterHook(){
       System.out.println("After Hook");
       System.out.println("Test execution completed");
   }


}

