public class ZeroMatrix {
    public static void main(String[] args) {
        int mat[][] = { { 1, 0, 3, 4 },
                { 5,6, 0, 8 },
                { 9, 10, 11, 12 } };

        for(int i = 0; i< mat.length;i++){
            for(int j=0; j< mat[i].length; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        boolean[] row = new boolean[mat.length];
        boolean[] col = new boolean[mat[0].length];

        System.out.println();
        l:for(int i = 0; i< mat.length;i++){
            for(int j=0; j< mat[i].length; j++){
                if(mat[i][j] == 0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        for(int i = 0; i<row.length;i++){
            if(row[i] == true){
                nullifyRow(mat,i);
            }
        }

        for(int i = 0; i<col.length;i++){
            if(col[i] == true){
                nullifyColumn(mat,i);
            }
        }

        System.out.println();

        for(int i = 0; i< mat.length;i++){
            for(int j=0; j< mat[i].length; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

    }

    private static void nullifyRow(int[][] mat, int i) {
        for(int j =0; j< mat[i].length;j++){
            mat[i][j] = 0;
        }
    }

    private static void nullifyColumn(int[][] mat, int j) {
        for(int i =0; i<mat.length; i++){
            mat[i][j] = 0;
        }
    }


}
