package myExamples.codingBat;

import java.util.Scanner;

public class MiddleOne {

    public static void main(String[] args) {
        System.out.println("Enter any string");
        Scanner scan = new Scanner(System.in);
        String text = scan.next();

        if(text.length() % 2 == 1 && text.length() >=3 ) {
            //      januza  farkhatov
            //      (7-3)/2 =2
            int num = (text.length() - 5) / 2;
            String str = text.substring(num, text.length() - num);
            System.out.println(str);
        }else{
            System.out.println("length is even");
        }
    }
}
