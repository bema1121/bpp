package sessions.classes_objects.inheritance;

//Inheritance
//HighAchiever is a subclass(child) of Student
//Student is a super(parent) class of HighAchiever
public class HighAchiever extends Student {
    //every constructor's first statement is
    //either a call to super class constructor(super())
    //or call to a diff constructor within the same class
    //using this().
    //if no super() or this() with any params declared explicitly, super()(empty params) is being called
    private double gpa;
    public HighAchiever(String name, int rollNo, double gpa) {
        //all instance variables declared in the super class
        //we need to initialize using super()
        //super is a call to a direct parent class constructor
        super(name,rollNo);
        //extra, unique properties of the subclass must be initialized the standard way after super()
        this.gpa = gpa;
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}


//What is inheritance?
//Inheritance is a process in java one of the principles of OOP
//where we have a flexibility to create objects that are very similar to other objects
//but have little more information
//so one class can extend another class
//so the subclass inherits(brings in) all public and protected properties of super class
//this way we will avoid repeating the same steps of declaring the major part of the instance variable
//declaration and having have to write :::::
//ex:
//Animal ->
//type
//breed
//color
//age

//public void setAge(int age){
//     if(age>0){
//       this.age = age;
//      }
//    }

//class Dog extends Animal
//tail
