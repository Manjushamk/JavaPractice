import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BirthdayCakeCandles {
    static int birthdayCakeCandles(int[] ar) {
        int max = 0;
        int count = 0;
        for(int i = 0; i < ar.length; i++){
            if(ar[i] >= max){
                if(max == ar[i]){
                    count += 1;
                }
                if(ar[i] > max){
                    max = ar[i];
                    count = 1;
                }
            }
        }
        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        int[] arr =  {1,4,4,4,5};
         birthdayCakeCandles(arr);
    }
}
