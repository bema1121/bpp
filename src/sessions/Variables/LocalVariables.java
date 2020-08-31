package sessions.Variables;

public class LocalVariables {
      //intance variables
        int num = 0;
        int num2 =0;



        public static void main(String[] args) {
            int i,c,age,amount;
            String str = null;
            System.out.println(str.charAt(2)); //Runtime NullPointer Exception;

            int x = 0; //must be initialized before using it.
            System.out.println(x); //local variables don't have default values
            int y = 1;

            if(x < y){
                i = 20;
                System.out.println(i);
            }else{
                i=0;
            }
            System.out.println(i);
        }
    }

