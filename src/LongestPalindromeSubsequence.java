public class LongestPalindromeSubsequence {
    public static boolean checkPalindrome(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        if(sb.toString().equals(s)){
            return true;
        }
        return false;
    }

    public static String longestPalindrome(String s) {
        if(s.length() == 1){
            return s;
        }
        String palindrome = new String();
        int max_length = 0;
        int i = 0;
        int start = 0;
        int count = 0;
        while(start < s.length()){
            i = start+1;
            while (i <= s.length()){
                if(checkPalindrome(s.substring(start,i))) {
                    if (max_length < (i-start)) {
                        max_length = (i-start);
                        palindrome = s.substring(start, i);
                    }
                }
                i++;
            }
            start++;
        }
        return palindrome;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("kyyrjtdplseovzwjkykrjwhxquwxsfsorjiumvxjhjmgeueafubtonhlerrgsgohfosqssmizcuqryqomsipovhhodpfyudtusjhonlqabhxfahfcjqxyckycstcqwxvicwkjeuboerkmjshfgiglceycmycadpnvoeaurqatesivajoqdilynbcihnidbizwkuaoegmytopzdmvvoewvhebqzskseeubnretjgnmyjwwgcooytfojeuzcuyhsznbcaiqpwcyusyyywqmmvqzvvceylnuwcbxybhqpvjumzomnabrjgcfaabqmiotlfojnyuolostmtacbwmwlqdfkbfikusuqtupdwdrjwqmuudbcvtpieiwteqbeyfyqejglmxofdjksqmzeugwvuniaxdrunyunnqpbnfbgqemvamaxuhjbyzqmhalrprhnindrkbopwbwsjeqrmyqipnqvjqzpjalqyfvaavyhytetllzupxjwozdfpmjhjlrnitnjgapzrakcqahaqetwllaaiadalmxgvpawqpgecojxfvcgxsbrldktufdrogkogbltcezflyctklpqrjymqzyzmtlssnavzcquytcskcnjzzrytsvawkavzboncxlhqfiofuohehaygxidxsofhmhzygklliovnwqbwwiiyarxtoihvjkdrzqsnmhdtdlpckuayhtfyirnhkrhbrwkdymjrjklonyggqnxhfvtkqxoicakzsxmgczpwhpkzcntkcwhkdkxvfnjbvjjoumczjyvdgkfukfuldolqnauvoyhoheoqvpwoisniv"));
    }
}
