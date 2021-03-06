package LeetCode;
import java.util.ArrayList;
import java.util.List;

public class LeetCode202_isHappy {

    static List nums = new ArrayList<Integer>();

    public static boolean isHappy(int n){
        if(n == 1){
            return true;
        }
        if(n <= 0){
            return false;
        }
        if(nums.contains(n))
            return false;
        else
            nums.add(n);

        int val = 0;
        int m = n;

        while(m > 0){
            int i = m % 10;
            val += (i * i);
            m = m /10;
        }
        return isHappy(val);
    }
}
