public class findSequenceToNum {
    public static void main(String[] args) {
        int n = 4;
        int a = 2;
        int sum = 0;
        int[] arr = new int[n-a];
        int num = 1;
        int count = 0;
        for(int i = 0; i<a; i++,num++){
            arr[i] = num;
        }
        for(int i = 0; i< arr.length; i++){
            int j = i;
            while(j< arr.length && (sum < n)){
                System.out.println(arr[i]);
                sum = sum+arr[i];
            }

            System.out.println();
            if(sum == n){
                count++;
            }
            sum = 0;
        }
        System.out.println(count);
    }
}