import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class ChocolateSegmentSlidingWindow {
    // Complete the birthday function below.
    static int birthday(List<Integer> s, int d, int m) {
        int count = 0;
        int temp_sum = 0;
        for(int i=0; i< m; i++){
            temp_sum += s.get(i);
        }

        if(temp_sum == d){
            count++;
        }

        for (int i= m ; i< s.size(); i++){
            temp_sum += s.get(i) - s.get(i-m);
            if(temp_sum == d){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> chocolateList = new ArrayList<>();

        chocolateList.add(2);
        chocolateList.add(5);
        chocolateList.add(1);
        chocolateList.add(3);
        chocolateList.add(4);
        chocolateList.add(4);
        chocolateList.add(3);
        chocolateList.add(5);
        chocolateList.add(1);
        chocolateList.add(1);
        chocolateList.add(2);
        chocolateList.add(1);
        chocolateList.add(4);
        chocolateList.add(1);
        chocolateList.add(3);
        chocolateList.add(3);
        chocolateList.add(4);
        chocolateList.add(2);
        chocolateList.add(1);
        int result = birthday(chocolateList,18,7);
        System.out.println(result);

    }
}
