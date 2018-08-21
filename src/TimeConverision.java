
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class TimeConverision {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        String[] time = s.split(":");
        String hrs = time[0];
        String mins = time[1];
        String[] sc =  time[2].split("");
        String sec = sc[0].concat(sc[1]);
        String am_pm = sc[2].concat(sc[3]);
        if(am_pm.equals("AM")){
            if(hrs.equals("12")){
                s = "00" + ":" + mins + ":" + sec;
            }
            else{
                s = hrs + ":" + mins + ":" + sec;
            }
            return s;
        }else{
            if(hrs.equals("12")){
                s = "12" +":" + mins + ":" + sec;
            }
            else{
                int hours = Integer.parseInt(hrs);
                hours = hours + 12;
                hrs = Integer.toString(hours);
                s = hrs + ":" + mins + ":" + sec;
            }
            return s;
        }

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String s = "07:05:45PM";
        //String s = "09:05:00AM";
        String result = timeConversion(s);
        System.out.println(result);
    }
}
