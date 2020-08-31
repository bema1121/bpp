package myExamples.randomRp.Methods;

public class sohbetTime {
    public static void main(String[] args) {


        sohbetTime isMyobj = new sohbetTime();

        boolean time = isMyobj.isSohbetTime("wednesday", 1);
        System.out.println(time);


    }

    public boolean isSohbetTime(String day, int time) {
        boolean result = false;

        if (day.equalsIgnoreCase("Wednesday") && time == 1) {
            result = true;
            return result;
        } else {
            result = false;
            return result;
        }
    }
}