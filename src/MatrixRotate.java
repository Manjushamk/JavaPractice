public class MatrixRotate {
    public static void main(String[] args) {
        int mat[][] =
                {
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 16}
                };
        int N = 4;

        for(int x = 0; x< N/2; x++){
            for(int y = x; y< N-x-1; y++){
                int temp = mat[x][y];
                mat[x][y] = mat[N-1-y][x];
                mat[N-1-y][x] = mat[N-1-x][N-1-y];
                mat[N-1-x][N-1-y] = mat[y][N-1-x];
                mat[y][N-1-x] = temp;

               // mat[x][y] = mat[y][N-1-x];
               // mat[y][N-1-x] = mat[N-1-x][N-1-y];
               // mat[N-1-x][N-1-y] = mat[N-1-y][x];
               // mat[N-1-y][x] = temp;
            }
        }

        for(int i = 0; i< mat.length;i++){
            for(int j=0; j< mat[i].length; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

    }
}
