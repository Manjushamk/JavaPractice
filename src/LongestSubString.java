import java.util.HashSet;

public class LongestSubString {
    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int tempSize = 0;
        HashSet<Character> hs = new HashSet();
        int i = 0;
        while ( i< s.length()){
            if(!hs.contains(s.charAt(i))){
                hs.add(s.charAt(i));
                tempSize += 1;
                i++;
            }else{
                hs.clear();
                i = i - tempSize + 1;
                if(tempSize > maxLength){
                    maxLength = tempSize;
                }
                tempSize = 0;
            }
        }
        if(tempSize > maxLength){
            maxLength = tempSize;
        }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("dvdf"));
    }
}


