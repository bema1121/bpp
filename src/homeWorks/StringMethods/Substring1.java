package homeWorks.StringMethods;

public class Substring1 {
    public static void main(String[] args) {


        String s1 = "Java is a programming language. Java is a platform. Java is an Island.";
        String replaceString = s1.replace("Java", "Kava");//replaces all occurrences of "Java" to "Kava"
        System.out.println(replaceString);


        //Kava is a programming language.Kava is a platform.Kava is an Island.
    }
}