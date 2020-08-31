package sessions.StringMethods;

public class IndexOf {

    //Use this method to find the index of specific letter or word inside a String
    public static void main(String[] args) {

        String str = "Nursultan Musakunov"; //Elon Musk, Steve Jobs, Bill Gates.
        //makes easy so we don't have to count
        //plus it works for any names.

        System.out.println(str.indexOf(" "));
        int indexOfSpace = str.indexOf(" ");

        System.out.println(indexOfSpace);
        System.out.println(str.substring(indexOfSpace + 1));

        String address = "4444 irving park ave apt 4s";
        //"; we are not counting the number of spaces
        int aptNum = address.indexOf("apt"); //if u put empty it will return 0;
        System.out.println(aptNum);
        System.out.println(address.substring(aptNum)); //dynamic programming

        //4444 irving park ave apt 4s
        //123 main st aapt 3e
        //Lake st apt 23
    }
}
