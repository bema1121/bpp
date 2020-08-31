package mentorings.Dan;

public class Angle {

    //Angle Between minute and hour
    //What is the angle between minute and hour hands when time is 6.30?

    public static void main(String[] args) {
        //6:30
        //360
        //360/2=180
        //360/4=90
        //180-90=90/3=30/2=15

        System.out.println(findAngles(6, 30));
    }

    public static double findAngles(int hour, int minute) {
        double total = 0;

        if ((hour >= 0 && hour <= 12) && (minute >= 0 && minute <= 59)) {
            //                 (6*30)    +       (30*0.5) = 180+15=195
            double hourMove = (hour * 30) + (minute * 0.5); //(min*6)/12
            double angle = minute * 6; //30*6=180
            total = Math.abs(hourMove - angle); //195-180=15
        }

        return total;


    }

}


