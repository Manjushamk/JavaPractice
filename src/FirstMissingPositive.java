import java.util.HashSet;

public class FirstMissingPositive {
    public static int firstMissingPositive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int count = 0;
        int i;
        for( int x: nums){
            if(x > 0){
                hs.add(x);
            }
            else{
                count += 1;
            }
        }

        for( i = 1; i<= nums.length - count; i++){
            if(!hs.contains(i)){
                return i;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,0, -1, 3};
        System.out.println(firstMissingPositive(nums));
    }
}
