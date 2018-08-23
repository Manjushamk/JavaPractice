import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BreakingBestWorstRecord {
    static int[] breakingRecords(int[] scores){
        int min_score = scores[0];
        int max_score = scores[0];
        int[] change = {0,0};
        for(int i = 1; i < scores.length; i++){
            if(scores[i] > max_score){
                change[0] = change[0] + 1;
                max_score = scores[i];
            }
            if(scores[i] < min_score){
                change[1] = change[1] + 1;
                min_score = scores[i];
            }
        }
        return change;
    }

    public static void main(String[] args) {
        int[] scores = {10,5,20,20,4,5,2,25,1};
        int[] result = breakingRecords(scores);
        for(int i:result){
            System.out.println(i);
        }
    }
}
