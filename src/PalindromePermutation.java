import java.util.HashMap;

public class PalindromePermutation {
    public static void main(String[] args) {
        String s = "Tact Ca";
        char[] c = s.toLowerCase().toCharArray();
        HashMap<Character,Integer> hm = new HashMap<>();
        int count = 0;
        for(char x: c) {
            if (Character.isLetterOrDigit(x)) {
                if (hm.containsKey(x)) {
                    hm.put(x, hm.get(x) + 1);
                } else {
                    hm.put(x, 1);
                }
                count++;
            }
        }
        int oddCount = 0;
        if(count % 2 != 0){
            for (char x: hm.keySet()){
                if(hm.get(x)% 2 != 0){
                    oddCount++;
                }
            }
            if (oddCount == 1){
                System.out.println("Is a Palindrome");
            }else{
                System.out.println("Not a Palindrome");
            }
        }else{
            for (char x: hm.keySet()){
                if(hm.get(x)% 2 != 0){
                    oddCount++;
                }
            }
            if (oddCount == 0){
                System.out.println("Is a Palindrome");
            }else{
                System.out.println("Not a Palindrome");
            }
        }
        System.out.println(hm);
    }
}
