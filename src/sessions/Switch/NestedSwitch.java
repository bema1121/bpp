package sessions.Switch;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        //What classes does a student need to take?
        //ask for the nth year?
        //for first year (freshman) print out (AdvancedEnglish and A
        //for second, third or 4th years
        //we have three majors.
        //CS -> print out( CS Fundamentals, Java 1, Java 2)
        //ACC -> print out (Statistics, Excel)
        //BA -> print out (Marketing, Read some good books)

        //if the user input a number smaller than 1 tell too early to think about college
        //if the user input a number greater than 4 tell its time to work

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the year you are on:");
        int academicYear = input.nextInt();

        switch (academicYear) {
            case 1:
                System.out.println("Freshmen curriculum: \n 1) Advanced English");
                System.out.println("2) Algebra ");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("please enter your major:");
                input.nextLine();
                String major = input.nextLine();

                switch (major.toUpperCase()) {
                    case "CS":
                        System.out.println(" CS Fundamentals, Java 1, Java 2)");
                        break;
                    case "ACC":
                        System.out.println("Statistics, Excel");
                        break;
                    case "BA":
                        System.out.println("Marketing, Read some good books");
                        break;
                    default:
                        System.out.println("No such major");
                }
                break;
            default:
                if (academicYear < 1) {
                    System.out.println("Too early to think about college");
                } else {
                    System.out.println("It is time to work");

                }
                System.out.println("No such year supported choose from 1 - 4");
        }


    }
}
