package myExamples.hackathonMarafon;

import java.util.Scanner;

public class BankAccountDemo {

    public static void main(String[] args) {
        Login obj = new Login();
        BankAccountDemo obj1 = new BankAccountDemo();
        BankAccount user = obj.user1();
        obj1.features(user);
        System.out.println("balance" + user.getBalanceForChecking());
    }
    public void features (BankAccount user) {
        Scanner sc = new Scanner(System.in);
        String answerYN = "";
        do {
            System.out.println("Which operation do you want to do? \n" +
                    "1. Transfer To Another Account \n" +
                    "2. Withdraw \n" +
                    "3. Deposit");
            int answer = sc.nextInt();
            if (answer == 1) {
                System.out.println("How much do you want to transfer");
                double money = sc.nextDouble();
                user.transferToAnotherAccount(money);
            } else if (answer == 2) {
                System.out.println("How much do you want to withdraw");
                double money = sc.nextDouble();
                user.withdraw(money);
            } else if (answer == 3) {
                System.out.println("How much do you want to deposit");
                double money = sc.nextDouble();
                user.deposit(money);
            } else {
                System.out.println("Invalid input");
            }
            System.out.println("Are you done? Y/N");
            answerYN = sc.next();
        } while (!answerYN.equalsIgnoreCase("y"));
    }
}

