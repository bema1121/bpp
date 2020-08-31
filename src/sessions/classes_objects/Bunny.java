package sessions.classes_objects;

import java.util.List;

public class Bunny {

    public String color;
    public int length;
    public int height;
    public char gender;
    public List<String> vegetablesEaten;
    //What is the purpose of overloading constructors?
    //Always take deep down. Start from the fundamentals.
    //Since constructors are used to create objects
    //and give the object initial state by initializing the
    //instance variables with values coming from the Constructor param.
    //Overloading constructors give us an ability to to take only necessary info
    //and skip some of the instance variables uninitialized.
    //Object have state and behavior, nothing else.
    //Note: next notes are specific to this class
    //by creating an object with no arg constructor we are creating Bunny object
    //whose state is default. so color is null, length and height is 0,gender is /000
    public Bunny() {
    }
    //
    public Bunny(String color) {
        this.color = color;//take the value from user and give the initial state of the Bunny object that will be
        //created using this constructor.
        //Only color is initialized in the state of the bunny created using this constructor.
        //every other state info is defaulted.
    }
    //create a constructor which will be used to create a Bunny object
    //only with color, length, height. and skip gender
    public Bunny(String color, int length, int height) {
        this.color = color;
        this.length = length;
        this.height = height;
        //if I create Bunny using this constructor and will create a Bunny object
        //state will have values coming from user
        //for color length and height
        //gender will be default value(empty)
    }
    //create a constructor which will be used to create a Bunny object
    //with all info
    public Bunny(String color, int length, int height, char gender) {
        this.color = color;
        this.length = length;
        this.height = height;
        this.gender = gender;
    }


    //generate
    //constructor
    //choose the instance variables you want to use;
    public Bunny(String color, int length, int height, char gender, List<String> vegetablesEaten) {
        this.color = color;
        this.length = length;
        this.height = height;
        this.gender = gender;
        this.vegetablesEaten = vegetablesEaten;
    }
}


