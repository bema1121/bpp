package myExamples.randomRp.BreakAndContinue;

import java.util.Scanner;

public class BruteForce {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String expectedUserName = "admin";
        String expectedPassword = "admin123";
        String username = "";
        String password = "";
        int attempts = 5;

//        do{
//            System.out.println("Please enter your username: ");
//            username = scan.next();
//            System.out.println("Please enter your password: ");
//            password = scan.next();
//            attempts--;
//            if(expectedUserName.equals(username) && expectedPassword.equals(password)){
//                System.out.println("You entered correct username and password");
//                break;
//            }
//        }while(attempts > 0);
//

    do{
        if(attempts == 0){
            System.out.println("You have exceeded number of attempts");
            System.out.println("This user has been deactivated for 30 minutes ");
            return;
        }
        attempts--;
        System.out.println("Please enter username: ");
        username = scan.next();
        if(!username.equals(expectedUserName)){
            System.out.println("Wrong username");
            System.out.println("Attempts left: "+attempts);
            continue;
        }
        System.out.println("Please enter password: ");
        password = scan.next();
        if(!password.equals(expectedPassword)){
            System.out.println("Wrong password ");
            System.out.println("Attempts left : "+attempts);
        }

    }while(!username.equals(expectedUserName) || !password.equals(expectedPassword));
        System.out.println("Login successful! ");


    }

}
