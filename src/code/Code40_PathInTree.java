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


    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);
        TreeNode n8 = new TreeNode(1);

        n1.left  = n2;
        n1.right = n3;
        n2.left  = n4;
        n2.right = n5;
        n3.left  = n6;
        n3.right = n7;
        n4.left = n8;

        ArrayList<ArrayList<Integer>> arrayLists = FindPath(n1, 8);
        System.out.println(arrayLists);
    }
}
