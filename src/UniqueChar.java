public class UniqueChar {

    public static void main(String[] args) {
        String s = "";
        if(s.length() > 128){
            System.out.println("Not Unique");
        }else{
            boolean[] c = new boolean[128];
            int i =0;
            while(i< s.length()){
                int val = s.charAt(i);
                if(c[val]){
                    System.out.println("not Unique");
                    return;
                }
                c[val] = true;
                i++;
            }
            System.out.println("Unique");
        }

    }
}
