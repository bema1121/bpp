package sessions.JavaMethods;


public class MethodsDesignSimple {
    //params are required data(input) to complete the task.
    public void printSumOfTwoNums(int num1, int num2) {

        System.out.println(num1+num2);
    }
    //Emma - can I use new vars in the methods
    //for mix of data types in the params
    public static void main(String[] args) {
        MethodsDesignSimple firstMethodClass = new MethodsDesignSimple();
//        System.out.println("Printing a message from a method");
//        System.out.println("Printing a message from a method");
        firstMethodClass.printSomething();
        firstMethodClass.printSomething();
        firstMethodClass.printHelloWorld();
        firstMethodClass.printHelloWorld();
        //When calling(using) a method with params,
        //we have to pass values to the params.
        firstMethodClass.printSumOfTwoNums(10, 20);
        firstMethodClass.printSumOfTwoNums(50, 100);
        firstMethodClass.printSumOfTwoNums((int)12.0, (int)12.0);
        //firstMethodClass.printSumOfTwoNums("1","2200");
        firstMethodClass.printText("Hello World");
        firstMethodClass.printText("You are beautiful");
        firstMethodClass.printText("Fried Chicken");
        firstMethodClass.printText("DeepDish Pizza");
        firstMethodClass.concatAndPrintTwoStrings("Good" , "Job");
        firstMethodClass.printEmailSignatureForJohnDoe();
        firstMethodClass.printEmailSignatureForJohnDoe();
    }
    //method does not return anything.
    public void printSomething() {
        System.out.println("Printing a message from a method");
    }
    public void printHelloWorld(){
        System.out.println("Hello World");
    }
    //write a method which will print any text I'll provide
    //easy to maintain a.k.a maintainable code
    public void printText(String text){
        System.out.println(text + "!");
    }
    //write a method which will concatenate(add two Strings together)
    //ex: user gives "Good" and "Job" => Good Job
    public void concatAndPrintTwoStrings(String text1, String text2) {
        System.out.println(text1 + " " + text2);
    }

    public void printEmailSignatureForJohnDoe(){
        System.out.println("John Doe");
        System.out.println("Senior Developer");
        System.out.println("312-312-3322");
    }
}

