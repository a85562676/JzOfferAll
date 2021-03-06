package LeetCode;

public class LeetCode172_FactorialTrailingZeroes {

    public static int trailingZeroes(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n / 5;
            n /= 5;
        }
        return sum;
    }
}
