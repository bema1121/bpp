package homeWorks.ifElse;

import java.util.Scanner;

public class calculateAreOfTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the width of the Triangle: ") ;
        double width = scan.nextDouble();
        System.out.println("Enter the height of the Triangle: ");
        double height = scan.nextDouble();

        double area = (width * height /2);
        System.out.println("Area of Triangle is: "+area);

    }
}
