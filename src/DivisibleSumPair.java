import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class DivisibleSumPair {
    static int divisibleSumPairs(int n, int k, int[] ar) {
        int count = 0;
        int sum = 0;
        for(int i=0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(ar[i] < ar[j] && i != j){
                    sum = ar[i] + ar[j];
                    if (sum % k == 0){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] ar ={1,2,3,4,5,6};
        int n = 6;
        int k = 5;
        System.out.println(divisibleSumPairs(n,k,ar));
    }
}
