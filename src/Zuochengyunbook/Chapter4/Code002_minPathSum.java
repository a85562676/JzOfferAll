package Zuochengyunbook.Chapter4;

/**
 * 矩阵的最小路径和
 */
public class Code002_minPathSum {

    //正着递归
    public static int minPathSum1(int[][] matrix) {
        if (matrix.length <= 0 || matrix[0].length <= 0 || matrix == null) {
            return 0;
        }
        return path(matrix, 0, 0);
    }

    // 获取matrix从i, j位置开始的最小路径和
    public static int path(int[][] matrix, int i, int j) {
        if (i == matrix.length - 1 && j == matrix[0].length - 1) {
            return matrix[i][j];
        }
        if (i == matrix.length - 1) {
            return matrix[i][j] + path(matrix, i, j + 1);
        }
        if (j == matrix[0].length - 1) {
            return matrix[i][j] + path(matrix, i + 1, j);
        }
        return matrix[i][j] + Math.min(path(matrix, i + 1, j),
                path(matrix, i, j + 1));
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 5, 9}, {8, 1, 3, 4}, {5, 0, 6, 1}, {8, 8, 4, 0}};
        int[][] dp = new int[matrix.length - 1][matrix[0].length - 1];
        System.out.println(matrix.length);
        System.out.println(matrix[0].length);
        System.out.println(minPathSum1(matrix));
        System.out.println(minSumPathWS(matrix));
        System.out.println(dp.length);
        System.out.println(minSumPathDpWS(matrix));
        System.out.println(minPathSum2(matrix));
    }

    public static int minSumPathWS(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix.length <= 0 || matrix[0].length <= 0) {
            return 0;
        }
        //获取从(0，0)开始的最小路径和
        return getMinSumPathWS(matrix, 0, 0);
    }

    // 获取matrix从(row，col)开始的最小路径和
    public static int getMinSumPathWS(int[][] matrix, int row, int col) {
        // 如果到了最右下角，则matrix从最右下角开始的最小路径和为matrix[matrix.length - 1][matrix[0].length - 1]
        if (row == matrix.length - 1 && col == matrix[0].length - 1) {
            return matrix[row][col];
        }
        // 如果到了最后一行，但不是最后一列
        if (row == matrix.length - 1) {
            return matrix[row][col] + getMinSumPathWS(matrix, row, col + 1);
        }
        // 如果到了最后一列，但不是最后一行
        if (col == matrix[0].length - 1) {
            return matrix[row][col] + getMinSumPathWS(matrix, row + 1, col);
        }
        // 既不是最后一行，也不是最后一列
        return matrix[row][col] + Math.min(getMinSumPathWS(matrix,row + 1, col), getMinSumPathWS(matrix, row, col + 1));
    }

    //dp[i][j]表示从(0,0)位置到(i,j)位置的最小路径和
    public static int minSumPathDpWS(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix.length <= 0 || matrix[0].length <= 0) {
            return 0;
        }
        int[][] dp = new int[matrix.length][matrix[0].length];
        //获取从(0，0)开始的最小路径和
        return getMinSumPathDpWS(matrix, 0, 0, dp);
    }

    // 获取matrix从(row，col)开始的最小路径和
    public static int getMinSumPathDpWS(int[][] matrix, int row, int col, int[][] dp) {
        dp[0][0] = matrix[0][0];
        // 第0列，全部填好
        for (int r = 1; r < matrix.length; r++) {
            dp[r][0] = matrix[r][0] + dp[r - 1][0];
        }
        // 第0行，全部填好
        for (int c = 1; c < matrix[0].length; c++) {
            dp[0][c] = matrix[0][c] + dp[0][c - 1];
        }
        // 非第0行，非第0列
        for (int r = 1; r < matrix.length; r++) {
            for (int c = 1; c < matrix[0].length; c++) {
                dp[r][c] = matrix[r][c] + Math.min(dp[r - 1][c], dp[r][c - 1]);
            }
        }
        return dp[matrix.length - 1][matrix[0].length - 1];
    }

    // 空间压缩的办法
    public static int minPathSum2(int[][] m) {
        if (m == null || m.length == 0 || m[0] == null || m[0].length == 0) {
            return 0;
        }
        int more = Math.max(m.length, m[0].length);
        int less = Math.max(m.length, m[0].length);
        boolean rowmore = more == m.length;
        int[] arr = new int[less];
        arr[0] = m[0][0];
        for (int i = 1; i < less; i++) {
            arr[i] = arr[i - 1] + (rowmore ? m[0][i] : m[i][0]);
        }
        for (int i = 1; i < more; i++) {
            arr[0] = arr[0] + (rowmore ? m[i][0] : m[i][0]);
            for (int j = 1; j < less; j++) {
                arr[j] = Math.min(arr[j - 1], arr[j]) + (rowmore ? m[i][j] : m[j][i]);
            }
        }
        return arr[less - 1];
    }
}
