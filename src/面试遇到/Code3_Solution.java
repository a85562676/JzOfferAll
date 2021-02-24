package 面试遇到;

import java.util.ArrayList;
import java.util.List;

// leetcode 39: 给定数组[2,3,5] 目标值是8 要求输出[[2,2,2,2],[2,3,3],[3,5]]
public class Code3_Solution {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        findresult(candidates,0, target, new ArrayList<>(), result);
        return result;
    }

    public static void findresult(int[] candidates, int start, int target, ArrayList<Integer> list, List<List<Integer>> result){
        //base case
        if(target < 0){
            return;
        }
        if (target == 0){
            result.add(new ArrayList<>(list));
        }
        for(int i = start; i < candidates.length; i++) {
            list.add(candidates[i]);
            findresult(candidates, i, target - candidates[i], list, result);
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args){
        List<List<Integer>> arrayLists = combinationSum(new int[]{2, 3, 5}, 8);
        System.out.println(arrayLists);

        ArrayList<Integer> s = new ArrayList<>();
        s.add(1);
        s.add(2);
        s.add(3);
        System.out.println(s);
        s.remove(s.size() - 1);
        System.out.println(s);
    }
}
