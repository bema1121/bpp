package myExamples.task_from_Jira;
import java.util.Scanner;
public class CalculateTheRevenue {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter unit price: ");
        double unitPrice = sc.nextDouble();
        System.out.println("Enter quantity: ");
        int numberOfProducts = sc.nextInt();

        if (unitPrice < 0) {
            System.out.println("Please enter a positive number: ");
            unitPrice = sc.nextDouble();
        }

        if (numberOfProducts < 0){
            System.out.println("Please enter a positive number: ");
            numberOfProducts = sc.nextInt();
        }

        double discount = 0;
        double revenue = 0;
        double totalAmount = 0;

        if (numberOfProducts < 100) {
            revenue = unitPrice * numberOfProducts;
            System.out.println("The revenue from sale: " + revenue);
            System.out.println("Sorry no discount for you today! Please come again");

        } else if (numberOfProducts >= 100 && numberOfProducts <= 120) {
            revenue = unitPrice * numberOfProducts;
            discount = revenue * 10 / 100;
            System.out.println("The revenue from sale: " + (revenue - discount));
            System.out.println("After discount of 10%: " + revenue * 10 / 100);
        }
        else if (numberOfProducts > 120) {
            revenue = unitPrice * numberOfProducts;
            discount = revenue * 15 / 100;
            System.out.println("The revenue from sale: " + (revenue - discount));
            System.out.println("After discount of 15%: " + revenue * 15 / 100);
        }

    }
}

