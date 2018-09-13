public class BeautifulArrangement {
    static int count = 0;
    public static void combinations(int[] numbers, int len){
        if(len == numbers.length){
            count++;
        }
        for (int i = len; i< numbers.length;i++){
            swap(numbers,i,len);
            if((numbers[len]% (len + 1)) == 0 || ((len+1)%(numbers[len]))== 0){
                combinations(numbers, len+1);
            }
            swap(numbers,i,len);
        }
    }
    public static void swap(int[] numbers, int p, int q){
        int temp = numbers[p];
        numbers[p] = numbers[q];
        numbers[q] = temp;
    }
    static int arrangements(int n) {
    int[] numbers = new int[n];
    for(int i = 1; i<=n; i++){
        numbers[i-1] = i;
    }
    combinations(numbers,0);
    return count;
    }
}
