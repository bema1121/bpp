package sessions.classes_objects.car;

public class CarMechanicShop {

    public static void main(String[] args) {
        Engine laFerrariEngine = new Engine(800,12,"LaFerrari");
        Car car1 = new Car("Ferrari", "LaFerrari",laFerrariEngine);
        //write a method -- tuneUp(int addHP) in car class.
        //when the tuneUp is called engine hp should increased by the addHp.
        System.out.println(car1.getMake());
        System.out.println(car1.getEngine().getHp());
        car1.getEngine().setHp(1000);
        System.out.println(car1.getEngine().getHp());
        Car laFerrari2 = new Car("Ferrari", "LaFerrari", laFerrariEngine);
        System.out.println(laFerrari2.getEngine().getHp());
        //we can create objects right in the param
        //do this if you dont need to reuse the objet in this scope
        //
        Car car3 = new Car("Rolls Royce", "Phantom", new Engine(600,8,"pht"));
        car3.getEngine().setHp(1000);
        System.out.println(car3.getEngine().getHp());
        Car car4 = new Car("Rolls Royce", "Phantom", car3.getEngine());
        System.out.println(car4.getEngine().getHp());
    }
    //HomeWork =>
    //Create a class for Laptop;
    //Laptop must have brand
    //year
    //OS(name, version)
    //Specs(ram(memory), hd(memory), processor(iNumber, Ghz, numOfCores)
    //Classes
    //Laptop
    //OS
    //Specs
    //Processor
}
