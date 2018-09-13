import java.lang.reflect.Array;
import java.util.*;

public class SampleR
{
    public List<List<Integer>> threeSum(int[] nums) {
        List<Integer> l = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            l.add(nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int k = (-(nums[i] + nums[j]));
                if (l.contains(k) && (l.indexOf(k) != i) && (l.indexOf(k) != j)) {
                    if (l.contains(-k) && (l.indexOf(-k) != i) && (l.indexOf(-k) != j)) {
                        System.out.println();
                        System.out.println(-k);
                        System.out.println(nums[i]);
                        System.out.println(nums[j]);
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(-k);
                        Collections.sort(temp);
                        if (!result.contains(temp)) {
                            result.add(temp);
                        }

                    }
                }
            }

        }
        return result;
    }

    public static void main(String[] args) {
        int x = 1;
        int y = -2;
        int k = (x+y);
        System.out.println((-k));
    }
}