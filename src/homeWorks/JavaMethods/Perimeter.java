package homeWorks.JavaMethods;

import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        Perimeter perimeters = new Perimeter();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length of rectangle: ");
        double number = scan.nextDouble();
        System.out.println("Enter width of rectangle: ");
        double number2 = scan.nextDouble();
        perimeters.calculatePeremeter(number, number2);

    }
    public double calculatePeremeter(double length, double width){
        double result = 0;
        result = (length * 2)+(width*2);
        System.out.println("Perimeter of rectangle: "+result);
        return result;
    }
}
