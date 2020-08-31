package homeWorks.Loops;

import java.util.Scanner;

public class WhileLoopCounting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in a message, and I'll display it five times.");
        System.out.println("Message: ");
        String str = scanner.nextLine();
        int i = 1;
        while(i <= 5){
            System.out.println(i+"."+str);
            i++;
        }
    }
}
