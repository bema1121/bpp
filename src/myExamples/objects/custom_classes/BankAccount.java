package myExamples.objects.custom_classes;

public class BankAccount {

    double balance; //instance variables
    String accountHolder;
    int accountNumber;

    public void deposit(double amount){ //methods
        System.out.println("depositing $ "+ amount +" to "+accountNumber);
        balance += amount;

    }
    public void withdraw(double amount){ //behavioral
        System.out.println("withdrawing $ "+ amount + " from "+accountNumber);
        balance-=amount;
        if(balance < 0){
            balance-= 35;
        }
    }
    public void showBalance(){
        System.out.println("================");
        System.out.println("accountHolder: "+accountHolder);
        System.out.println("accountNumber: "+accountNumber);
        System.out.println("balance: $ "+balance);
        System.out.println("================");
    }
    public void charge (double price, String item){
        if(balance >= price){
            System.out.println("buying "+item+" for $ "+price+" from "+accountNumber);
            balance-=price;
        }else{
            System.out.println("insufficient funds to purchase "+item+" from "+accountNumber);
        }

    }
}
