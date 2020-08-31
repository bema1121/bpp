package myExamples.hackathonMarafon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Login {

    public List<BankAccount> allUsers() {
        List<BankAccount> loginAndPasswords = new ArrayList<>();
        loginAndPasswords.add(new BankAccount("johndoe@gmail.com", "password1", 0.0, 0.0));
        loginAndPasswords.add(new BankAccount("janedoe@gmail.com", "password2", 0.0, 0.0));
        loginAndPasswords.add(new BankAccount("marklee@gmail.com", "password3", 0.0, 0.0));
        loginAndPasswords.add(new BankAccount("stevewhite@gmail.com", "password4", 0.0, 0.0));
        loginAndPasswords.add(new BankAccount("jessicasimpson@gmail.com", "password5", 0.0, 0.0));
        return loginAndPasswords;
    }
    public  BankAccount user1 (){
        BankAccount user = new BankAccount("", "", 0, 0);
        List<BankAccount> loginAndPasswords = new ArrayList<>(allUsers());
        Scanner input = new Scanner(System.in);
        String login = "";
        String userLogin = "";
        String passwordOfUser = "";
        String password = "";
        do {
            System.out.println("Please enter login");
            login = input.next();
            System.out.println("Please enter password");
            password = input.next();
            for (BankAccount lAndP :  loginAndPasswords) {
                userLogin = lAndP.getLogin();
                passwordOfUser = lAndP.getPassword();
                if (userLogin.equals(login)) {
                    if (passwordOfUser.equals(password)) {
                        System.out.println("You are loged in");
                        user = lAndP;
                    }
                    else {
                        System.out.println("Invalid  login or password.\nPlease try again");
                    }
                }
            }
        } while (!userLogin.equals(login) && passwordOfUser.equals(password) );
        return user;
    }
}


