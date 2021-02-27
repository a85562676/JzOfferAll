package code;

public class Code90_GetMaxGiftValue {

    public static int GetMaxGiftValue(int[][] values) {
        int rows = values.length;
        int cols = values[0].length;
        if (values == null || rows <= 0 || cols <= 0) {
            return 0;
        }
        int[][] dp = new int[rows][cols];
        dp[0][0] = values[0][0];
        int max_value = GetMaxGiftValueProcess(values, 0, 0);
        return max_value;
    }

    public static int GetMaxGiftValueProcess(int[][] values, int startX, int startY) {
        if (startX == values.length - 1 && startY == values[0].length - 1) {
            return values[startX][startY];
        }
        if (startX == values.length - 1 && startY != values[0].length - 1) {
            return values[startX][startY] + GetMaxGiftValueProcess(values, startX, startY + 1);
        }
        if (startX != values.length - 1 && startY == values[0].length - 1) {
            return values[startX][startY] + GetMaxGiftValueProcess(values, startX + 1, startY);
        }
        int down = GetMaxGiftValueProcess(values, startX + 1, startY);
        int right = GetMaxGiftValueProcess(values, startX, startY + 1);
        return values[startX][startY] + Math.max(down, right);
    }

//    public static int GetMaxGiftValueDP(int[][] values, int startX, int startY, int[][] dp) {
//        for (int i = startX + 1; i < values.length; i++) {
//            dp[i][startY] = dp[i - 1][startY] + values[i][startY];
//        }
//        for (int j = startY + 1; j < values[0].length; j++) {
//            dp[startX][j] = dp[startX][j - 1] + values[startY][j];
//        }
//        for ()
//
//        return dp[values.length - 1][values[0].length - 1];
//    }

    public static void main(String[] args) {
        int[][] values = new int[][]{{1, 10, 3, 8}, {12, 2, 9, 6}, {5, 7, 4, 11}, {3, 7, 16, 5}};
        System.out.println(GetMaxGiftValue(values));
    }
}
