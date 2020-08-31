package myExamples.hackathonMarafon;

import java.util.Scanner;

public class BankAccount {

    private String login;
    private String password;
    private double balanceForChecking;
    private double balanceForSaving;
    public BankAccount(String login, String password, double balanceForChecking, double balanceForSaving) {
        this.login = login;
        this.password = password;
        this.balanceForChecking = balanceForChecking;
        this.balanceForSaving = balanceForSaving;
    }
    public String getLogin() {
        return login;
    }
    public String getPassword() {
        return password;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public double getBalanceForChecking() {
        return balanceForChecking;
    }
    public void setBalanceForChecking(double balanceForChecking) {
        this.balanceForChecking = balanceForChecking;
    }
    public double getBalanceForSaving() {
        return balanceForSaving;
    }
    public void setBalanceForSaving(double balanceForSaving) {
        this.balanceForSaving = balanceForSaving;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void deposit(double accountBalance) {
        if (accountBalance > 500) accountBalance += 200;
        Scanner sc = new Scanner(System.in);
        System.out.println("What account do you want to deposit");
        String account = sc.next();
        if (account.equalsIgnoreCase("saving")) {
            this.balanceForSaving += accountBalance;
            System.out.println("$" + accountBalance + " was added to saving account");
        } else {
            this.balanceForChecking += accountBalance;
            System.out.println("$" + accountBalance + " was added to checking account");
        }
    }
    public void withdraw(double accountBalance) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What account do you want to withdraw from");
        String account = sc.next();
        if (account.equalsIgnoreCase("saving")) {
            if (balanceForSaving >= accountBalance) {
                balanceForSaving -= accountBalance;
                System.out.println("$" + accountBalance + " was withdrawed to saving account");
            } else {
                System.out.println("Insufficient funds");
            }
        } else {
            if (balanceForChecking >= accountBalance) {
                balanceForChecking -= accountBalance;
                System.out.println("$" + accountBalance + " was withdrawed to checking account");
            } else {
                System.out.println("Insufficient funds");
            }
        }
    }
    public String transferToAnotherAccount(double accountBalance) {
        String end = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("What account do you want to transfer to");
        String account = sc.next(); // email
        Login obj = new Login();
        for (BankAccount newAccount : obj.allUsers()) {
            if (newAccount.getLogin().equalsIgnoreCase(account) && balanceForChecking >= accountBalance) {
                balanceForChecking -= accountBalance;
                newAccount.setBalanceForChecking(newAccount.getBalanceForChecking() + accountBalance);
                System.out.println("Account Balance $" + accountBalance + " was transferred");
                end = "done";
            }
            else {
                System.out.println("No such an account or Insufficient funds");
                end = "  ";
            }
        }
        return end;
    }
}


