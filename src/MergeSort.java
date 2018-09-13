public class MergeSort {

    private static void mergeSort(int[] a, int l, int r) {
        if(l<r){
            int mid = (l+r) /2;
            mergeSort(a,l,mid);
            mergeSort(a,mid + 1,r);
            merge(a,l,mid,r);
        }
    }

    private static void merge(int[] a, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;

        int[] temp1 = new int[n1];
        int[] temp2 = new int[n2];

        for (int i = 0; i< n1; i++){
            temp1[i] = a[l+i];
        }

        for (int i = 0; i< n2; i++){
            temp2[i] = a[mid +1 + i];
        }

        int i = 0,j = 0, k = l;
        while(i< n1 && j < n2){
            if(temp1[i] <= temp2[j]){
                a[k] = temp1[i];
                i++;
            }
            else{
                a[k] = temp2[j];
                j++;
            }
            k++;
        }

        while(i < n1){
            a[k] = temp1[i];
            i++;
            k++;
        }
        while(j < n2){
            a[k] = temp2[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] a = {5,0,8,2,4,1};
        mergeSort(a, 0, a.length - 1);
        for (int i=0; i<a.length; ++i)
            System.out.print(a[i] + " ");
    }
}

