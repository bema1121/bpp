package sessions.IfElse;

import java.util.Scanner;

public class IfElsePractise {

    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your car type:");

        String carType = input.next(); //next takes only the first word. single word

        if (carType.equalsIgnoreCase("SUN")) {
            System.out.println("Choose one of the following cars in shop");
            System.out.println("1. Suburbun \n2. MB G-Class \n3.Range Rover Vogue");

            String carModel = input.nextLine();
            if (carModel.equalsIgnoreCase(("Suburban")) || carModel.equalsIgnoreCase(("1"))) {
                System.out.println("Suburban Price: $20k");
                System.out.println("Suburban year: 2020");
            } else if (carType.equalsIgnoreCase("Sports Car")) {
                System.out.println("1.Porsche 911 \n2.Nissan GTR \n3. Toyota Supra");

            } else if (carType.equalsIgnoreCase("Luxury")) {
                System.out.println("1.Rolls Royce \n2.MB - S class \n3. BMW 7 series");

            } else if (carType.equalsIgnoreCase("Economy")) {
                System.out.println("1.Toyota Camry \n2.Mazda \n3. Nissan Altima");

            }
            int numOne = 5;
            System.out.println("Is" + numOne + "a even number? ");
            if (numOne % 2 == 0)
                System.out.println(numOne + "is even");
            System.out.println("Its divisible by 2 without any remainder");

        }
    }}















