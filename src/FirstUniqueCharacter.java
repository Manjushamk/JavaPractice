public class FirstUniqueCharacter {
    public static int firstUniqChar(String s) {
        int count = 0;
        char currentChar = ' ';
        if(s.length() == 0){
            return -1;
        }
        if(s.length() == 1){
            return 0;
        }
        for(int i =0; i< s.length(); i++){
            currentChar = s.charAt(i);
            count = 1;
            for(int j = 0; j < s.length() ; j++){
                if ((i != j) || (i == s.length() -1)){
                    if(currentChar == s.charAt(j) && (i!= j)){
                        count = count+1;
                        break;
                    }
                }
            }
            if (count == 1){
                return i;
            }
        }
        return -1;
    }

    public static int firstUniqCharac(String s) {
        int[] charCount = new int[26];
        for (int i = 0 ; i != s.length() ; i++) {
            charCount[s.charAt(i) - 'a'] += 1;
        }
        for (int i = 0 ; i != s.length() ; i++) {
            if (charCount[s.charAt(i) - 'a'] == 1) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqCharac("loveleetcode"));
    }

}
