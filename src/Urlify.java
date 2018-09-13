public class Urlify {
    public static void main(String[] args) {
        String s = "Mr John Smith           ";
        System.out.println(urlFy(s));
        System.out.print(urlFy2(s, 13));
    }

    private static String urlFy2(String s, int t) {
        char[] c = s.toCharArray();
        int spaceCount= 0;
        int i = 0;
        for(char x: c){
            if (x == ' ' && i< t){
                spaceCount++;
            }
            i++;
        }
        int index = t + (2* spaceCount);
        System.out.println(spaceCount);
        if(c.length > t){
            c[t] = '\0';
        }
        for(i = t-1; i> 0; i--){
            if(c[i] == ' '){
                c[index - 1] = '0';
                c[index - 2] = '2';
                c[index - 3] = '%';
                index = index - 3;
            }else{
                c[index - 1] = c[i];
                index--;
            }
        }
        s = new String(c);
        return s;
    }

    private static String urlFy(String s) {
        s = s.trim().replace(" ", "%20");
        return s;
    }
}
