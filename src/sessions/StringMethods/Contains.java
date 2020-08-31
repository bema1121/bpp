package sessions.StringMethods;

import java.util.Scanner;

public class Contains {

    //Contains method returns boolean
    //public boolean contains(String str) -> it will return true
    //if the String contains str
    public static void main(String[] args) {

        String devX = "DevX School Coding BootCamp";
        String stanford = "Stanford University";
        String harvard = "Harvard University";

        //Have to match every single character
        boolean isCodingBootCamp = devX.contains("Coding BootCamp");
        System.out.println(isCodingBootCamp);

        boolean isCodingBootCamp2 = stanford.contains("Coding BootCamp");
        System.out.println(isCodingBootCamp2);

        //Contains method is largely used in pre Validations.
        //Imagine you need check for Dog or Cat Breeds

        String dogOrCat = "Cat Breed: Garfield";

        if(dogOrCat.contains("Cat")){
            System.out.println("Bring it to Cat vets");
        }else if(dogOrCat.contains("Dog")){
            System.out.println("BRing it to Dog vets");
        }else{
            System.out.println("Invalid Input");
        }

        //
        String paymentInfoFromTheUser = "Name: John Doe, Credit Card number:12123 .. etc";
        if(paymentInfoFromTheUser.contains("Credit Card")){
            //validate all info

        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter phone number");
        String str = sc.nextLine();
        System.out.println(str);

        //Regex -- Regular Expressions

        String str1 = "Hello John";
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toLowerCase());

        int indexOfMiddle = str1.length()/2;
        System.out.println(indexOfMiddle);
        String newString = str1.substring(0,indexOfMiddle)+str1.substring(indexOfMiddle,indexOfMiddle+1).toUpperCase()+str1.substring(indexOfMiddle+1);

        String str3 = "  yes  ";
        boolean isYes = str3.equals("yes");
        System.out.println(isYes);

        //deletes all spaces before and after the String
        str3 = str3.trim();
        isYes= str3.equals("yes");
        System.out.println(isYes);

        //only spaces after and before the words are trimmed, middle spaces are not touched.
        String str5 = " True Answer";
        str5 = str5.trim();
        boolean trimmed = str5.equals("True Answer");
        System.out.println(trimmed);

        //str4.isEmpty

        String countNumberOFZ = "Zero Zebras Zorro";
        int index = 0;
        int count = 0;
        while(index < countNumberOFZ.length()){
            if(!countNumberOFZ.isEmpty()){
                if(countNumberOFZ.charAt(index) == 'Z'){
                    count++;
                }
                index++;
            }
        }
        System.out.println(count);

        if(!countNumberOFZ.contains("Credit Card")){

        }




    }
}
