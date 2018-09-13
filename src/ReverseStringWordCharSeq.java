public class ReverseStringWordCharSeq {
    public static void reverseWords(char[] str) {
        char prevChar;
        int start = 0;
        char temp;
        int end = str.length - 1;
        for( ;start < end; start++,end--){
            temp = str[start];
            str[start] = str[end];
            str[end] = temp;
        }
        end = 0;
        start = 0;
        for(int i = 0; i < str.length ; i++){
            if(str[i] == ' ' || i == str.length -1 ){
                if(str[i] == ' '){
                    end = i - 1;
                }
                else{
                    end = i;
                }
                for( ;start < end; start++,end--){
                    temp = str[start];
                    str[start] = str[end];
                    str[end] = temp;
                }
                start = i+1;
            }
        }
        System.out.println(new String(str));
    }

    public static void main(String[] args) {
        char[] charAr = {'t','h','e',' ','s','k','y',' ','i','s',' ','b','l','u','e'};
        reverseWords(charAr);
    }

}
