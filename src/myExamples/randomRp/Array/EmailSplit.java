package myExamples.randomRp.Array;

import java.util.Scanner;

public class EmailSplit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String email = input.nextLine();
        String emailId = "";
        String domain = "";

//         if(email.contains("@") && email.contains("@")){
//            System.out.println("invalid email");
//        }

        if(email.contains("@"))  {
            String[] arr = email.split("@");

            for (int i = 0; i <= arr.length - 1; i++) {
                System.out.println("Email id: " +arr[i]);
                System.out.println("Domain "+arr[i]);

            }



        }else if(email.contains("@") ){
            System.out.println("invalid input");
        }


    }
}
