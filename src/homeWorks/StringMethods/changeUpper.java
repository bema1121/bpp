package homeWorks.StringMethods;


import java.util.Scanner;

public class changeUpper {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first name: ");
        String firstName = scan.next();
        System.out.println("Enter the the last name: ");
        String lastName = scan.next();

        System.out.println(changeUpper(firstName));
        System.out.println(changeUpper(lastName));
    }

    public static String changeUpper(String str) {
        String changeUp = str.substring(0,1).toUpperCase();
        String str2 = changeUp+str.substring(1);

        return str2;





    }

}

