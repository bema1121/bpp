package sessions.StringMethods;

public class StringVsStringBuilder {
    public static void main(String[] args) {

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder str = new StringBuilder("ABC");

        //task -- add letter one by one

        for(int i = 3; i < alphabet.length(); i++){
            str = str.append(alphabet.charAt(i)+"");
            //if its str.concat(alphabet.charAt(i)+"");
            //
        }
        System.out.println(str);
        //here is gonna be "ABC" bc we didn't assign str
    }
}
