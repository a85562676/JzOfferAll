package code;

public class Code17_MaxProductAfterCutting {

    // 递归式  f(n)=max(f(i)*f(n-i)) 0<i<n
    public static int cutRope03(int target) {
        if (target < 2) {
            return 0;
        }
        if (target == 2) {
            return 1;
        }
        if (target == 3) {
            return 2;
        }
        int max = cutRope03Core(target);
        return max;
    }

    public static int cutRope03Core(int target) {
        if (target < 4) {
            return target;
        }
        int max = 0;
        for (int i = 1; i <= target/2; i++) {
            max = Math.max(cutRope03Core(i) * cutRope03Core(target - i), max);
        }
        return max;
    }

    // 动态规划Dp
    public static int cutRopeDp(int target) {
        int[] dp = new int[target + 1];
        dp[0] = 0;
        if (target < 2) {
            dp[1] = 0;
        }
        if (target == 2) {
            dp[2] = 1;
        }
        if (target == 3) {
            dp[3] = 2;
        }
        int max = cutRopeDp(target, dp);
        return max;
    }

    public static int cutRopeDp(int target, int[] dp) {
        int max = 0;
        for (int i = 1; i <= target/2; i++) {
            max = Math.max(dp[i] * dp[target - i], max);
        }
        return max;
    }


    public static void main(String[] args) {
        int res = cutRopeDp(8);
        System.out.println(res);
    }
}
