import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Kangaroo {

    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {
        if(((x1 < x2)&&(v1 > v2)) || ((x1 > x2)&&(v1 < v2))){
            if(((x1 - x2) % (v2 - v1)) == 0 ){
                return "YES";
            }
        }
        return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int x1 = 0;

        int v1 = 2;

        int x2 = 5;

        int v2 = 3;

        String result = kangaroo(x1, v1, x2, v2);

        System.out.println(result);
    }
}

