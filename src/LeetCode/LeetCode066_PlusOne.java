package LeetCode;

import java.util.Arrays;

public class LeetCode066_PlusOne {
    public static  int[] plusOne(int[] digits) {
        int flag = 0; //是否需要进位 1需要 0不需要
        StringBuilder str = new StringBuilder();
        for(int i = digits.length - 1; i >= 0; i--){
            int sum = 0;
            if(i == digits.length - 1){
                sum = digits[i] + 1 + flag;
            }else{
                sum = digits[i] + flag;
            }
            if(sum > 9){
                sum = sum - 10;
                str.append(sum);
                flag = 1;
            }else{
                str.append(sum);
                flag = 0;
            }
        }
        if(flag == 1){
            str.append(1);
        }
        System.out.println(str);
        str = str.reverse();
        int[] res = new int[str.length()];
        for(int j = 0; j < res.length; j++){
            res[j] = (int) str.charAt(j) - 48;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{9,9,9})));
    }

}
