package homeWorks.Loops;

import java.util.Scanner;

public class AddingValuesForWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number: ");
        int num = scanner.nextInt();
        int sum = 0;
        for(int i = 1; i <= num; i++){
            System.out.print(i+" ");
            sum+=num;

        }
        System.out.println();
        System.out.println("The sum is "+sum);

        int i = 1;
        while(i <= num){
            System.out.print(i+" ");
            i++;
            sum+=num;
        }
        System.out.println();
        System.out.println("The sum is "+sum);
    }
}
