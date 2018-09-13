public class StringCompression {
    public static void main(String[] args) {
        String s = "abbbcdd";
        System.out.println(stringCompress(s));
    }

    private static String stringCompress(String s) {
        StringBuilder compressedString = new StringBuilder();
        int count = 0;
        for(int i =0; i< s.length(); i++){
            count++;
            if( i+1 >= s.length() || s.charAt(i) != s.charAt(i+1)){
                compressedString.append(s.charAt(i));
                compressedString.append(count);
                count = 0;
            }
        }
        return compressedString.length() < s.length() ? compressedString.toString():s;
    }
}
