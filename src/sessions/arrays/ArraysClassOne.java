package sessions.arrays;

import java.util.Arrays;

public class ArraysClassOne {
    public static void main(String[] args) {
        //I want to have the name of first 5 students in the zoom
        String[] studentsNames = new String[5];
        System.out.println(studentsNames[0]);
        studentsNames[0] = "Elon Musk";
        System.out.println(studentsNames[0]);
        studentsNames[1] = "Bill Gates";
        System.out.println(studentsNames[1]);
        studentsNames[2] = "Melanie Perk";
        System.out.println(studentsNames[2]);
        studentsNames[3] = "Jeff Bezos";
        System.out.println(studentsNames[3]);
        studentsNames[4] = "John Doe";
        System.out.println(studentsNames[4]);
        studentsNames[1] = "Warren Buffet";
        System.out.println(studentsNames[1]);

        System.out.println(Arrays.toString(studentsNames));


    }
}
