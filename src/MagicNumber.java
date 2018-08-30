public class MagicNumber {
    public static void main(String[] args) {
        int number = 65512512;
        number = Math.abs(number);
        int odd_count = 0;
        int even_count = 0;
        while(number > 0){
            if(((number % 10) % 2) == 0){
                even_count += 1;
            }else{
                odd_count += 1;
            }
            number = number/10;
        }
        if(((even_count % 2) == 0) && ((even_count % 2) == 0)){
            System.out.println("magic number");
        }else{
            System.out.println("not a magic number");
        }

    }
}
