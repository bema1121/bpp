package sessions.classes_objects;

public class VetDoctor {

    //vet doctor has a name
    //vet doctor has experience in years
    //vet doctor has earning for the day
    //and total annual
    //Earning will increase upon dogService.
    // if the severity of injury is critical -> get paid $1000
    //if the severity is medium -> $500
    //if the severity is low ->    $200(minimum)
    //this. -> references to all instance variable and methods within the class
    //this() -> references to a constructor within the class that matches the params
    private String name;
    private int experience;
    private double dailyEarning;
    private double annualYearning;
    public VetDoctor(String name, int experience, double dailyEarning, double annualYearning) {
        this.name = name;
        this.experience = experience;
        this.dailyEarning = dailyEarning;
        this.annualYearning = annualYearning;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getExperience() {
        return experience;
    }
    public void setExperience(int experience) {
        this.experience = experience;
    }
    public double getDailyEarning() {
        return dailyEarning;
    }
    public void setDailyEarning(double dailyEarning) {
        this.dailyEarning = dailyEarning;
    }
    public double getAnnualYearning() {
        return annualYearning;
    }
    public void setAnnualYearning(double annualYearning) {
        this.annualYearning = annualYearning;
    }
    /**
     * It will check if the dog is injured, if not, charge the minimum.
     * If injured charge based on the injury severity
     *
     * @param dog
     * @return the charge amount
     */
    public double serveDog(Dog dog) {
        double charge = 0;
        if (dog.isInjured()) {
            switch (dog.getInjurySeverity().toLowerCase()){
                case "critical":
                    charge = 1000;
                    break;
                case "medium":
                    charge = 500;
                    break;
                case "low":
                    charge= 200;
                    break;
                default:
                    System.out.println("Dog injury must be set to critical, medium or low");
                    charge = 0;
                    return charge;
            }
        } else {
            charge = 200;
        }
        System.out.println("Charge amount $" + charge);
        dailyEarning += charge;
        dog.setInjured(false);
        return charge;
    }
    //closeShift -> dailyEarning should be added to annualEarning
    //dailyEarning should reset to 0
    public void closeShift() {
        annualYearning+=dailyEarning;
        dailyEarning=0;
    }
}
