package mentorings.Nazar;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DtTmPractise {

    // 02-01-2020
    // 02.01.2020
    public static void main(String[] args) {
        //LocalDateTime class constructor declared private
        LocalDateTime dt1 = LocalDateTime.now(); //current date and time
        // System.out.println(dt1.getDayOfMonth());
        System.out.println(dt1);
        LocalDate date = LocalDate.now();
        System.out.println(date);
        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDateTime dt2 = LocalDateTime.of(date, time);
        LocalDateTime dt3 = LocalDateTime.of(2002, 12, 22, 5, 25, 34);

        //Way to format Date and time
       // DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MMM-dd");
        //System.out.println(format.format(dt2));

//        LocalDateTime dt4 = LocalDateTime.parse("2020-03-03",format);
//        System.out.println(dt4);

        String time3 = "2019-03-27T10:15:30";
        LocalDateTime localTimeObj = LocalDateTime.parse(time3);

//2 - specific date time pattern
        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss a");
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MMM-dd");
        String time1 = "2019-03-27 10:15:30 AM";
        LocalDateTime localTimeObj1 = LocalDateTime.parse(time1, format);
        System.out.println(localTimeObj1);

        //System.out.println(dt2.compareTo(dt3));


    }
}
