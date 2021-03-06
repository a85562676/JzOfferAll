package LeetCode;

public class LeetCode190_ReverseBits {

    public static int reverseBits(int n) {
        int result = 0;
        for (int i = 31; i >= 0; i--) {
            result |= (n & 1) << i; // set the value of bit (n & 1) in postion i
            n >>>= 1;
        }
        return result;
    }
}
