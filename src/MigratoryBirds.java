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

public class MigratoryBirds {
    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {
        int type = Integer.MAX_VALUE;
        HashMap<Integer, Integer> birdCount = new HashMap<>();
        for (int i =0; i<arr.size(); i++){
            if(birdCount.containsKey(arr.get(i))){
                birdCount.put(arr.get(i), birdCount.get(arr.get(i))+1);
            }
            else{
                birdCount.put(arr.get(i), 1);
            }
        }
        int max_count = 0;
        for(int i: birdCount.values()){
            if(i > max_count){
                max_count = i;
            }
        }

        for(int i : birdCount.keySet()){
            if ((birdCount.get(i) == max_count) && (i < type)){
                type = i;
            }
        }
        return type;
    }

    public static void main(String[] args) {
        List<Integer> birdList = new ArrayList<>();

        birdList.add(2);
        birdList.add(5);
        birdList.add(1);
        birdList.add(3);
        birdList.add(4);
        birdList.add(4);
        birdList.add(3);
        birdList.add(5);
        birdList.add(1);
        birdList.add(1);
        birdList.add(2);
        birdList.add(1);
        birdList.add(4);
        birdList.add(3);
        birdList.add(3);
        birdList.add(4);
        birdList.add(2);

        System.out.println(migratoryBirds(birdList));


    }
}

