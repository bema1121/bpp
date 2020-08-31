package sessions.StringMethods;

public class StringIndex {
    public static void main(String[] args) {

        double a = 5;
        String school = "DevXSchool"; //as as new String("DevXSchool");
        //index of c is 5;

        //negative/extreme cases.
        char fifthCharacter = school.charAt(5);
        System.out.println(fifthCharacter);

        char lastO = school.charAt(2);

        System.out.println(lastO);
        System.out.println(lastO);

        System.out.println(school.charAt(7));
        System.out.println(school.charAt(7));

        char negativeIndex = school.charAt(-1);//no way to prevent the values being passed
        //only we can add a logic to handle unacceptable values.

        System.out.println(negativeIndex);
    }
}