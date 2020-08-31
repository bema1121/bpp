package myExamples.objects.custom_classes;

public class CapitalOne {

    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount();
        acc1.accountHolder = "Bill Gates";
        acc1.accountNumber = 12345;
        acc1.deposit(250);
        acc1.withdraw(100);
        acc1.showBalance();

        acc1.charge(50, "wooden spoon");
        acc1.showBalance();

        BankAccount acc2 = new BankAccount();
        acc2.accountHolder = "Enes Jumabek";
        acc2.accountNumber = 6789;
        acc2.deposit(100);
        acc2.charge(200,"Gucci");
        acc2.showBalance();

    }
}
