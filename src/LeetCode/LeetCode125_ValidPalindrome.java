package LeetCode;

public class LeetCode125_ValidPalindrome {

    public static boolean isPalindrome(String s) {
        int n = s.length();
        String clean = cleanString(s);
        n = clean.length();
        if (n == 0) return true;
        int l = 0;
        int r = n - 1;
        if (l == r) return true;
        while (l < r) {
            char currL = clean.charAt(l++);
            char currR = clean.charAt(r--);
            if (currL != currR)
                return false;
        }
        return true;
    }
    public static String cleanString(String s) {
        return s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    }

}
