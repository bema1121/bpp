package sessions.Loops;

public class ForLoop {
    public static void main(String[] args) {

        //local variable --> is a variable created within a scope.(class,method,if,switch,loop scope)
        //are available and accessibly only within it's scope
        //inside one scope you can declare the variable only once

        //Write to print Hello 10 times

        for(int i = 1; i <= 10;i++){
            System.out.println("Hello "+i);
        }

        for(int i = 10;i > 0 ; i--){
            System.out.println("Hello--");
        }

        //sum all of the number starting from 1 to 12
        int sum = 0;
        int average = 0;
        int i;

        for(i = 1; i < 12;i++){ //repeat one action multiple times
            sum+= i; //sum = sum + i;
            System.out.println(sum);
        }

        //System.out.println(sum/i);

        System.out.println(reverseWord("Hello"));
        System.out.println(reverseWord("Kayak"));

    }

    //reverse the string using for loop
    //Hello = -> o

    public static String reverseWord(String str){
        String reversed = "";
        for(int index = str.length()-1; index >= 0; index--){  //number of iteration is fixed
            reversed += str.charAt(index); //reversed = reversed + str.charAt(index)
        }
        return reversed;
    }
}
