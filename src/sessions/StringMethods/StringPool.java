package sessions.StringMethods;

public class StringPool {
    public static void main(String[] args) {
        String str = new String("ABC");
        String str2 = new String("BDE");
        String str3 = str;

        System.out.println(str == str2);
        System.out.println(str == str3);


        //Equals Method
        String st1 = "Hello";
        String st2 = "Hello";
        String st3 = new String("Hello");
        System.out.println("== result for String Pool: "+(st1 == st2));
        System.out.println(".equals() result for String Pool: "+ str.equals(st2));

        System.out.println("== result for Pool vs Heap: "+(st1 == st3));
        System.out.println(".equals() result for Pool vs Heap: "+ str.equals(st3));

        //Immutability
        String s1 = "1";
        String s2 = s1.concat("2");
        System.out.println(s1); //1
        s2.concat("3"); //s2 => 12
        System.out.println(s2);
        String s3 = s2.concat("4"); //124
        System.out.println(s3); //124
        System.out.println(s2); //12

        //the value of String variable will always be the one that was last assigned





    }
}
