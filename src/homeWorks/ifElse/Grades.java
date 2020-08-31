package homeWorks.ifElse;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {

//        This program calculates the grade of a student based on the
//        marks entered by user in each subject. Program prints the grade based on this logic.
//                If the average of marks is >= 80 then prints Grade ‘A’
//        If the average is <80 and >=60 then prints Grade ‘B’
//        If the average is <60 and >=40 then prints Grade ‘C’
//else prints Grade ‘D

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your average marks:");
        int mark = input.nextInt();

        if(mark >= 80){
            System.out.println("Grade 'A'");
        }else if(mark < 80 && mark >= 60){
            System.out.println("Grade 'B'");
        }else if(mark < 60 && mark >= 40){
            System.out.println("Grade C");
        }else{
            System.out.println("Grade D");
        }


    }
}
