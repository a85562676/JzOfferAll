package LeetCode;

public class LeetCode026_removeDuplicates {

    public static int removeDuplicates(int[] nums) {
        if(nums == null){
            return 0;
        }
        int cur = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i - 1] != nums[i]){
                nums[cur] = nums[i];
                cur++;
            }
        }
        return cur;
    }
}
