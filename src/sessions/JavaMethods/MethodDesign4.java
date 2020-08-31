package sessions.JavaMethods;

public class MethodDesign4 {
    public static void main(String[] args) {
        MethodDesign4 myObj = new MethodDesign4();
        myObj.myMethod();
        System.out.println("Hello World");
        myObj.myMethod();
    }
    public void myMethod(){
        System.out.println("Method executed");
    }
}
