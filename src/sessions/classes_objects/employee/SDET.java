package sessions.classes_objects.employee;

//Every
public class SDET extends Employee {

    private String programmingLanguage;

    public SDET(int id, String name, String programmingLanguage) {
        super(id, name);
        this.programmingLanguage = programmingLanguage;

    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public String toString() {
        return getId() + "" + getName() + "" + programmingLanguage;
    }

    //wen a class extend another, now it has to abide to certain rules.
    //specifically in using the same method names in super and sub classes
    //when a subclass wants to use the same method name with same params
    //this process is called method overriding
//    public int celebrate(){
//        System.out.println(getId()+" Yaaay");
//        return 2;
//    }


    //Method overriding -> is a specific implementation of a method for the subclass.
    //which basically means I don't want SDET to celebrate  like all employees do,
    //I want to celebrate my own way.
    //keeping name there, but changing the logic.

    public void celebrate(){
        System.out.println(getName()+" I am a Java Geek");
    }

    //Override -> present
    //Overridden -> present perfect

    //Overloading
    private void print(){

    }

}
