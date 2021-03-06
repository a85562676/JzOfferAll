package LeetCode;
//翻转字符串数组
public class LeetCode344_ReverseString {
    public static void reverseString(char[] s) {
        int len = s.length;
        for (int i = 0; i < len / 2; i++) {
            swap(s, i, len - 1 - i);
        }
    }

    public static void swap(char[] s, int i, int j){
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }
}
