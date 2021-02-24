package Zuochengyunbook.Chapter8;

import java.util.ArrayList;

public class Code1_Solution {

    //转圈打印矩阵
    public static void spiralOrderPrint(int[][] matrix){
        int row = matrix.length;  //行的长度
        int col = matrix[0].length; //列的长度

        printEdge(matrix, 0, 0, row - 1, col - 1);
    }


    public static void printEdge(int[][] matrix, int LUX, int LUY, int RDX, int RDY){
        // int LUX = 0;   //左上角横坐标
        // int LUY = 0;   //左上角纵坐标
        // int RDX = row - 1; //右下角横坐标
        // int RDY = col - 1;//右下角纵坐标
        ArrayList<Integer> integers = new ArrayList<>();
        while((LUX <= RDX)&&(LUY <= RDY)){
            if(LUY == RDY){   //只有一列
                for(int s1 = LUX; s1 <= RDX; s1++){
                    System.out.print(matrix[s1][LUY]+" ");
                }
            }
            else if(LUX == RDX){ //只有一行
                for(int s2 = LUY; s2 <= RDY; s2++){
                    System.out.print(matrix[LUX][s2]+" ");
                }
            }
            else{  //普通情况
                for(int i = LUY; i <= RDY; i++){
                    integers.add(matrix[LUX][i]);
                    System.out.print(matrix[LUX][i]+" ");
                }
                for(int j = LUX + 1; j <= RDX; j++){
                    integers.add(matrix[j][RDY]);
                    System.out.print(matrix[j][RDY]+" ");
                }
                for(int k = RDY - 1; k >= LUY; k--){
                    integers.add(matrix[RDX][k]);
                    System.out.print(matrix[RDX][k]+" ");
                }
                for(int m = RDX - 1; m > LUX; m--){
                    integers.add(matrix[m][LUY]);
                    System.out.print(matrix[m][LUY]+" ");
                }
            }
            LUX++;
            LUY++;
            RDX--;
            RDY--;
        }
    }

    public static void main(String[] args){
        int[][] matrix = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        spiralOrderPrint(matrix);
    }
}
