package homeWorks.Arrays;

public class PrintOutAll {
    public static void main(String[] args) {
        String[] month = {
                "", "Jan", "Feb", "Mar", "Apr", "May", "Jun",
                "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        for(int m = 0; m < month.length; m++ ){
            System.out.println(month[m]);
            if(month[m] == "Jan"){
                System.out.println("My birthday is in: "+month[m]);
                continue;
            }

        }



        }
    }

//    a) Print out all months
//
//    b) By using index find the your birthday month among the String array below.
//
//            Example: Apr
//
//    String[] MONTHS = {
//            "", "Jan", "Feb", "Mar", "Apr", "May", "Jun",
//            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
//    };
//...
//        System.out.println(MONTHS[m]);
//
//}
