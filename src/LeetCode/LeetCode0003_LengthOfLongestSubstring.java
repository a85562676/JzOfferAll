package LeetCode;

/**
Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Example 2:
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Example 3:
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
最长不重复子串
 */
public class LeetCode0003_LengthOfLongestSubstring {

    public static int lengthOfLongestSubstring(String s) {
        char[] str = s.toCharArray();
        int[] map = new int[256];
        for(int i = 0; i < map.length; i++){
            map[i] = -1;
        }
        int pre = -1;  //pre表示i-1位置往左推不动的位置
        int cur = 0; //表示当前的长度
        int len = 0; //表示最终的答案
        for(int j = 0; j < str.length; j++){
            pre = Math.max(pre, map[(int)str[j]]); // pre表示i位置往左推不动的位置
            cur = j - pre;
            len = Math.max(cur, len);
            map[(int)str[j]] = j;
        }
        return len;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
}
