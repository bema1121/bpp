package sessions.classes_objects;
/**
 * Objects created from this class will be java beans(POJOs) - plain old java objects
 * It's purpose is to just carry info around
 */
public class Dog {
    private String breed;
    private int ageInMonths;
    private String color;
    private double price;
    private boolean isInjured;
    private String injurySeverity;
    public Dog(String breed, int ageInMonths, String color, double price, boolean isInjured, String injurySeverity) {
        this.breed = breed;
        this.ageInMonths = ageInMonths;
        this.color = color;
        this.price = price;
        this.isInjured = isInjured;
        this.injurySeverity = injurySeverity;
    }
    public Dog(String breed, int ageInMonths, boolean isInjured, String injurySeverity) {
        this(breed,ageInMonths,"NoColor",0,isInjured,injurySeverity);
    }
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public int getAgeInMonths() {
        return ageInMonths;
    }
    public void setAgeInMonths(int ageInMonths) {
        this.ageInMonths = ageInMonths;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public boolean isInjured() {
        return isInjured;
    }
    public void setInjured(boolean injured) {
        isInjured = injured;
    }
    public String getInjurySeverity() {
        return injurySeverity;
    }
    public void setInjurySeverity(String injurySeverity) {
        this.injurySeverity = injurySeverity;
    }
}
