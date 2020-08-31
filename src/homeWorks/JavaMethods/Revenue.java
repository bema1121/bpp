package homeWorks.JavaMethods;

import java.util.Scanner;

public class Revenue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter unit price: ");
        int unitPrice = scan.nextInt();
        System.out.println("Enter quantity: ");
        int quantity = scan.nextInt();
        calcRevenue(unitPrice,quantity);

    }
    public static int calcRevenue(int unitPrice, int quantity){

        if(unitPrice >= 100 && unitPrice <= 120){
            quantity += 10;
        }else if(unitPrice >= 120){
            quantity += 15;
        }else if(unitPrice < 100){
            quantity+=0;
        }

        return quantity;
    }
}
