package mentorings.stumentoring;

import java.util.Scanner;

public class LogicalOperation {
    public static void main(String[] args) {
        int age;

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your age: ");
        age = scan.nextInt();

        if(!(age > 18) ){
            System.out.println("You are too young");
        }else if(age > 18 && age <= 35){
            System.out.println("Young man");
        }else if(age == 36 || age <= 60){
            System.out.println("Middle age");
        }else{
            System.out.println("Be careful");
        }

    }
}
