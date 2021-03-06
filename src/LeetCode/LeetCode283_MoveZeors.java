package LeetCode;

public class LeetCode283_MoveZeors {

    public static void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) return;
        int i = 0; //维系0区域中最左边一个0的位置的指针
        int j = 1; //往前推着走的指针
        while (j < nums.length) {
            if (nums[i] == 0 && nums[j] != 0) {
                nums[i] = nums[j];
                nums[j] = 0;
                i++;
                j++;
            } else if (nums[i] != 0 && nums[j] == 0) {
                i++;
                j++;
            } else if (nums[i] != 0 && nums[j] != 0) {
                i++;
                j++;
            } else {
                j++;
            }

        }
    }

}
