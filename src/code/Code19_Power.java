package code;

public class Code19_Power {

    public static double power(double base, int exp) {
        if (exp == 0) {
            return 1;// 假定0的0次方为1
        }
        if (exp == 1) {
            return base;
        }
        if (exp > 1) {
            double result = power(base, exp >> 1);// exp>>1就是exp/2，但是右移效率更高
            result = result * result;
            if ((exp & 1) == 1) {// exp&1就是判断奇偶，=1为奇数，比%效率更高
                result = result * base;
            }
            return result;
        }
        if (exp < 0) {
            exp = -exp;
            double result = power(base, exp);
            return 1 / result;
        }
        return -1;
    }


    public static void main(String[] args) {
        double base = -2.5;
        int exp = -4;
        System.out.println(power(base, exp));
    }

}
