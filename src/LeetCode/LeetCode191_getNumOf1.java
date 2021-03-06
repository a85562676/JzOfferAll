package LeetCode;

public class LeetCode191_getNumOf1 {

    public static int hammingWeight(int n) {
        int num = 0;
        for(int i = 0; i < 32; i++){
            num += (n >> i) & 1;
        }
        return num;
    }
}
