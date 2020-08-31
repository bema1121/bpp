package sessions.classes_objects.statics;

import sessions.classes_objects.Animal;

public class AnimalInstanceCounter {
    public static void main(String[] args) {

        System.out.println(Animal.count);
        Animal animal = new Animal("Dog", "Labrador", 2, 0,'M', 12,false);
        Animal animal2 = new Animal("Cat", "Garfield", 1, 0,'F', 9,true);
        System.out.println(animal.countInstance);
        System.out.println(animal.count);
        System.out.println(animal2.count);
        System.out.println(Animal.count);
    }

}

