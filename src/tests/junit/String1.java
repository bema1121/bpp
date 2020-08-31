package tests.junit;

import org.junit.Ignore;
import org.junit.Test;
import org.testng.Assert;

public class String1 {

        //void assertEquals(boolean expected, boolean actual)
        //void assertEquals(String expected, String actual)
        //void assertEquals(long expected, long actual)
        //void assertEquals(char expected, char actual)
        // overloaded method is a method with different params,
        //but with the same name.
        @Ignore
        @Test
        public void test1() {
            //concat method of a String
            //str.concat(" World");
            String1 str = new String1();
            //expected results come from requirements. (User story could your requirement)
            //requirement - is the most important thing.
            //All of our actions should be taken according to requirements.
            String expected = "Hello World";
            //What the method you are testing returns is your actual result
            String actual = str.concat("Hello", " World");
            Assert.assertEquals(expected, actual);
        }
        @Test
        public void test2(){
            //I want find the max of 5,10,22
            //We write tests blindly - all we need is method name, expected result from documentation.
            //need test data.
            int expected = 22;
            int actual = findMax(5,10,22);
            Assert.assertEquals(expected, actual);
        }
        @Test
        public void test3() {
            //I want find the max of 5,10,22
            int expected = 22;
            int actual = findMax(5,22,10);
            Assert.assertEquals(expected, actual);
        }
        //ROI => return on investment.
        //
        @Test
        public void test4() {
            //I want find the max of 5,10,22
            int expected = 22;
            int actual = findMax(22,5,10);
        }
        @Test
        public void test5(){
            //I want find the max of 10,10,22
            int expected = 22;
            int actual = findMax(10,10,22);
            Assert.assertEquals(expected, actual);
        }
        @Test
        public void test6(){
            //I want find the max of 10,10,22
            int expected = 22;
            int actual = findMax(22,22,22);
            Assert.assertEquals(expected, actual);
        }
        @Test
        public void test7(){
            //I want find the max of 10,10,22
            int expected = 22;
            int actual = findMax(0,22,22);
            Assert.assertEquals(expected, actual);
        }
        @Test
        public void test8() {
            int expected = -2;
            int actual = findMax(-11,-2,-22);
            Assert.assertEquals(expected, actual);
        }
        @Test
        public void test9() {
            int expected = 0;
            int actual = findMax(0,0,0);
            Assert.assertEquals(expected, actual);
        }
        public int findMax(int i, int y, int x) {
            if(i < y){
                if(y>x){
                    return y;
                }
                else {
                    return x;
                }
            }
            else{
                if (i>x) {
                    return i;
                }
                else {
                    return x;
                }
            }
        }
        public String concat(String str, String strToConcat) {
            return str.concat("!"+strToConcat);
        }
    }






