package sessions.JavaMethods;

public class MethodsDesign3 {
    public static void main(String[] args) {
        MethodsDesign3 myObject = new MethodsDesign3();

        System.out.println("About to run my method");


        myObject.printMessage(); //call to a method
        System.out.println("Finished executing my method ");
        System.out.println("now I back in the main method");
    }
    //method must be called to be executed. if not called it is not going to be executed.
    public void printMessage(){ //execute everything in the method and cime back to where you entered method.
        System.out.println("My Method is Called");
    }
}
