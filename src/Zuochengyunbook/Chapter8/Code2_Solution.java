package Zuochengyunbook.Chapter8;

public class Code2_Solution {
    //顺时针旋转数组90°
    public static void rotate(int[][] matrix){
        int row = matrix.length;
        int col = matrix[0].length;
        if(row == 0 || col == 0 || matrix == null || ((row == 1) && (col == 1))){
            return;
        }
        rotateEdge(matrix, 0, 0, row - 1, col - 1);
    }

    public static void rotateEdge(int[][] matrix, int LUX, int LUY, int RDX, int RDY){
        //0 0 3 3
        while((LUX < RDX)&&(LUY < RDY)){
            for(int times = 0; times < (RDY - LUY); times++){
                int tmp = matrix[LUX][LUY + times];            // 记录 0 0  0 1  0 2
                matrix[LUX][LUY + times] = matrix[RDX - times][LUY];  // 0 0 变 3 0 | 0 1 变 2 0 | 0 2 变 1 0
                matrix[RDX - times][LUY] = matrix[RDX][RDY - times];  // 3 0 变 3 3 | 2 0 变 3 2 | 1 0 变 3 1
                matrix[RDX][RDY - times] = matrix[LUX + times][RDY];          // 3 1 变 2 3 | 3 2 变 1 3 | 3 3 变 0 3
                matrix[LUX + times][RDY] = tmp;
            }
            LUX++;
            LUY++;
            RDX--;
            RDY--;
        }
    }



    public static void rotate1(int[][] matrix) {
        int tR = 0;
        int tC = 0;
        int dR = matrix.length - 1;
        int dC = matrix[0].length - 1;
        while (tR < dR) {
            rotateEdge1(matrix, tR++, tC++, dR--, dC--);
        }
    }

    public static void rotateEdge1(int[][] m, int tR, int tC, int dR, int dC) {
        int times = dC - tC; // times就是总共的组数
        int tmp = 0;
        for (int i = 0; i != times; i++) { // 一次循环就是一组占据调整
            tmp = m[tR][tC + i];
            m[tR][tC + i] = m[dR - i][tC];
            m[dR - i][tC] = m[dR][dC - i];
            m[dR][dC - i] = m[tR + i][dC];
            m[tR + i][dC] = tmp;
        }
    }

    public static void main(String[] args) {

        int[][] matrix = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }

        rotate(matrix);
        System.out.println("\n----------------------分割线----------------------------------------");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
    }
}
