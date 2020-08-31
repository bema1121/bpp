package sessions.StringMethods;

public class Replace{
    public static void main(String[] args) {
        //Replace

        String str = "Doe";
        //override th "Doe" with "Joe"
        str = str.replace('D','J');
        System.out.println(str);

        //Hello
        //heyyo

        String str1 = "Hello";
        str1 = str1.replace('l','y');
        System.out.println(str1);

        //it is overloaded method that can change Strings
        str1 = str1.replace("Hey","We");
        System.out.println(str1);

        String str2 = "Hellolllllll";
        System.out.println(str2.replace('l','L'));

        String str3 = "What a beautiful world";
        System.out.println(str3.replace("beautiful","amazing"));

        String str4 = "Hello";
        //ReplaceFirst ==> returns String which the first occurrence of the given char modified
        str4 = str4.replaceFirst("l","L");
        System.out.println(str4);

       //str4.isEmpty() ==> return true if the String is empty - "


    }
}
