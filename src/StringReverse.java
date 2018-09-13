import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class StringReverse {
    public static String reverseString(String s) {
        int start = 0;
        int end = s.length() -1;
        char temp;
        char[] charArray = s.toCharArray();
        for( ;start < end; start++,end--){
            temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
        }
        return new String(charArray);
    }
    public static void main(String[] args) {
        System.out.println(reverseString("hello"));
    }
}
