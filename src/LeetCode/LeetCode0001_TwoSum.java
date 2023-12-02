package LeetCode;
/**
Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]
 */


import java.util.HashMap;

public class LeetCode0001_TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        // key 某个之前的数，    value这个数出现的位置
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target - nums[i])){
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        str.append('a');
        str.append('b');
        str.append('c');
        for(int j = 0; j < str.length(); j++){
            if(str.charAt(j) == str.reverse().charAt(str.length() - 1 -j)){
                System.out.println("aaaaa");
            }
        }
    }

    public static int[] getTwoSumIndex(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{i, map.get(target - nums[i])};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }

}
