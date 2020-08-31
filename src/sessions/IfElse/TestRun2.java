package sessions.IfElse;

import java.util.Scanner;

public class TestRun2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // sum = 0;
        //a != 13 ? b!= 13 ? c ! = 13 ? a+b+c  : a + b : a
        //sout(sum)

//        int i = scan.nextInt();
//
//        System.out.println(i % 2 == 0 ? "even" : "odd");
//
//        if(i % 2 == 1){
//            System.out.println("This is odd number");
//        }else if(i % 2 == 0){
//            System.out.println("This is even number");
//        }

//        int i = scan.nextInt();
//        System.out.println(i % 2 == 0 ? "even" : "odd");
//
//        //tasc 2
//
//        System.out.println("Print two integers");
//        int a = scan.nextInt();
//        scan.nextLine();
//        int b = scan.nextInt();
//        int sum = a + b;
//
//        System.out.println(13 >= a && a <= 19 || (13 <= b && b <= 19) ? "19" :sum);
//
        int a1 = scan.nextInt();
        int b1 = scan.nextInt();
        int c1 = scan.nextInt();
        int sum1 = 0;

        if(a1 != 13){
            sum1 += a1;
            if(b1 != 13){
                sum1 += b1;
                if(c1 != 13)
                    sum1 += c1;
            }
        }





    }


}
