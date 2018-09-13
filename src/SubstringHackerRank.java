import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SubstringHackerRank {
    static String hackerrankInString(String s) {
        char[] checkWord = {'h', 'a', 'c','k','e','r','r','a','n','k'};

        List<Character> checkString = new ArrayList<>();
        for(int i = 0; i< s.length(); i++){
            checkString.add(s.charAt(i));
        }

        int j = -1;
        char check_char = ' ';
        int count = 0;

        for(int i =0; i<checkWord.length; i++){
            check_char = checkWord[i];
            while(j < checkString.size() - 1){
                j++;
                if (check_char == checkString.get(j)){
                    count++;
                    break;
                }
            }
        }

        if(count == checkWord.length){
            return "YES";
        }
        return "NO";
    }

    public static void main(String[] args) {
        String checkString = "rhbaasdndfsdskgbfefdbrsdfhuyatrjtcrtyytktjjt";
        System.out.println(hackerrankInString(checkString));
    }

}
