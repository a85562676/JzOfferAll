package code;

public class Code18_NumberOf1InBinary {

    public static int NumberOf1(int n) {
        int cnt = 0;
        while (n != 0) {
            n = (n - 1 ) & n;
            ++cnt;
        }
        return cnt;
    }
}
