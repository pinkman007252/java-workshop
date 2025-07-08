package tem.bin;

import java.time.LocalTime;

public class Registration {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        LocalTime registrationTime = LocalTime.of(18, 59, 59);
        int hrs = registrationTime.getHour() - currentTime.getHour();
        int min = registrationTime.getMinute() - currentTime.getMinute();
        int sec = registrationTime.getSecond() - currentTime.getSecond();
        System.out.println("Time left for registration: " + hrs + " hours, " + min + " minutes, " + sec + " seconds");      
    }
}








