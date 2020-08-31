package homeWorks.JavaMethods;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter you username: ");
        String userName = scanner.next();
        System.out.println("Please enter you password: ");
        String password = scanner.next();

        userNameCheck(userName);
        passwordCheck(password);

    }public static void userNameCheck(String userName){
        String userName2 = "abdullaeva";
        if(userName.equals(userName2) && userName.length() >= 8){
            System.out.println("You entered correct userName");
        }else{
            System.out.println("It's incorrect username!");
        }
    }public static void passwordCheck(String password){
    String password2 = "abc0987654321cba";
        if(password.equals(password2) && password.length() >= 15){
            System.out.println("You entered correct password");
        }else{
            System.out.println("It's incorrect password!");
        }
}
}
//        Write a password checker program that will check passwords and username
//        from Scanner, or the user will put the passwords and username in there).
//
//        The program will check these things for each password and username
//        1. a password must have at least characters 15 and username must be minimum 8.
//
//        2. If it is entered correct then you found the password otherwise it should say it is incorrect password.
