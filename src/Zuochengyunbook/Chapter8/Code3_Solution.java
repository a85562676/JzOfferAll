package Zuochengyunbook.Chapter8;

public class Code3_Solution {
    //matrix row < col
    public static void PrintMatrixZigZag(int[][] matrix){
        int RX = 0;
        int RY = 0;
        int DX = 0;
        int DY = 0;
        boolean flag = true; //偶数步true,奇数步false
        int row = matrix.length;
        int col = matrix[0].length;

        for(int step = 0; step < (row + col - 1) ; step++){
            flag = (step % 2) == 0 ? true : false;
            if(step < row - 1){
                printNum(matrix, DX++, DY, RX, RY++, flag);
            }else if(step < col - 1){
                printNum(matrix, DX, DY++, RX, RY++, flag);
		    }else{
                printNum(matrix, DX, DY++, RX++, RY, flag);
            }
        }
    }

    public static void printNum(int[][] matrix, int DX, int DY, int RX, int RY, boolean flag){
        if(flag){
            for(int i = 0; i <= Math.abs(RX - DX); i++){
                System.out.print(matrix[DX - i][DY + i] + " ");
            }
        }else{
            for(int j = 0; j <= Math.abs(RX - DX); j++){
                System.out.print(matrix[RX + j][RY - j] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,2,3,4},{5,6,7,8}};
        PrintMatrixZigZag(matrix);
    }
}
