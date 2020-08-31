package sessions.StringMethods;

public class IndexOfWithTwoParams {
    public static void main(String[] args) {
        String str = "Sharing is Caring";

        System.out.println(str.indexOf("ing"));
        System.out.println(str.indexOf("ing",5));

        //Find index of "ing" after the first word
        int indexOfFirstSpace = str.indexOf(" ");
        System.out.println(str.indexOf("ing",indexOfFirstSpace));

        //Find ool in the second word
        String str1 = "Cool School Cooler";

        // int indexOol =  str1.indexOf(" "); => first criteria for creating a var
        //is if the result of the method needs to be reused in more than one place.

        System.out.println(str1.indexOf("ool",str1.indexOf(" ")));

        int firstSpace = str1.indexOf(" ");
        int secondSpace = str1.indexOf(" ",firstSpace+1);
        System.out.println(str1.indexOf("ool",secondSpace));

        System.out.println(str1.lastIndexOf("ool"));


    }
}
