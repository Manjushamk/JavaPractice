import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BonAppetit {
    // Complete the bonAppetit function below.
    static void bonAppetit(List<Integer> bill, int k, int b) {
        int sum = 0;
        for(int i: bill){
            sum += i;
        }

        int each_split = (sum - bill.get(k))/2;
        if( b == each_split){
            System.out.println("Bon Appetit");
        }
        else{
            System.out.println((b-each_split));
        }
    }

    public static void main(String[] args) {
        List<Integer> billList = new ArrayList<>();
        int k = 1;
        int b = 7;
        billList.add(3);
        billList.add(10);
        billList.add(2);
        billList.add(9);
        bonAppetit(billList,k,b);
    }
}
