public class ReverseWordsOfString {
    public static String reverseWords(String s) {
        String[] str = s.split("\\s+");
        int end = str.length -1;
        int start = 0;
        String temp;
        for(;start < end; start++,end--){
            temp = str[start];
            str[start] = str[end];
            str[end] = temp;
        }
        return String.join(" ", str).trim();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords(" 1"));
    }
}

