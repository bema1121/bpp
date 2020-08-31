package sessions.StringMethods;

public class Exercise {

    //Find me the version of the application running
    public static void main(String[] args) {
        String message1 = "Starting Chase Application with version: 2.4";
        String message2 = "Starting Chase Application with version: 2.6";
        String message3 = "Starting Chase Application with version: 3.5";

    }

    //write a method which will print out Testing version: 0.0.1
    public static void printOutTestVersionMessage(String message){
        int index = message.indexOf("version");//32
           System.out.println(message.substring(index));



    }

}
