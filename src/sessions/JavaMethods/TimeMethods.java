package sessions.JavaMethods;

public class TimeMethods {
    public static void main(String[] args) {
        TimeMethods tm = new TimeMethods();
        //tm.convertMinusToDaysHrsMinutes(12333)

    }

    //convert minutes to days,hrs,minutes
    //to get days from minutes -> minutes/24/60
    //to get hours from minutes -> minutes/60%24
    //get the minutes -> minutes%60

    //int if statement we put a boolean
    public void convertMinutesToDaysHrsMinutes(int minutes) {
        if(isValidInput(minutes)){
            String daysHrsMinutes = convertMinutesToDays(minutes)+ "days"
                    + convertMinutesToHours(minutes)+"hours"
                    +getRemainingMinutes(minutes)+ "minutes";
            System.out.println(daysHrsMinutes);
        }else{
            System.out.println("Not an acceptable value");
        }

    }

    //convert minutes to days
    //give the days from minutes
    public int convertMinutesToDays(int minutes) {
        if (isValidInput(minutes)) {
            return minutes / 24 / 60;
        } else {
            return -1; //wrong result
        }
    }
    public int convertMinutesToHours(int minutes){
        if(isValidInput(minutes)){
            return minutes / 60 % 24;
        }else{
            return -1;
        }
    }
    public int getRemainingMinutes(int minutes){
        if(isValidInput(minutes)){
            return minutes % 60;
        }else{
            return -1;
        }
    }

    public boolean isValidInput(int minutes) {
        return minutes > 0;
    }
}







