package sessions.StringMethods;

public class Exercise2 {

    //Exception thrown in the application
    //Send the exception name
    public static void main(String[] args) {
        String error1 = "Exception in thread \"main\" java.lang.NullPointerException";
        String error2 = "Exception in thread \"main\" ArrayIndexOutOfBoundException: 5";

        emailExceptionName(error1);
        emailExceptionName(error2);

    }

    //if lang does not exist print out the full error message.
    public static void emailExceptionName(String error){
        int index = error.indexOf("lang");
        System.out.println("Application gave the following: "+error.substring(index+5));
    }
}
