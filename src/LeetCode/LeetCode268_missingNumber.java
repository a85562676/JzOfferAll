package LeetCode;

public class LeetCode268_missingNumber {
    public int missingNumber(int[] nums) {

        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum = sum + nums[i];
        }

        int res = (nums.length + 1) * nums.length / 2;

        return res - sum;
    }
}
