public class OneWay {
    public static void main(String[] args) {
        String s1 = "gdle";
        String s2 = "Pale";
        System.out.println(checkOneWay(s1,s2));
    }

    private static boolean checkOneWay(String s1, String s2) {
        boolean initial_checker = false;
        boolean checker = false;
        if(s1.length() == s2.length()){
            if (s1.equals(s2)){
                return true;
            }
            for (int i =0; i< s1.length(); i++){
                if (s1.charAt(i) != s2.charAt(i)) {
                    if(!initial_checker){
                        checker = true;
                        initial_checker = true;
                    }else{
                        checker = false;
                    }

                }
            }
            System.out.println("Replace");
            return checker;
        }else if(Math.abs(s1.length() - s2.length()) == 1){
            System.out.println("insert/remove");
            if(s1.length() > s2.length()){
                return checkInsert(s1,s2);
            }else{
                return checkInsert(s2,s1);
            }
        }else{
            return false;
        }
    }

    private static boolean checkInsert(String s1, String s2) {
        boolean initial_checker = false;
        boolean checker = false;
        for (int i =0, j= 0; i< s1.length() && j< s2.length(); i++, j++){
            if (s1.charAt(i) != s2.charAt(j)) {
                if(!initial_checker){
                    checker = true;
                    initial_checker = true;
                    j--;
                }else{
                    checker = false;
                }
            }
        }
        if(initial_checker == false){
            checker = true;
        }
        return checker;
    }
}
