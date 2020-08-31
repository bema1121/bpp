package tests.homework;

import org.junit.Test;

public class ReplaceMethod {

    @Test
    public void test1(){
        String s1 = "Java is a programming language. Java is a platform. Java is an Island.";
        String replaceString = s1.replace("Java", "Kava");
        System.out.println(replaceString);

    }
}
