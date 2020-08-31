package sessions.StringMethods;

public class Exercise3 {
    public static void main(String[] args) {
        System.out.println(replaceSo("I am a so so programmer"));

    }
    //replace a second appearance of so in a String
    //I am so so programmer should turn to I am so great programmer
    public static String replaceSo(String str){
        int index = str.lastIndexOf("so"); //10
        String p1 = str.substring(0,index); //I am so
        String p2 = str.substring(index + 2);//programmer
        return p1 + "great"+p2;





    }
}
