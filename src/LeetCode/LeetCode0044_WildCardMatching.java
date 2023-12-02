package LeetCode;

public class LeetCode0044_WildCardMatching {

    public static boolean isMatch(String s, String p) {
        char[] str = s.toCharArray();
        char[] pattern = p.toCharArray();
        int N = str.length;
        int M = pattern.length;
        boolean[][] dp = new boolean[N + 1][M + 1];
        dp[N][M] = true;
        for (int pi = M - 1; pi >= 0; pi--) {
            if (pattern[pi] != '*') {
                break;
            }
            dp[N][pi] = true;
        }
        for (int pi = M - 1; pi >= 0; pi--) {
            for (int si = N - 1; si >= 0; si--) {
                if (pattern[pi] != '*') {
                    dp[si][pi] = (str[si] == pattern[pi] || pattern[pi] == '?') && dp[si + 1][pi + 1];
                } else {
                    dp[si][pi] = dp[si][pi + 1] || dp[si + 1][pi];
                }
            }
        }
        return dp[0][0];
    }
}
