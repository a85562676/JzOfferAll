package Zuochengyunbook.Chapter8;

public class Code3_PrintMatrixZigZag {

    public static void printMatrixZigZag(int[][] matrix) {
        // 右下线路横纵坐标
        int or;
        int oc;
        // 下右线路横纵坐标
        int sr;
        int sc;

        int mr = matrix.length - 1;  // matrix还有多少行 2
        int mc = matrix[0].length - 1;  // matrix还有多少列 3

        int step; //走了第几步
        int sum = mr + mc; // 一共要走几步
        boolean flag;  //是否反方向
        boolean clarge = mc > mr ? true : false;

        System.out.print(matrix[0][0] + ",");

        for (step = 1; step <= sum; step++) {
            or = 0;
            oc = 0;
            sr = 0;
            sc = 0;
            flag = ((step%2) != 0) ? true : false;
            if (clarge) {
                if(step >= mr && step <= mc) {
                    oc = oc + step;
                    sr = mr;
                    sc = sc + step - mr ;
                } else if(step > mc) {
                    or = or + step - mc;
                    oc = mc;
                    sr = mr;
                    sc = sc + step - mr ;
                } else if(step < mr) {
                    oc = oc + step;
                    sr = sr + step;
                }
                while (or < sr && oc > sc ) {
                    if(flag) {
                        System.out.print(matrix[or++][oc--] + ",");
                    } else {
                        System.out.print(matrix[sr--][sc++] + ",");
                    }
                }
                if (or == sr && oc == sc) {
                    System.out.print(matrix[or][oc] + ",");
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        printMatrixZigZag(matrix);
    }

}
