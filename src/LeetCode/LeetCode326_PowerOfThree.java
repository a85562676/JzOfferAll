package LeetCode;

public class LeetCode326_PowerOfThree {

    public static boolean isPowerOfThree(int n) {
        if(n <= 0){
            return false;
        }
        int maxint = 0x7fffffff;
        int k = (int)(Math.log10(maxint) / Math.log10(3));
        int big3 = (int) Math.pow(3,k);
        return (big3 % n == 0);
    }

    public static void main(String[] args) {
        boolean powerOfThree = isPowerOfThree(27);
        System.out.println(powerOfThree);
    }
}
