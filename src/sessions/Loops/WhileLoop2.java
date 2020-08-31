package sessions.Loops;

public class WhileLoop2 {
    public static void main(String[] args) {
        String str = "hello";
        int num = 10;

        while (num > 0){
            System.out.println("Hello");
            num--;
        }

    }
    //write a function which will tell me if it's a palindrome or not?
       public static String reverseWord(String str){
        if(str == null || str.isEmpty()){
            return "Invalid Input";
        }

        //
        String reversed = "";
        int i = str.length()-1; //5-1=4
        while(i>=0){
            reversed += str.charAt(i);
            i--;
        }
        return reversed;
    }
}
