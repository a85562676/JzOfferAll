package code;

public class Code202_MaxCommonSubsequence {
    //递归
    public static int getMaxCommonSubsequence(String s1, String s2) {
        if (s1.length() == 0 || s2.length() == 0) {
            return 0;
        }
        if (s1.charAt(0) == s2.charAt(0)) {
            return 1 + getMaxCommonSubsequence(s1.substring(1), s2.substring(1));
        } else {
            return Math.max(getMaxCommonSubsequence(s1, s2.substring(1)), getMaxCommonSubsequence(s1.substring(1), s2));
        }
    }

    //Dp way
    public int getLCSLength(String s1, String s2) {
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];//dp第一行和第一列需要都是0
        for (int i = 1; i <= s1.length(); i++) {
            char c1 = s1.charAt(i - 1);
            for (int j = 1; j <= s2.length(); j++) {
                char c2 = s2.charAt(j - 1);
                if (c1 == c2) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                }
            }
        }
        return dp[s1.length()][s2.length()];
    }

    public static void main(String[] args) {

        String A = "ABcCDE";
        String B = "CBCDE";
        System.out.println(getMaxCommonSubsequence(A, B));//4
        System.out.println(getMaxCommonSubsequence(A, B));//3
    }
}
