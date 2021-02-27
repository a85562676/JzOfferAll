package code;

public class Code16_RobotMovingCount {

    public static int movingCount(int threshold, int rows, int cols){
        if(threshold < 0 || rows <= 0 || cols <= 0){
            return 0;
        }
        boolean[] visited = new boolean[rows * cols];
        int count = movingCountCore(threshold, rows, cols, 0, 0, visited);
        return count;
    }

    public static int movingCountCore(int threshold, int rows, int cols, int row, int col, boolean[] visited) {
        int count = 0;
        if(check(threshold, rows, cols, row, col, visited)){
            visited[row * cols + col] = true;
            count = 1 + movingCountCore(threshold, rows, cols, row - 1, col, visited)
                      + movingCountCore(threshold, rows, cols, row, col -1, visited)
                      + movingCountCore(threshold, rows, cols, row + 1, col, visited)
                      + movingCountCore(threshold, rows, cols, row, col + 1, visited);
        }
        return count;
    }

    public static boolean check(int threshold, int rows, int cols, int row, int col, boolean[] visited){
        if(row >= 0 && row < rows && col >= 0 && col < cols && getDigitSum(row) + getDigitSum(col) <= threshold && !visited[row * cols + col])
            return true;
        return false;
    }

    public static int getDigitSum(int number){
        int sum = 0;
        while(number > 0){
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int res = movingCount(18, 50, 50);
        System.out.println(res);
    }
}
