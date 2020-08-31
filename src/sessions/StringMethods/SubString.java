package sessions.StringMethods;

import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {


        String str = "John Doe";
        System.out.println(str.substring(5));

        String str2 = "Jackson";
        System.out.println(str2.substring(4));

        String ssn = "233-33-5554";
        System.out.println(ssn.substring(6-1));

        String carModel = "Range Rover";
        System.out.println(carModel.substring(6));

        System.out.println(carModel);

        //substring(int start,int end);

        //Get Jr.
        String str4 = "Donald Jr. Trump";
        System.out.println(str4.substring(7,10));

        //find the month mm/dd/yy
        String dateOfB = "02/06/99";
        System.out.println("Month : "+ dateOfB.substring(0,2));

        System.out.println("Day: "+dateOfB.substring(3,5));
        System.out.println("Year: "+dateOfB.substring(6,8));

        //get the month and year
        System.out.println("Year : "+ (dateOfB.substring(6,8))+"Month : "+dateOfB.substring(0,2));
        System.out.println(str4.substring(11)+ " "+str4.substring(0,6));

        String book = "Many many years ago, some folks Java";
        System.out.println(book.substring(21));

        //lu
        String word = "Blue";
        System.out.println(word.substring(1,3));

        String jay = "Jet";
        System.out.println(word.concat(jay));
        System.out.println(jay.concat(word));
        //combining second one to the end of first one



    }

    //user inputs two different Strings.
    public void userInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input some value");

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        System.out.println(str1.concat(str2));

    }
}
