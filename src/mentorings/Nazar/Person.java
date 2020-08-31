package mentorings.Nazar;

import java.time.LocalDateTime;

public class Person {
    public static void main(String[] args) {
        int year = LocalDateTime.now().getYear();
        int month = LocalDateTime.now().getMonthValue();
        int day = LocalDateTime.now().getDayOfMonth();
        System.out.println(LocalDateTime.now().getDayOfWeek());
    }
}