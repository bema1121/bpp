package sessions.JavaMethods;

// is responsible for having logic(methods) for converting different set of units.
//it has methods which convert units.
public class Converter {
    public static void main(String[] args) {
        Converter myConverter = new Converter();
        double f = myConverter.convertCtoF(11);
        System.out.println("Temp outside in F: " + f);
        double c = myConverter.covertFtoC(51);
        System.out.println("Temp outside in C: " + c);
        double poundOfGold = myConverter.convertKgToLbs(10);
        System.out.println("Pounds of gold " + poundOfGold);
        double kmsToWisconsin = myConverter.convertMileToKm(100);
        System.out.println("Distance to wisconsin in kms " + kmsToWisconsin);
        double f1 = Converter.convertCelsiusToF(35);
        System.out.println(f1);
    }
    //C to F
    public double convertCtoF(double celsius) {
        double fahrenheit = (celsius * (double) 9 / 5) + 32;
        return fahrenheit;
    }
    //F to C
    public double covertFtoC(double fahrenheit) {
        double celsius = (fahrenheit - 32) * (double) 5 / 9;
        return celsius;
    }
    public double convertKgToLbs(double kilos) {
        double lbs = kilos * 2.20462;
        return lbs;
    }
    public double convertMileToKm(double miles) {
        double km = 1.60934 * miles;
        return km;
    }
    public static double convertCelsiusToF(double celsius) {
        double fahrenheit = (celsius * (double) 9 / 5) + 32;
        return fahrenheit;
    }
}




