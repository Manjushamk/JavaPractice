import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PlusMinus {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        double pos = 0;
        double neg = 0;
        double zero = 0;
        int n = arr.length;
        for(int i = 0; i<n; i++){
            if(arr[i] < 0){
                neg += 1;
            }
            else if(arr[i] > 0){
                pos += 1;
            }else{
                zero += 1;
            }
        }
        System.out.println((pos)/n);
        System.out.println((neg)/n);
        System.out.println((zero)/n);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
