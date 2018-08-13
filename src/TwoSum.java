class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] index = {-1,-1};
        for(int i=0; i<nums.length; i++){
            for(int j = i+1; j< nums.length ; j++){
                if(nums[i] +nums[j] == target){
                    index[0] = i;
                    index[1] = j;
                }
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int[] index = new int[2];
        int target = 9;
        TwoSum t = new TwoSum();
        index = t.twoSum(nums, target);
        for (int i: index) {
            System.out.print(i+" ");
        }

    }
}