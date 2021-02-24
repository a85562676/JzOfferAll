package code;

public class Code10_Fibonacci {

//    public int Fibonacci(int n) {
//        if (n < 2) {
//            return n;
//        }
//        // 递归调用
//        return Fibonacci(n - 1) + Fibonacci(n - 2);
//    }

    public int Fibonacci(int n) {
        if (n < 2) {
            return n;
        }
        int[] res = new int[n + 1];
        res[0] = 0;
        res[1] = 1;
        for (int i = 2; i <= n; ++i) {
            res[i] = res[i - 1] + res[i - 2];
        }
        return res[n];
    }
}
