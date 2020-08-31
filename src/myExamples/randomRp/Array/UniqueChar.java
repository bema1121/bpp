package myExamples.randomRp.Array;

public class UniqueChar {
    public static void main(String[] args) {


        System.out.println( uniqueChars("wooden-spoon") ) ;

    } public static String uniqueChars(String str) {
        String str2 = "";
    for(int i = 0; i <= str.length()-1; i++){
           if(!str2.contains(str.charAt(i)+"")){
               str2 += str.charAt(i);

               //str2 += str.charAt(i);

           }



        }
    return str2;

    }






}


