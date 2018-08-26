import java.util.HashMap;
import java.util.LinkedHashMap;

public class FirstUniqueCharHasmap {
    public static int firstUniqChar(String s) {
        char currentChar = ' ';
        if(s.length() == 0){
            return -1;
        }else if(s.length() == 1){
            return 0;
        }else{
            LinkedHashMap<Character,Integer> hm = new LinkedHashMap<>();
            for (int i = 0; i< s.length(); i++){
                if(hm.containsKey(s.charAt(i))){
                    hm.put(s.charAt(i), hm.get(s.charAt(i)) + 1);
                    continue;
                }
                else{
                    hm.put(s.charAt(i), 1);
                }
            }
            System.out.println(hm);
            for(char x: hm.keySet()){
                if(hm.get(x) == 1){
                    System.out.println(hm);
                    return s.indexOf(x);
                }
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("loveleetcode"));
    }

}
