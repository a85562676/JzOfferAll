package code;// 不使用加减乘除法，只采用位运算做加法

public class Code68_Add {

    public static int add(int a, int b) {
        while(b != 0) { // 当进位为 0 时跳出
            int c = (a & b) << 1;  // c = 进位
            a ^= b; // a = 非进位和
            b = c; // b = 进位
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(add(5,17));
    }
}
