package sessions.Loops;

public class Continue {
    public static void main(String[] args) {

        //continue - statement -> jumps to the next loop by skipping the remaining commands
        //after the continue statement

        for (int i = 0; i < 10; i++) {
            if(i == 2){
            continue;
        }
            System.out.println("Hello"+i);
    }

        //print me out numbers that are visible by 2.
        //all even number in the range of 0-100

        for(int i = 0; i < 100;i++){
            if(i % 2 != 0 ){
                continue;
            }
            System.out.println(i);
        }

        //continue is used to skip some part of the loop
        //based on a certain criteria or condition
        String[] arr = {"Male" , "Female" ,"Male" , "Female"};

        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals("Male")){
                continue;
            }
            System.out.println("Congratz dear ");
        }

        //write a program which will print out all number between 0 - 100.
        //except 10th. 10,20,30,40,50,60,70,80,90

        for(int i = 1; i < 100;i++){
            if(i % 10 == 0){
                continue;
            }
            System.out.println(i);
        }

        //write a program which will print out all number starting from 100 till 0
        //skip 9th, 19,29

        for(int i = 100;i > 1;i--) {
            if (i % 10 == 9) {
                continue;
            }
            System.out.println(i);
        }

        //2020 --> sports world that there is no champion in this year.
        //

        for(int i = 2000;i < 2020;i++){
            System.out.println("Champion of "+i+" some team name");
        }






        }}