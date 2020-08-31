package sessions.Switch;

import java.util.Scanner;

public class SwitchStatementIntro {
    public static void main(String[]args){

        //will have a list animals
        //user will input some animal -- dog cat-- tiger and bear
        //program will tell me if its a domestic animal
        //or wild animal

        Scanner input = new Scanner(System.in);
        System.out.println("Enter animal");

        String animal = input.next();

        if(animal.equalsIgnoreCase("DOG") || animal.equalsIgnoreCase("CAt")){
            System.out.println("domestic animal");
        }else if(animal.equalsIgnoreCase("Tiger") || animal.equalsIgnoreCase("bear")){
            System.out.println("Wild Animal");
        }else{
            System.out.println("unknown animal");
        }
             //variable
        switch (animal.toLowerCase()){
            //converting the whole string variable to lower case. if input was dog- at this line its -> dog
            case "DOG": //if (animal.equal(DOG) -> case sensitive => Dog, dOg, Dog
                System.out.println("domestic animal");
                break;
            case "CAT":
                System.out.println("domestic animal");
                break;
            case "TIGER":
                System.out.println("wild animal");
                 break;
            case "Bear":
                System.out.println("wild animal");
                break;
            default:
                System.out.println("unknown animal");


        }

    }
}
