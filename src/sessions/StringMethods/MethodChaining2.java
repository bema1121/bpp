package sessions.StringMethods;

public class MethodChaining2 {
    public static void main(String[] args) {
        String str = " Sierrra Coffee";
        String str2 = str.trim().toUpperCase().replaceFirst("R","");
        System.out.println(str2);

        //str.trim().charAt(0).toUpperCase(); --> char
        //str.trim().indexOf("i").replace() --> int no methods available
    }
}
