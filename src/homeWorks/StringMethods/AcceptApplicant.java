package homeWorks.StringMethods;

import java.util.Scanner;

public class AcceptApplicant {
    public static void main(String[] args) {
      AcceptApplicant applicant = new AcceptApplicant();
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter years in college: ");
       int  yearsInCollege = scan.nextInt();
        System.out.println("Please enter years of programming experience: ");
      int   yearsOfPrEx = scan.nextInt();
        System.out.println("Please enter your grade point average: ");
       double gpa = scan.nextDouble();

        System.out.println(applicant.acceptApl(yearsInCollege,yearsOfPrEx,gpa));

    }
    public boolean acceptApl (int yearsInCollege, int yearsOfPrEx, double gpa){


        if(yearsInCollege >= 4 && yearsOfPrEx == 2 || gpa > 3.5 ){
            return true;
        }else{
            return false;
        }

    }
}
