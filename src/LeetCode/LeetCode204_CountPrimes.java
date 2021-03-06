package LeetCode;

public class LeetCode204_CountPrimes {

    public static int countPrimes(int n) {
        /*
        时间：O(n*n)
        空间：O(1)
        去除1和n本身(不包括n本身)，假设其他的数字全部为素数。数量为r=n-2。
        从4开始一个个检查直到n-1，用i来代表当前数，判断这个数是否能够被2~i开平方之间的任意一个数整除。
        如果能够被整除，说明不是素数，r--，马上退出当前数的判断
        返回这个r
        */
        if (n<=2) return 0;
        if (n==3) return 1;
        int r = n-2;
        for (int i=4; i<n; i++){
            for (int j=2; j<=i/j; j++){ // 用 j<=i/j 来替代j*j<=i，防止出现j*j溢出。同时避免使用 j<=Math.sqrt(i)这种JDK API，使用最简单的数学和基本类型
                if (i%j==0) {
                    r--;
                    break;
                }
            }
        }
        return r;
    }
}
