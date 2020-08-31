package sessions.wrappers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WrappersDemo1 {
    public static void main(String[] args) {

        //this is what you use usually.
        int num = 0;

        //Wrapper class using autoboxing
        Integer numWrapped = 0;
        Integer numWrapped2 = new Integer(0); //regular way, but redundant
        Integer num2Wrapped = 124;

        System.out.println(num2Wrapped * num2Wrapped);

        List<Integer> numsList = new ArrayList<>();
        numsList.add(12);
        numsList.add(14);

        int value1 = numsList.get(0); //unboxing

        for (int number : numsList) {
            System.out.println(number / 2);
        }

        Set<Double> pricesSet = new HashSet<>();

        //This will be seen once in a while
        String currentYear = "2020";
        String dob = "1982";
        //int age = currentYear - dob;
        System.out.println(currentYear + " as a String");

        //Wrapper classes provide methods that can convert String format to int, double etc
        //converting from String to primitive data types is called parsing.
        //parseInt(String s);
        //parseInt(String s, int radix)

        int year = Integer.parseInt(currentYear);

        System.out.println(year + " as an int");
        //int dobInt = Integer.parseInt(dob);

        int dobInt = Integer.parseInt("1982");

        int age = year - dobInt;
        System.out.println(age);

        //Wrapper class.toString(int i)
        //convert from int to Sting data type so that I can perform string manipulation
        int id = 65;
        String idStr = Integer.toString(id);
        System.out.println(idStr);

        int ssn = 123345679;
        StringBuilder ssnStr = new StringBuilder(Integer.toString(ssn));
        ssnStr.insert(3, "-");
        ssnStr.insert(6, "-");
        System.out.println(ssnStr);

        //gives the reversed value in bits.
        int ssnReversed = Integer.reverse(ssn);
        System.out.println(ssnReversed);

        int one = 1223;
        int two = 8999;
        int sum = Integer.sum(one, two);
        System.out.println(sum);

        String price = "93.99";
        //Parse methods will work only if the String contains numbers only.
        String discount = "20%";
        System.out.println(discount);

        double priceDouble = Double.parseDouble(price);
        System.out.println(priceDouble);

        int discountInt = Integer.parseInt(discount.substring(0, discount.length() - 1));//substring(0, discount.indexOf("%"))

        double totalToPay = priceDouble - (priceDouble * discountInt / 100);

        System.out.println(totalToPay);

        String applicationInfo = "INFO: APP Ipalm version 10 is successfully started";
        //Parse method take String.
        //one rule the String you are passing must be only numerical values
        int version = Integer.parseInt(applicationInfo.substring(applicationInfo.indexOf("is") - 2, applicationInfo.indexOf("is") - 1));
        System.out.println(version);

        double priceForCar = 12945.99;
        String priceForCarWith$ = "$" + Double.toString(priceForCar);
        System.out.println(priceForCarWith$);

        char grade = Character.toLowerCase('A');
        System.out.println(grade);

         //If the string is true return true else return false.
        String answer = "true";
        boolean answerBool = Boolean.parseBoolean(answer);
        System.out.println(answerBool);

        //Wrapper classes are the object representations of primitives data type which allow us to store
        //primitives data type
        //Wrapper classes also provide useful methods like converting(parsing) values
        //from string and storing it in a corresponding data type.
        //Also we can convert primitives data types to String using toString methods in each wrapper class
        //Wrapper classes can be initialized by primitive data type values, this process is called autoboxing
        //primitive data types can be initialized by Wrapper class values it is know as unboxing
    }
}
