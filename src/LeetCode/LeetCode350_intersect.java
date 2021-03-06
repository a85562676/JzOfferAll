package LeetCode;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode350_intersect {

    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) return intersects(nums1, nums2);
        else return intersects(nums2, nums1);
    }

    public int[] intersects(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int num : nums1)
            map.put(num, map.getOrDefault(num, 0) + 1);

        for (int num: nums2){
            if(map.containsKey(num) && map.get(num) > 0){
                list.add(num);
                map.put(num, map.get(num) - 1);
            }
        }

        int[] result = new int[list.size()];
        int i=0;
        for(int item : list)
            result[i++] = item;
        return result;
    }
}

