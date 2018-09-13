import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MinMaxSum {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        long sum = 0;
        for (int i: arr) {
            sum += i;
        }

        long max = Math.max(sum - arr[0],Math.max(sum - arr[1], Math.max(sum - arr[2],
                Math.max(sum - arr[3], sum - arr[4] ))));
        long min = Math.min(sum - arr[0],Math.min(sum - arr[1], Math.min(sum - arr[2],
                Math.min(sum - arr[3], sum - arr[4] ))));
        System.out.print(min + " " +max);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        miniMaxSum(arr);

    }
}
