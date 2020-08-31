package sessions.Variables;

public class InstanceVariables {
    //instance variables - are created on class level
    //instance variables can have access modifiers.
    //instance variables are the characteristics of an object
    //instance variables have default values
    //numbers and floats have 0 or 0.0
    //boolean - false;
    //char - ''
    //String and all other object have => null

    static int num = 0;
    static int num1;
    static String str;
    static StringBuilder sb;

    int num2 = 1000; //we cannot use non-xxcgccstatic variables or methods with
    //a static method without creating an Object from the class

    public static void main(String[] args) {
        System.out.println(num);
        System.out.println(num1);

        System.out.println(str);
        System.out.println(sb);

        InstanceVariables classObject = new InstanceVariables();
        classObject.sum(2,5);
        System.out.println(classObject.num2);
        //Non static variables and method can be accessed only from object r
        // eference inside static context.


    }public int sum(int num1, int i){
            return num1+num2;

    }
    //the difference between local vs instance variables would be
    //1. instance variables have default values -- local vars dont
    //2. instance variables can have access modifiers like (public, protected, private, default(empty)) -- local vars cant
    //3. as well as optional specifiers like (static, final...) local vars cant

}
