package sessions.classes_objects;

//Objects are essentially information about specific entity(item, animal, person, part)
//In often cases we create information about the same entity millions of times.
//
//Objects help us maintain information about specific entities in an elegant manner.
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
//Part of Animal Shelter application
//We can adopt the animals
//We can give the animals to new families.
//information structure for animals
public class Animal {
    private String type;
    //if the age is available that store
    //otherwise assign -1;
    private String breed;
    private int age;
    //how long in days has it been in the shelter
    // -> Specific Measurable Attainable Realistic Testable?
    //public int duration;
    private int duration;
    private char gender;
    private double weight = 20;
    private boolean isInjured;
    //instance variables can be intialized right away.
    private static List<String> allowedTypes;

    private LocalDateTime timeCreated;
    public static int count = 0;
    public int countInstance;
    {
        //public int length = 0; cannot create instance variables only local variables
        weight = -10;
        countInstance = 0;
        timeCreated = LocalDateTime.now();
        System.out.println("Instance Initialzier");
    }
    static {
        allowedTypes = Arrays.asList("dog", "cat", "rabbit");
        System.out.println("Static Initializer");
    }
    //I
    //There are two sides to the app
    //1. Our employees(internal app)
    //2. Our clients
    //Employees will add an animal to the stock
    //User will be searching for a specific animal in the stock
    //Employees must enter all of the data for the dog.
    //Clients can search by all or type, and gender
    //constructor must have the same name as class and no return type.
    //if we dont see super() or this() in the constructor
    //it means implicit super() call is inserted in the beginning of the constructor
    public Animal(String type, String breed, int age, int duration, char gender, double weight, boolean isInjured) {
        //this is used to diffirenciate the instance variable and variable in the param bc they have the same name
        //this will refer to instance variable
        System.out.println("Creating an animal with the full info");
        this.type = type;
        this.breed = breed;
        this.age = age;
        this.duration = duration;
        this.gender = gender;
        this.weight = weight;
        this.isInjured = isInjured;
        System.out.println("Done Creating animal");
        count++;
        countInstance++;
    }
    public Animal(){
    }
    //Give employees an ability to create Animals without duration and weight.
    //when these info is not provided duration should be set to -1;
    //and weight should be set to -1 as well;
    public Animal(String type, String breed, int age, char gender, boolean isInjured) {
//        this.type = type;
//        this.breed = breed;
//        this.age = age;
//        this.gender = gender;
//        this.isInjured = isInjured;
//        this.duration = -1;
//        this.weight = -1;
        //if you are calling another constructor of the class using this()
        //then no other statements can come before the call to this().
        //this() must be the first statement in the constructor
        this(type, breed, age, -1, gender, -1, isInjured);
        System.out.println("Constructor is completed");
    }
    //give the employee a flexibility to create an animal with type, breed, gender
    //duration should be -1;
    //age should be -1;
    //is injured should be false
    //weight should be -1
    //create a method called createAnimalTypeBreedGender() in EmployeeAnimalCreateService.
    //use the newly created constructor.
    //in UserAnimalRequestService
    //if user doest have duration and weight
    //then ask if user has age and injury info
    //if yes then use createAnimalWithoutDurationAndWeight
    //if no then use createAnimalTypeBreedGender.
    //add the animal to the stock
    public String getType() {
        return type;
    }
    //Allow only Dogs, cats, and Rabbit
    //what if I want to have more animal types?
    //create a private instance variable which is List<String> allowedType populate it directly in the declaration part
    //instance methods can have both instance and static variables and methods.
    public void setType(String type) {
        printAllAllowedTypes();
        if (allowedTypes.contains(type.toLowerCase())){
            this.type = type;
        }
        else {
            System.out.println("Unsupported Animal Type");
        }
        switch (type.toLowerCase()) {
            case "dog":
            case "cat":
            case "rabbit":
                this.type = type;
                break;
            default:
                System.out.println("Unsupported Animal Type");
        }
    }
    public String getBreed(){
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public char getGender() {
        return gender;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public boolean isInjured() {
        return isInjured;
    }
    public void setInjured(boolean injured) {
        isInjured = injured;
    }
    //create a method which will heal the animal
    //make sure isInjured is true;
    //void
    public void heal(){
        setInjured(false);
    }
    //if less then 1 mile dont loose any
    //if less then 2 miles then loose 1.5 pound
    //if more than 2 then loose 4 pounds
    public void run(double miles) {
        if (miles > 2) {
            System.out.println(type + " ran for " + miles + " miles and now loosing " + 4 + " lbs");
            this.weight-=4;
        }
        else if(miles > 1 && miles <= 2 ){
            System.out.println(type + " ran for " + miles + " miles and now loosing " + 1.5 + " lbs");
            this.weight-=1.5;
        }
        else {
            System.out.println(type + " didnt run long enough to loose any weight");
        }
    }
    //write a method which will return me a the duration in the shelter of the object
    public String getDurationByTime(){
        Duration duration = Duration.between(timeCreated, LocalDateTime.now());
        return String.valueOf(duration.getSeconds());
    }
    /**
     * Since the static method is on class level
     * which means it info about all animals
     * I cant really use this to give info about a specific object
     *
     * If I could, how would I know which object info should use?
     */
    public static void printAllAllowedTypes(){
        System.out.println(allowedTypes);
    }
    @Override //
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", duration=" + duration +
                ", gender=" + gender +
                ", weight=" + weight +
                ", isInjured=" + isInjured +
                '}';
    }
}
//All code below is used in different class which is responsible for creating animals.
//AccountUser johnDoe = new AccountUser("John Doe", 1213-343-44, 312-111-2224, "jdoe@chase.com");
//Animal dogLabrador = new Animal("Dog", "Labrador", 1, 0, 'F', 12.5, true);
//Animal catGarfiled = new Animal("Cat", "Garfield", 1, 0, 'M', 60, false);
//

