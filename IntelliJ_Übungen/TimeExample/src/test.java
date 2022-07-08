import com.sun.security.auth.UnixNumericGroupPrincipal;
import com.sun.security.auth.UnixNumericUserPrincipal;

import javax.sound.sampled.FloatControl;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class test {
public long toEpochMilli(LocalDateTime localDateTime) {
        return localDateTime.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }
    public static void main(String [] args) {
        long number;
        number = System.currentTimeMillis() /1000;
        System.out.println("Jetzt mit System now : " + number);
        number += (24*60*60*1000);
        System.out.println("Plus ein Tag: "+ number);
        int test = (int) number;
        System.out.println( "System funktion als Interger" + test);
        
        // Date format
        String date = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new java.util.Date());
        System.out.println("Funktion Date: " + date);
        // Probe Funktion
        Instant now = Instant.now();
        int testinstant =(int) now.toEpochMilli();
        System.out.println(testinstant);

        // test Anfang des Tages ausgeben


        // test mit Localdate
        LocalDate today = LocalDate.now();
        System.out.println("Mit localDate: " + today);

        LocalDate tomorrow = today.plusDays(1);
        System.out.println("Morgen: " + tomorrow);
        LocalDateTime startofDay = today.atStartOfDay();
        System.out.println("Test Tagesbeginn: " + startofDay);
        LocalDateTime timenow = LocalDateTime.now();
        long epoch =  (timenow.getLong(ChronoField.EPOCH_DAY)* 86400000) + timenow.getLong(ChronoField.MILLI_OF_DAY);
        System.out.println("Unix zu Localtime: " + epoch);
        // time funktion
        long tester = timenow.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        System.out.println("Funktion für unix: " + tester);
        LocalDateTime endofDay = LocalDateTime.of(today.plusDays(7), LocalTime.MAX);
        System.out.println("In 7 Tagen: " + endofDay);
        boolean ex = endofDay.isAfter(timenow);
        System.out.println("Die Bedingung ist : " + ex);
        LocalDateTime valueoftime =Instant.ofEpochMilli(test).atZone(ZoneId.systemDefault()).toLocalDateTime();
        System.out.println("Ausgabe der umwandlung in Unix: " + valueoftime);
        LocalDateTime valueofend = Instant.ofEpochMilli(test).atZone(ZoneId.systemDefault()).toLocalDateTime();
        System.out.println("Umwandlung der aktuellen Zeit in Local: " + valueofend);
    }

}
