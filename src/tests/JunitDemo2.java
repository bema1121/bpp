package tests;

import org.junit.*; //this configurable

//Run all of the tests in JUnit Demo2 class
public class JunitDemo2 {

    @BeforeClass//runs only once before the whole test execution of the class.
    // (BeforeClass runs once before the whole test suite)
    //Before Class annotation method should be static.

    public static void beforeClassHook() {
        System.out.println("Before Class");

    }
     // if first steps of every test repeating we use @Before and put those steps here.

    @Before
    //Start from amazon.com
    //login with username
    public void beforeHook() {
        System.out.println("Before");
    }

    //Can you please tell me how write a test method?
    @Test(timeout = 0) //=> Test annotations
    public void test1() {
        System.out.println("Test 1");
    }

    @Test //Run a single test separately
    public void test2() {
        System.out.println("Test 2");
        System.out.println("XXX".charAt(4));
    }

    @Ignore //this annotations is used to ignore a test. Usually we
    //ignore tests that are very low priority and non critical
    //so that we come fixing at a later time

    @Test
    public void test3() {
        System.out.println("Test 3");
        System.out.println("XXX".charAt(4));
        System.out.println("Test 3 - After Exception");
    }

    @Test
    public void test4() {
        System.out.println("Test 4");
        int num1 = 10;
        int num2 = 20;
        int sum = num1 + num2; //testing javas plus functionality

        //assertEquals method has many overloaded version
        //method with same name but different params. What is method overloading.
        //long, long
        //int, int
        //String,String
        //compare Apples to apples
        //don't compare apples to oranges
        //assertEquals takes expected result first actual result next.
        //expected result comes from requirements.
        Assert.assertEquals(30, sum);

    }

    @Test
    public void test5() {
        System.out.println("Test 5");
        String str = "DevX School";
        String str2 = str.substring(5); //we don't see the implementation of the method.(we just don;t care what implementation is

        Assert.assertEquals("School", str2);
    }

    @Test
    public void indexOfTest() {
        System.out.println("Test 6");
        String str = "Hello World";
        //requirement of the indexOf method. => what does indexOf method do?

        int index = str.indexOf("World");
        //Assert.assertEquals(6,6); 6,6 is hard coded comparison of results and it does not
        //ever fail.

        Assert.assertEquals(6, index); //Expected result will come from your manual calculation
        //according to BRD
    }


    @Test
    public void charAtTest() {
        System.out.println("Test 7");
        String str = "John Doe";
        char charAsk = str.charAt(4);
        Assert.assertEquals('D',charAsk); //D from ASCII table => 68

    }
    @Test
    public void toUpperCaseTest() {
        System.out.println("Test 8 ");
        String str = "Donald Trump";              //test data
        String actualResult = str.toUpperCase(); //actual result comes from the method you are testing
        Assert.assertEquals("DONALD TRUMP", actualResult); //expected result what
        //that method is supposed to do => just hard code

    }
    //we can have multiple assertions in one test. --> All methods in Assert
    //class are hard assertions
    //test run only until the end of the test or first hard assertions failure
    //A lot of the times the methods require multiple validations
    @Test
    public void test9(){
        System.out.println("Test 9");
        Assert.assertEquals(10,10);
        Assert.assertEquals("ello","Hello");  //Failed her -> report of this line
        Assert.assertEquals('a','a');         //Skipped
    }
    //All assertion method can take String as a very first param
    //that String will be a message of the assertion -> which will be printed out when the test  fails
    //which help us to get an instant grasp(understanding) which test(feature) failed
    //super helpful when working with a large set of tests.(1000 test cases)
    @Test
    public void test10(){
        System.out.println("Test 10");
        String str = "DevX School";
        String actualResult = str.replace('e','-');
        Assert.assertEquals("String replace method failure","DvX School", actualResult);
        //Error message comes only in case of failure.
    }
    @Test
    public void test11(){
        System.out.println("Test 11");
        StringBuilder sb = new StringBuilder("Hello World");
        int actualResult = sb.lastIndexOf("o");
        Assert.assertEquals("StringBuilder lastIndexOf method failure",6,actualResult);

    }
    @Test
    public void test12(){
        System.out.println("Test 12");
        String str = "Hello";
        boolean actualResult = str.isEmpty();
        Assert.assertTrue(true); //AssertTrue passes when the boolean is true.
        Assert.assertFalse("isEmpty method is failure" ,actualResult);//AssertFalse passes when the boolean is false.
    }

        @After
    public void afterHook() {
        System.out.println("After Hook");
    }

    @AfterClass
    public static void afterClassHook() {
        System.out.println("After Class Hook");
    }
    /*
    Junit:
    Testing framework to write unit tests. (Original purpose it was created)
    SDET - we barrow a lot of the devs tools. SDET and Devs share 80-90% tools.
    Unit test -
    Test performed on a single method.
    Junit is the most popular open source JAVA testing framework that is used to automate unit tests. In other words we can test java methods of the application under test.
    Junit provides an ability to execute tests in a easy manner by using Junit Annotations like @Test, @Before, @After etc. Annotatinons must put over the test in order for java to recognize the method as a Junit Test.
    Unit tests  - are the lowest level of automated tests performed in the application source code.
    Best testing practices:
    1. Tests should written in a way that they should have scenario for failure.
        Dont write tests which always pass.
    When does a junit test method fail?
    1. When we have exceptions thrown from that method.
    2. When the test results do not match(expected not matched with actual result). AKA  - Assertion error.
    One test failure in 100 tests will cause the final test result of 100 tests to be red(Failed).
    Compile time error in just one class in the whole project with 1000 classes will not allow the project to compile and be built.
     */
}


