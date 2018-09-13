public class ReverseInteger {
    public static int reverse(int x) {
        char sign = '+';
        if (x < 0) {
            sign = '-';
        }
        long y = 0;
        x = Math.abs(x);
        while (x > 0) {
            y = (y * 10) + (x % 10);
            x = x / 10;
        }
        if (y <= Math.pow(2, 31)) {
            if (sign == '-') {
                return (int) (0 - y);
            }
            return (int) y;
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        System.out.println(reverse(-1534236469));
    }
}
