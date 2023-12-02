package LeetCode;

public class LeetCode0026_removeDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] nums) {
        if (nums == null){
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

    public static int removeDuplicates2(int[] nums) {
        if (nums == null){
            return 0;
        }
        if (nums.length < 2){
            return nums.length;
        }
        int index = 0;
        for(int i = 0; i < nums.length; i++){
            if(i == 0 || nums[i - 1] != nums[i]){
                nums[index++] = nums[i];
            }
        }
        return index;
    }
}
