package sessions.classes_objects.inheritance;

public class Student {
    private String name;
    private  static int lastStudentId;
    private int rollNum;

    public Student(String name){
        this.name=name;
        rollNum=++lastStudentId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRollNum() {
        return this.rollNum=rollNum;
    }
    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }
    public Student(String name, int rollNum){
        this.name=name;
        this.rollNum=rollNum;
        lastStudentId=rollNum;
    }
    public int solveMultiplication(int num1,int num2){
        return num1*num2;
    }  /**if we are creating an object using full params constructor, roll num should as we provide, no matter if previous one was larger or smaller
     //if the next object has been created with one param constructor--> should to be incremented based on previous object
     //and if two objects in a row created with full param contsructor , values of roll matter not tied to each other(independent)
     /**
     * we need to save all the ids trhat are being created, if we are using 2 params constructor we keep the same rules as above
     * and we are using 1 param constructor we need to use the smallest available id(staring from 0)
     * if we try to create a Student with 2 params constructor and the ID has already been used --> assign next smallest available ID
     * print out “the given ID is not available”+ new assigned ID + “is assigned”);
     *
     * ex:
     * Student student1 = new Student(“John Doe”,6);  ID=6
     * Student student2 = new Student(“Alexa”);  ID=0
     * Student student3 = new Student(“Alexander”); ID=1
     * Student student4 = new Student(“Siri”,5); ID=5
     * Student student5 = new Student(“Steve”); ID= 2
     * Student student6 = new Student(“Ann”,5); ID=3
     * “the given ID is not available”+ (3) + “is assigned”);
     */
}