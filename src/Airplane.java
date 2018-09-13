public class Airplane {
    public static int solution(int N, String S) {

        if (S.length() == 0 ) {
            return (3 * N);
        }

        String[] seatsArray = S.split("\\s+");

        if (seatsArray.length == 0 ) {
            return (3 * N);
        }
        boolean[][] reservation = new boolean[N][10];

        for (int i = 0; i < seatsArray.length; i++) {
            int ch = Integer.parseInt(String.valueOf(seatsArray[i].substring(0,seatsArray[i].length()-1)))-1;
            switch (seatsArray[i].charAt(seatsArray[i].length() - 1)) {
                case 'A':
                    reservation[ch][0] = true;
                    break;
                case 'B':
                    reservation[ch][1] = true;
                    break;
                case 'C':
                    reservation[ch][2] = true;
                    break;
                case 'D':
                    reservation[ch][3] = true;
                    break;
                case 'E':
                    reservation[ch][4] = true;
                    break;
                case 'F':
                    reservation[ch][5] = true;
                    break;
                case 'G':
                    reservation[ch][6] = true;
                    break;
                case 'H':
                    reservation[ch][7] = true;
                    break;
                case 'J':
                    reservation[ch][8] = true;
                    break;
                case 'K':
                    reservation[ch][9] = true;
                    break;
            }

        }
        for (int i = 0;i< reservation.length; i++){
            for(int j=0; j< reservation[0].length; j++){
                System.out.print(reservation[i][j] + " ");
            }
            System.out.println();
        }
        int count = 0;
        for (int i = 0; i < reservation.length; i++) {

            if (reservation[i][0] == false && reservation[i][1] == false && reservation[i][2] == false) {
                count++;
            }
            if (reservation[i][7] == false && reservation[i][8] == false && reservation[i][9] == false) {
                count++;
            }
            if (reservation[i][4] == false && reservation[i][5] == false) {

                if (reservation[i][3] == false || reservation[i][6] == false) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(solution(2, "1A 2A 2D"));
    }
}
