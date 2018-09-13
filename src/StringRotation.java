public class StringRotation {

    private static String stringRot(String s, int noOfRot) {
        String result = s.substring(noOfRot) + s.substring(0,noOfRot);
        return result;
    }

    public static void main(String[] args) {
        String s = "abcdefgh";
        int noOfRot = 3;
        System.out.println(stringRot(s,noOfRot));
    }
}
