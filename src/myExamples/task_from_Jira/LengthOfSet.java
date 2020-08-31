package myExamples.task_from_Jira;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LengthOfSet {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Set<String> setColors = new HashSet<>();
        String color;
        String answer;
        do {
            System.out.print("Please enter the color: ");
            while (in.hasNextInt()) {
                int input = in.nextInt();
                System.out.printf("\"%s\" is not a valid input please enter String only.\n", input);
            }
            color = in.next();
            setColors.add(color);
            System.out.println("Are you done");
            answer = in.next();
        } while (!answer.equalsIgnoreCase("yes"));
        System.out.println("Original HashSet " + setColors);
        System.out.println("Size of Set " + setColors.size());
    }
}

