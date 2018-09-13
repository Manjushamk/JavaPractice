public class SwapOneline {

    public static void main(String[] args) {
        int a = 9;
        int b = 5;
        a = b-a;
        b = a + b;
        a = b - a;
        System.out.println(a);
        System.out.println(b);
    }
}
