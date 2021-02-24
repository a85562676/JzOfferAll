package code;

import java.util.Arrays;

/**
 * 构建乘积数组
 */
public class Code67_ConstructArr {

    public static int[] ConstructArr(int[] a) {
        if(a.length == 0) return new int[0];
        int[] b = new int[a.length];
        b[0] = 1;
        int tmp = 1;
        for(int i = 1; i < a.length; i++) {
            b[i] = b[i - 1] * a[i - 1];
        }
        for(int i = a.length - 2; i >= 0; i--) {
            tmp *= a[i + 1];
            b[i] *= tmp;
        }
        return b;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        int[] res = ConstructArr(arr);
        System.out.println(Arrays.toString(res));
    }
}
