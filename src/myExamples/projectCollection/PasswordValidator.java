package myExamples.projectCollection;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        /**
         * Ask user to enter a new password.
         * If the password does not match any of the requirements below, print a message based on what requirement it is breaking and return false.
         * If it does not break any requirement, print 'Password accepted' and return true.
         *
         * Password requirements:
         * Be a minimum of eight (8) characters in length
         * Contain at least one uppercase letter (A-Z)
         * Contain at least one lowercase letter (a-z)
         * Contain at least one digit (0-9) - tip: regex to match (.)*(\d)(.)*)
         * Contain at least one special character (!@#$%^&*()) - note: use List.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your password: ");
        String password = scanner.nextLine();
        PasswordValidator passwordValidator = new PasswordValidator();
        System.out.println("valid password: " + passwordValidator.isValid(password));
    }
    public boolean isValid(String password) {
        //TODO implement validation logic
        if( !checkSize(password) ) {
            return errorMessage("Size");
        }
        if( !hasUpperCase(password)) {
            return errorMessage("Upper Case");
        }
        if( !hasLowerCase(password)) {
            return errorMessage("Lower Case");
        }
        if( !hasNumber(password) ) {
            return errorMessage("Number");
        }
        if( !hasSpecialCharacter(password) ) {
            return errorMessage("Special Character");
        }
        System.out.println("Password accepted");
        return true;
    }
    public boolean hasSpecialCharacter(String password) {
        List<String> specialCharacter = Arrays.asList("!", "@", "#", "$", "%", "^", "&", "*", "(", ")");

        for(int i = 0; i < password.length(); i++){
            if(password.contains(specialCharacter.get(i))) {
                return true;
            }else{
                return false;
            }
        }
        //TODO check if password has one of special characters "!", "@", "#", "$", "%", "^", "&", "*", "(", ")"
        return false;
    }
    public boolean hasNumber(String password) {
        return password.matches("(.)*(\\d)(.)*");

        }

        //TODO check if password has a number ->tip: pattern is (.)*(\d)(.)*
    public boolean hasLowerCase(String password) {
//        for(int i = 0; i < password.length(); i++){
//            if(password.equals())


        return !password.equals(password.toUpperCase());
        //TODO check if password has a Lower Case

    }
    public boolean hasUpperCase(String password) {
        return !password.equals(password.toLowerCase());
        //TODO check if password has an Upper Case

    }
    public boolean checkSize(String password) {

        return password.length() >= 8;

        //TODO check size is valid

    }
    public boolean errorMessage(String error){

        System.out.println("Error message "+error);
        //TODO print out error message and return
        return false;
    }
}
