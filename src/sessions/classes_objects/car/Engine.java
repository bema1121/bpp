package sessions.classes_objects.car;

public class Engine {
    private double hp;
    private int cylinder;
    private String type;
    public Engine(double hp, int cylinder, String type) {
        this.hp = hp;
        this.cylinder = cylinder;
        this.type = type;
    }
    public double getHp() {
        return hp;
    }
    public void setHp(double hp) {
        this.hp = hp;
    }
    public int getCylinder() {
        return cylinder;
    }
    public void setCylinder(int cylinder) {
        this.cylinder = cylinder;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
}
