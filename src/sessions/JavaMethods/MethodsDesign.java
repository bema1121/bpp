package sessions.JavaMethods;

public class MethodsDesign {
    public static void main(String[] args) {


        MethodsDesign bonusCalculator = new MethodsDesign();
        int bonus = bonusCalculator.calculateBonus(100000, 3);
        int bonus2 = bonusCalculator.calculateBonus(150000, 1);
        int bonus3 = bonusCalculator.calculateBonus(200000, 2);
        System.out.println("Bonus one: " + bonus);
        System.out.println("Bonus two: " + bonus2);
        getPrintln(bonus3, "Bonus three: ");

    }

    private static void getPrintln(int bonus3, String s) {
        System.out.println(s + bonus3);
    }

    public int calculateBonus(int salary, int yearsOfService) {
        int bonus = 0;
      if (yearsOfService < 2) {
           bonus = salary * 5 / 100;
       } else if (yearsOfService >= 2 && yearsOfService < 5) {
           bonus = salary * 10 / 100;       }
       return bonus;
   }
}


