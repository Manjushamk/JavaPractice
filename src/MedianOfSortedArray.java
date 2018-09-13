public class MedianOfSortedArray {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] num3 = new int[((nums1.length + nums2.length)/2) + 1];
        int i = 0, j = 0,k = 0;
        int median = (nums1.length + nums2.length)/2;
        while( (i< nums1.length) && (j < nums2.length) && ((i + j) <= median) ){
            if(nums1[i] < nums2[j]){
                num3[k] = nums1[i];
                i++;
                k++;
            }else{
                num3[k] = nums2[j];
                j++;
                k++;
            }
        }
        while((i < nums1.length) && ((i + j) <= median) ){
            num3[k] = nums1[i];
            i++;
            k++;
        }
        while ((j < nums2.length) && ((i + j) <= median) ){
            num3[k] = nums2[j];
            j++;
            k++;
        }
        if(((nums1.length + nums2.length)) % 2 != 0){
            return num3[median];
        }else{
            return (double)(num3[median] + num3[median - 1])/2;
        }
    }

    public static void main(String[] args) {
        int[] num1 = {};
        int[] num2 = {1,2,3};

        System.out.println(findMedianSortedArrays(num1,num2));
    }
}
