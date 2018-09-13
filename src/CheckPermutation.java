import java.util.Arrays;

public class CheckPermutation {

    public static void main(String[] args) {
        String s1 = "hfdgh";
        String s2 = "abedf";
        System.out.println(permutate(s1, s2));
        System.out.println(permutate2(s1,s2));
    }

    private static boolean permutate2(String s1, String s2) {
        if(s1.length() != s2.length()){
            return false;
        }
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        int[] characters = new int[128];
        for (char c: s1.toCharArray()){
            characters[c]++;
        }
        for (char c: s2.toCharArray()){
            characters[c]--;
            if (characters[c] < 0){
                return false;
            }
        }
        return true;
    }

    private static boolean permutate(String s1, String s2) {
        if(s1.length() != s2.length()){
            return false;
        }else {
            char[] c1 = s1.toCharArray();
            char[] c2 = s2.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            s1 = new String(c1);
            s2 = new String(c2);
            return s1.equals(s2);
        }
    }
}
