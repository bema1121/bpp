package sessions.classes_objects;

public class ClinicReceptionDriver {
    public static void main(String[] args) {

        //Create two doctors
        //every time a new patient comes create get info of their dog
        //send them to an available doctor
        VetDoctor drJohnDoe = new VetDoctor("John Doe", 5, 0, 4000);
        VetDoctor drDre = new VetDoctor("Dre", 10, 0, 10000);
        Dog labradorWithNoInjury = new Dog("Labrador", 9, false, "low");
        Dog akitaWithLegInjury = new Dog("Akita", 23, true, "critical");
        Dog germanShepherd = new Dog("German Shepherd", 13, true, "medium");
        System.out.println(drDre.getDailyEarning());
        drDre.serveDog(labradorWithNoInjury);
        System.out.println(drDre.getDailyEarning());
        System.out.println();
        System.out.println(drJohnDoe.getDailyEarning());
        drJohnDoe.serveDog(akitaWithLegInjury);
        System.out.println(drJohnDoe.getDailyEarning());
        System.out.println(akitaWithLegInjury.isInjured());
        System.out.println("Akita 2nd treatment");
        drDre.serveDog(akitaWithLegInjury);
        System.out.println();
        System.out.println(drJohnDoe.getDailyEarning());
        drJohnDoe.serveDog(germanShepherd);
        System.out.println(drJohnDoe.getDailyEarning());
        System.out.println(germanShepherd.isInjured());
        drJohnDoe.closeShift();
        System.out.println(drJohnDoe.getDailyEarning());
        System.out.println(drJohnDoe.getAnnualYearning());
        Dog dog1 = new Dog("Pitbull", 22, true, "low");
        System.out.println();
        drJohnDoe.serveDog(dog1);
        System.out.println(drJohnDoe.getDailyEarning());
        drJohnDoe.closeShift();
        System.out.println(drJohnDoe.getDailyEarning());
        System.out.println(drJohnDoe.getAnnualYearning());
    }
}










