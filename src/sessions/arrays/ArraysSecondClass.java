package sessions.arrays;

public class ArraysSecondClass {
    public static void main(String[] args) {
        //size of the Array must be given in integer
        //int size = 5;
//        Scanner scanner = new Scanner(System.in);
//        int size = scanner.nextInt();
//        String[] farm = new String[size];

        String[] farm = new String[5];
        System.out.println(farm[0]);
        farm[0] = "Monkey";
        System.out.println(farm[0]);
        farm[1] = "Horse";
        farm[2] = "chimp";
        farm[3] = "parrot";
        farm[4] = "Snake";
        System.out.println(farm[3]);
        System.out.println(farm[1]);
        System.out.println(farm);  //hashcode --> a location in the heap(memory)
        System.out.println(farm[4]);

        String snakeVar = farm[4]; //String snake = "Snake";

        //fam[4] will ask what do you have in the room(cell) number 4
        //result will be given but the element in the cell will still be there.
        System.out.println(snakeVar);
        System.out.println(farm[4]);

        System.out.println(snakeVar.toUpperCase());
        System.out.println(farm[4].toUpperCase());

        //initialization second approach
        //farmArr
        //we have 5 elements
        //but counting start from zero

        //Compile time error --> errors that don't allow us to
        //compile the code from .java to .class bytecode
        //Thus we are unable to run the program

        //Runtime exceptions are the errors that occur inly while program is running
        //Java doesn't know if the error exists before hand
        String[] farmArr = {"Monkey","Horse","Chimp","Tiger","Leo"};
        System.out.println(farmArr[4]);

        System.out.println(farm[1]);
        // System.out.println(farm[10]); java.lang.ArrayIndexOutOfBoundsException: 10

        System.out.println(farm.length); //characteristics of the class(object)
        //Task to print out all of the values from arrays with just one System.out.println()





    }
}
