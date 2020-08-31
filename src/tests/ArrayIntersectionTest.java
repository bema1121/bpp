package tests;

import homeWorks.Readcode.Intersection;
import org.junit.Assert;
import org.junit.Test;

public class ArrayIntersectionTest {
    Intersection in = new Intersection();

    //intersection method should take 2 int arrays
    //and return an array with
    //the matching values in both arrays
    //if any of the arrays are empty return null;
    //if there are no matching values in neither of the arrays then
    //return empty array.
    //if any of the arrays is null return null;

    //DONT USE - return empty array -- I ASSUME.

    @Test
    public void twoEmptyArraysTest() {
        //arr1 = {}
        //arr2 = {}
        Intersection in = new Intersection();
        int[] arr1 = {};
        int[] arr2 = {};
        int[] expected = null;
        int[] actual = in.intersection(arr1, arr2);
        Assert.assertArrayEquals("Two arrays are empty failure", expected, actual);
    }
    @Test
    public void oneEmptyArrayTest() {
        //arr1 = {}
        //arr2 = {22};
        Intersection in = new Intersection();
        int[] arr1 = {};
        int[] arr2 = {22};
        int[] expected = null;
        int[] actual = in.intersection(arr1, arr2);
        Assert.assertArrayEquals("One Array Empty test Failure", expected, actual);
    }
    @Test
    public void oneEmptyArrayTest2() {
        //arr1 = {44}
        //arr2 = {};
        Intersection in = new Intersection();
        int[] arr1 = {44};
        int[] arr2 = {};
        int[] expected = null;
        int[] actual = in.intersection(arr1, arr2);
        Assert.assertArrayEquals("One Array Empty test Failure", expected, actual);
    }

    @Test
    public void noMatchingValuesTest() {
        //arr1 = {20,24}
        //arr2 = {2}
        int[] arr1 = {20, 24};
        int[] arr2 = {2};
        int[] expected = {};
        int[] actual = in.intersection(arr1, arr2);
        Assert.assertArrayEquals("No matching values test failure", expected, actual);
    }
    @Test
    public void twoMatchingValuesTest() {
        //arr1 = {10, 5, 25, 4}
        //arr2 = {3, 4, 60, 10}
        int[] arr1 = {10, 5, 25, 4};
        int[] arr2 = {3, 4, 60, 10};
        int[] expected = {10, 4};
        int[] actual = in.intersection(arr1, arr2);
        //assertEquals => expected == actual. For objects assertEquals compares hashCode.
        //we can loop trough an expected and actual arrays and compare each value in each index.
        //do we have a method that compare the values of arrays?
        Assert.assertArrayEquals("two Matching Values Test Failure",expected,actual);


    }
    @Test
    public void oneArrayIsNull(){
        //arr1 = null;
        //arr2 = {223,445}
        int [] arr1 = null;//null means object doesnt exist.
        int[] arr2 = {223, 445};
        //When your variable is pointing to null, any attempt to use "." for the variable will cause a NullPointerException.
        int[] expected = null;
        int[] actual = in.intersection(arr1, arr2);
        //when your test fails due to runtime exceptions like NullPointerException before doing the assertions
        //that test is invalid.
        // We need to fix the test so that it fails on assertion only, not anywhere else.
        // And if it does fail before assertion, it should be due to application error.(exceptions coming from dev code).
        //Our test framework has a problem.
        //What do you do when a test case in the framework fails?
        //1. I rerun the test by itself.
        //2. Find if the test is failing due to assertion or before assertion.
        //3. if before assertion I have to fix the test on my side(test framework side)
        //4. If in assertion I have to make sure the expected result of the test is valid.
        //5. and if the expected result is valid and actual result is not per requirements.
        //6. I report the bug.

        //Check if the actual result is null.
        Assert.assertNull("First array is null failure", actual);


    }

    //Task: fix Intersection method so that all tests in ArrayIntersectionTests pass.
    //Add more test cases. (edge case) get creative

}
