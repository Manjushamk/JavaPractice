public class PermutationsOfString {
    public static void permutate(String str,int l,int r){
        if(l == r){
            System.out.println(str);
        }else{
            for(int i = l; i<= r; i++){
                str = swap(str,l,i);
                permutate(str,l+1,r);
                str = swap(str,l,i);
            }
        }
    }

    private static String swap(String str, int l, int i) {
        char temp;
        char[] c = str.toCharArray();
        temp = c[l];
        c[l] = c[i];
        c[i] = temp;
        return String.valueOf(c);
    }


    public static void main(String[] args) {
        String s = "AA";
        permutate(s,0,s.length()-1);
    }
}
