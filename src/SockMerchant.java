import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SockMerchant {
    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        int pairs = 0;
        HashMap<Integer,Integer> color_count = new HashMap<>();
        for(int i: ar){
            if(color_count.containsKey(i)){
                color_count.put(i, color_count.get(i) + 1);
            }
            else{
                color_count.put(i,1);
            }
        }

        for(int i: color_count.values()){
            pairs += i/2;
        }

        return pairs;
    }

    public static void main(String[] args) {
        int n = 7;
        int[] ar = {10 ,20, 20, 10, 10, 30, 50, 10, 20};
        System.out.println(sockMerchant(n,ar));
    }
}
