package code;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;

public class Code40_PathInTree {

    public static class TreeNode{
        public TreeNode left;
        public TreeNode right;
        public int value;

        public TreeNode(int value){
            this.value = value;
        }
    }

    private static  ArrayList<ArrayList<Integer>> res = new ArrayList<>();

    public static ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        findPath(root, target, new ArrayList<>());
        return res;
    }

    private static void findPath(TreeNode root, int target, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }
        list.add(root.value);
        target -= root.value;
        if (target == 0 && root.left == null && root.right == null) {

            res.add(new ArrayList<>(list));
        } else {
            findPath(root.left, target, list);
            findPath(root.right, target, list);
        }
        list.remove(list.size() - 1);
    }

}
