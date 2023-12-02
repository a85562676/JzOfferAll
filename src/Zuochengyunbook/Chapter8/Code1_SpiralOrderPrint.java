package Zuochengyunbook.Chapter8;

public class Code1_SpiralOrderPrint {

    public static void spiralOrderPrint(int[][] matrix) {
        int OR = 0;   // 左上角点，只能往右
        int OD = 0;   // 左上角点，只能往下
        int SL = matrix[0].length - 1;  // 右下角点，只能往左
        int SU = matrix.length - 1;     // 右下角点，只能往上

        int row = 0; // 第几行
        int col = 0; // 第几列

        while (SU == 0 && OR <= SL) {  // 只有一行的时候
            System.out.print(matrix[SU][OR++] + " ");
        }

        while(SL == 0 && OD <= SU) { // 只有一列的时候
            System.out.print(matrix[OD++][SL] + " ");
        }

        while (OR <= SL && OD <= SU) {

            row = OD;
            col = OR;

            while (col < SL) {
                System.out.print(matrix[OD][col++] + " ");
            }
            while (row < SU) {
                System.out.print(matrix[row++][SL] + " ");
            }
            while (col > OR) {
                System.out.print(matrix[SU][col--] + " ");
            }
            while (row > OD) {
                System.out.print(matrix[row--][OR] + " ");
            }
            OR++;
            OD++;
            SL--;
            SU--;
        }
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[][] matrix1 = new int[][] {{1,2,3,4}};
        int[][] matrix2 = new int[][] {{1},{5},{92},{13}};
        System.out.println(matrix.length);
        System.out.println(matrix[0].length);
        spiralOrderPrint(matrix);
        System.out.println("");
        spiralOrderPrint(matrix1);
        System.out.println("");
        spiralOrderPrint(matrix2);
    }
}
