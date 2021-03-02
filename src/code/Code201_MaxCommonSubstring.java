package code;

import javax.swing.plaf.synth.SynthOptionPaneUI;

// 给出两个字符串，找到最长公共子串，并返回其长度
public class Code201_MaxCommonSubstring {

    public static int getMaxCommmonSubStringDpWay(String A, String B) {
        int n = A.length();
        int m = B.length();
        int num = 0;
        int[][] dp = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            char c1 = A.charAt(i - 1);
            for (int j = 1; j <= m; j++) {
                char c2 = B.charAt(j - 1);
                if (c1 == c2) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;

                } else {
                    dp[i][j] = 0;//这里是和求公共子序列的区别
                }
                num = Math.max(num, dp[i][j]);//这里是和求公共子序列的区别，需要连续，所以需要当时求出最大值
            }
        }//for
        return num;
    }

    public static int getMaxCommmonSubString(String str1, String str2) {

        int size1 = str1.length();
        int size2 = str2.length();
        if (size1 == 0 || size2 == 0) {
            return 0;
        }

        // the start position of substring in original string
        int start1 = -1;
        int start2 = -1;
        // the longest length of common substring
        int longest = 0;

        // record how many comparisons the solution did;
        // it can be used to know which algorithm is better
        int comparisons = 0;

        for (int i = 0; i < size1; ++i) {
            for (int j = 0; j < size2; ++j) {
                // find longest length of prefix
                int length = 0;
                int m = i;
                int n = j;
                while (m < size1 && n < size2) {
                    ++comparisons;
                    if (str1.charAt(m) != str2.charAt(n)) break;
                    ++length;
                    ++m;
                    ++n;
                }

                if (longest < length) {
                    longest = length;
                    start1 = i;
                    start2 = j;
                }
            }
        }
        System.out.println(comparisons + " " + start1 + " " + start2);
        return longest;
    }
        public static void main (String[] args){
            String A = "ABcCDE";
            String B = "CBCDE";
            System.out.println(getMaxCommmonSubStringDpWay(A, B));
            System.out.println(getMaxCommmonSubString(A, B));

        }
    }
