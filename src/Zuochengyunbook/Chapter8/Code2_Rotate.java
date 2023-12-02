package Zuochengyunbook.Chapter8;

import java.util.Arrays;

public class Code2_Rotate {

    // N * N方块
    public static void rotate (int[][] matrix) {
        int OR = 0;   // 左上角点，只能往右
        int OD = 0;   // 左上角点，只能往下
        int SL = matrix[0].length - 1;  // 右下角点，只能往左
        int SU = matrix.length - 1;     // 右下角点，只能往上

        while (OR < SL && OD < SU) {
            int times = SL - OR - 1;
            for (int i = 0; i <= times; i++) {
                int tmp = matrix[OR][OD + i];
                matrix[OR][OD + i] = matrix[SU - i][OR];
                matrix[SU - i][OR] = matrix[SU][SL - i];
                matrix[SU][SL - i] = matrix[i][SL];

            }
            OR++;
            OD++;
            SL--;
            SU--;
        }
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(Arrays.toString(matrix[0]));
        System.out.println(Arrays.toString(matrix[1]));
        System.out.println(Arrays.toString(matrix[2]));
        System.out.println(Arrays.toString(matrix[3]));
        rotate(matrix);
        System.out.println(Arrays.toString(matrix[0]));
        System.out.println(Arrays.toString(matrix[1]));
        System.out.println(Arrays.toString(matrix[2]));
        System.out.println(Arrays.toString(matrix[3]));
    }
}
