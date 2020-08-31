package sessions.Switch;

import java.util.Scanner;

public class WeekDayOrnot {
    public static void main(String[] args) {

        //Ask user to input an integer value that will represent
        // the day of the week.
        //ex: 1 - 7
        //Program should tell me if it's a weekday or a weekend

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of the day:");

        String dayNumber = input.nextLine();

        switch (dayNumber) {
            case "1":
                //case "Monday":

            case "2":
                //case "Tuesday":
            case "3":
                //case "Wednesday":
            case "4":
                //case "Thursday":
            case "5":
                //case "Friday":
                System.out.println("It is a week day");
                break;
            case "6":
                //case "Saturday":
            case "7":
                //case "Sunday":
                System.out.println("It is a weekend");
            default:

        }


//        int day = input.nextInt();
//
//
//        switch (day) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                System.out.println("Its a week day");
//                break;
//            case 6:
//                System.out.println("Saturday");
//            case 7:
//                System.out.println("Sunday");
//                System.out.println("It s a weekend");
//                break;
//            default:
                System.out.println("There is no such day");

        //  }

    }
}
