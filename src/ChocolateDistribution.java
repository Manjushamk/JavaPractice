import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ChocolateDistribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0) {
            int n = sc.nextInt();
            int[] c = new int[n];
            int[][] testC = new int[t][];
            for (int i = 0; i < n; i++) {
                c[i] = sc.nextInt();
            }
            Arrays.sort(c);
            int m = sc.nextInt();
            if (n <= 1) {
                System.out.println(0);
            } else {
                int min = c[m - 1] - c[0];
                int temp_min = 0;
                for (int i = 1; i < n - m + 1; i++) {
                    temp_min = c[m + i - 1] - c[i];
                    if (temp_min < min) {
                        min = temp_min;
                    }
                }
                System.out.println(min);
            }
            t--;
        }
    }
}


