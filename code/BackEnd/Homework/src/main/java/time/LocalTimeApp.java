package time;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeApp {
    public static void main(String[] args) {
        System.out.println(getRemainder(10, 11));
        System.out.println(getRemainder(1, 0));
    }

    public static void whileLoopsInJava(int limit) {
        int count = 0;
        while(count < limit) {
            LocalTime localTime = LocalTime.now().truncatedTo(ChronoUnit.MILLIS);
            System.out.println(STR."It is now: \{localTime}");
            count++;
        }

       for(int newCount = 0; newCount < limit; newCount++) {
           LocalTime localTime = LocalTime.now().truncatedTo(ChronoUnit.MILLIS);
           System.out.println(localTime);
       }
    }

    public static int getRemainder(int numerator, int denominator) {
       int rem = 0;
       if (denominator == 0) {
           System.out.println("Ooops!");
       } else {
           rem = numerator % denominator;
       }
       return rem;
    }
}
