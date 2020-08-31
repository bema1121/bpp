package sessions.classes_objects.car;

public class Car {

    private String make;
    private String model;
    //Engine
    private Engine engine;
    public Car(String make, String model, Engine engine) {
        this.make = make;
        this.model = model;
        this.engine = engine;
    }
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public Engine getEngine() {
        return engine;
    }
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
//write a method -- tuneUp(int addHP) in car class.
//when the tuneUp is called engine hp should increased by the addHp.