package LeetCode;

import java.util.HashMap;

public class LeetCode001_TwoSum {
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
}
