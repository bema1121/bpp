package myExamples.randomRp.Methods;

public class ReadCode {
    public static void main(String[] args) {
        ReadCode strObject = new ReadCode();
        System.out.println(strObject.startsWithA("HelloWorld"));
        System.out.println(strObject.startsWithA("American Dream"));
        System.out.println(strObject.startsWithA(""));
        ; //String can have empty value

        ReadCode.starts("HelloWorld");
    }

    public boolean startsWithA(String str) {
        if (str.length() > 0) {
            return str.charAt(0) == 'A'; //comparator == assignment
        } else if (str.length() < 1) {
            return false;
        } else {
            return true;
        }
    }

    //void is used to execute some actions and not return anything
    public static void starts(String str) {
        if (str.length() > 0) {
            System.out.println("Checking if the first char of the " + str + "is A");
            System.out.println(str.charAt(0) == 'A'); //true or false
            return;
        }
        System.out.println("Given String is empty");
    }
}
