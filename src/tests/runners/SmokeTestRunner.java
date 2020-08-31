package tests.runners;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.junit.JunitDemo;
import tests.JunitDemo2;

//public class SmokeTestRunner {
    //Runner classes are the classes that can run
    //a specific number of tests
    //ex: choose only tests for smoke
    //ex: choose tests only for cart[amazon]
    //ex: choose tests pnly for login[amazon]

    @RunWith(Suite.class)
    @Suite.SuiteClasses({
            //List of test classes you want to run in this group
            //Test classes come from our project
            JunitDemo.class, //all tests within JunitDemo are going to be run, unless they are ignored.
            JunitDemo2.class, //all tests within JunitDemo2 are going to be run, unless a test is ignored
            //String1.class,
            //TestCompare.class,
    })
    public class SmokeTestRunner {

    }

