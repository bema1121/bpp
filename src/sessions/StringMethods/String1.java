package sessions.StringMethods;

public class String1 {
    public static void main(String[] args) {
        String name = "Elon Musk";
        System.out.println(name);

        //why do I have this option?
        //what is the difference between them
        //creating String with literal
        //and as an Object

        //it's not used as much
        String name2 = new String("John Doe");
        System.out.println(name2);

        String a = "Name";
        String b = "is John";
        String c = a + b;

        System.out.println(c);

        int num1 = 5;
        int num2 = 6;
        int result = num1 + num2; //both sides  + are numeric so
        //result is numeric addition
        System.out.println(result);

        System.out.println(a + num1);
        //if one side is String so result is String

        //evaluation(calculation)starts from left to right

        System.out.println(a + num1 + num2);
        //cannot put between num1 - num2 bc we start from String

        System.out.println(num1 + num2 + a);
        System.out.println(num1 + num2 + a + num1 + num2);

        String ss = "4";
        ss += 5; //ss = ss + 5;

        System.out.println(ss);


    }
}
