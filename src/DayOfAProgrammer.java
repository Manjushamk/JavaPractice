import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class DayOfAProgrammer {
    // Complete the dayOfProgrammer function below.
    static String dayOfProgrammer(int year) {
        int allMonthsAugSum = 215;
        String month = "09";
        String yyyy = Integer.toString(year);
        String day = "";
        int feb = 0;
        if (year == 1918){
            feb = 15;
        }
        else if(year >= 1700 && year < 1918){
            if(year % 4 == 0){
                feb = 29;
            }
            else{
                feb = 28;
            }
        }
        else{
            if((year % 400 == 0) || ( (year % 4 == 0) && (year % 100 != 0))){
                feb = 29;
            }
            else{
                feb = 28;
            }
        }
        day = Integer.toString(256 - (allMonthsAugSum + feb));
        return day+"."+month+"."+yyyy;
    }

    public static void main(String[] args) {
        int year = 1918;
        System.out.println(dayOfProgrammer(1917));

    }
}
