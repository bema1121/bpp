package myExamples.custom_classes_encapsulation;

public class Person {
    //declare name and age encapsulated data
    private String nName;
    private int age;

    //getter and setter methods for name
    //read only
    public String getName(){
        return nName;
    }
    //write only - void
    public void setName(String fname){
        if(nName.isEmpty()){
            return;
        }
        this.nName = fname;
    }

}
