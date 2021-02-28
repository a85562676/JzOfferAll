package code;

public class Code18_NumberOf1InBinary {
    //看二进制中有多少个1
    public static int NumberOf1(int n) {
        int cnt = 0;
        while (n != 0) {
            n = (n - 1 ) & n;
            ++cnt;
        }
        return cnt;
    }
}
