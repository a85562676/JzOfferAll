package LeetCode;

public class LeetCode053_maxSubArray {

    public static int maxSubArray(int[] nums) {
        int ans = nums[0]; // index = 0  时的返回结果
        int sum = 0;       // index = 0 以前的数组最大和
        for(int i = 0; i < nums.length; i++){
            sum = Math.max(nums[i], sum + nums[i]);
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}
