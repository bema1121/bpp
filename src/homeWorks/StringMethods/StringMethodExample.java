package homeWorks.StringMethods;

public class StringMethodExample {
    public static void main(String[] args) {



        String name = "Bob!";
        System.out.println(helloName(name));
        System.out.println( helloName("Alice!"));
        System.out.println(helloName("X!"));

    }
    public static String helloName(String str){
       String str1 = "Hello ";
       str1=str1+str;
        return str1;

    }
}

