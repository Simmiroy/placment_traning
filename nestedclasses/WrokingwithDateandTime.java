package nestedclasses;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class WrokingwithDateandTime {
    public static void main(String[] args) {
        LocalDate date=LocalDate.now();
        System.out.println("Date : "+date);
        LocalTime time= LocalTime.now();
        System.out.println("Time: " +time);
        LocalDateTime dateTime= LocalDateTime.now();
        System.out.println("Date & Time: "+dateTime);
        /*Display the day of the month
        * Display the day of the year
        * Display the week name , month name, month number.
        * E- Name of the day:(Mon , Tue..)
        * D- Day of the year (1-366)
        * dd- Day of the month(01-12)
        * MMM- - Month name - Jan - Dec..
        */
        DateTimeFormatter format = DateTimeFormatter.ofPattern("E , MMM dd ,yyyy");
        String formattedDateTime = dateTime.format(format);
        System.out.println("Formatted date : " + formattedDateTime);
    }
}
