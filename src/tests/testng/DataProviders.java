package tests.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import sessions.Palindrome;

public class DataProviders {

    //DataProviders are used to run one test against multiple test data
    //Object array can store any value except primitives in Java use wrappers in this case.

    @DataProvider(name = "loginTestData")
    public static Object[][] loginTestDataMethod() {
        return new Object[][]{
                {"johndoe@gmail.com", "123pass"},
                {"johnDoe", "333pass"},
                {"johnDoe@gmail.com", "a"},
                {"johndoe@gmail.com", "0078"}};

    }

    @DataProvider(name = "palindromeTestData")
    public static Object[][] testData2() {
        return new Object[][]{{"kayak", "true"}, {"NotKayak", "false"}, {"Kayak", "false"}};


    }

    @Test(dataProvider = "loginTestData")
    public void loginTest(String userName, String password) {
        System.out.println("userName " + userName);
        System.out.println("password " + password);
    }

    @Test(dataProvider = "palindromeTestData")
    public void isPalindromeTest(String word, Boolean expectedIsTrue) {
        Palindrome p = new Palindrome();
        System.out.println(p.isPalindrome(word));
        //Assert.assertEquals(p.isPalindrome(word),expected),"Palindrome invalid result");
        if (expectedIsTrue) {
            Assert.assertTrue(p.isPalindrome(word), "Palindrome invalid result, " + word +
                    " should be palindrome ");
        } else {
            Assert.assertFalse(p.isPalindrome(word), "Palindrome invalid result, " + word + "" +
                    "should not be palindrome");
        }


    }

}
