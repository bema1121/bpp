package homeWorks.JavaMethods;

import java.util.Scanner;

public class ReadCode {
    public static void main(String[] args) {
        System.out.println(enterYourName());

    }
    public static String enterYourName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name ...");

        String title = "Senior SDET []";

        String name = sc.nextLine();

        title = title.substring(0,title.indexOf("]"))+name+title.substring(title.indexOf("]"));
        return title;
    }
}
