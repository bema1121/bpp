package tests.runners;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.ArrayIntersectionTest;
import tests.junit.*;
import tests.JunitDemo2;


@RunWith(Suite.class)
    @Suite.SuiteClasses({


            JunitDemo.class,
            JunitDemo2.class,
            ArrayIntersectionTest.class,
            String1.class,
            TestCompare.class,
            TestConverter.class,
            //We can have classes with the same name in different packages.
            //if the same package classes with duplicate names are not allowed


    })
      public class RegressionTestRunner {
         @BeforeClass
         public static void setUp(){
             System.out.println();
         }

     }