package sessions.classes_objects.covariant;

public class Vehicle {
    private int numOfVehicles;
    private String color;
    private long vin;
    private boolean isGas;


    public int getNumOfVehicles() {
        return numOfVehicles;
    }

    public void setNumOfVehicles(int numOfVehicles) {
        this.numOfVehicles = numOfVehicles;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public long getVin() {
        return vin;
    }

    public void setVin(long vin) {
        this.vin = vin;
    }

    public boolean isGas() {
        return isGas;
    }

    public void setGas(boolean gas) {
        isGas = gas;
    }

    public Vehicle(int numOfVehicles, String color, long vin, boolean isGas){
        this.numOfVehicles = numOfVehicles;
        this.color = color;
        this.vin = vin;
        this.isGas = isGas;


    }
}
