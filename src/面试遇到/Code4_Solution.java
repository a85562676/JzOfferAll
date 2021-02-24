package 面试遇到;

import java.util.*;

public class Code4_Solution {
    // leetcode 199: 二叉树从右边看到的节点
    // 宽度优先遍历返回最后一个
    public static class TreeNode {
        public TreeNode left;
        public TreeNode right;
        public int val;

        public TreeNode(int value) {
            this.val = value;
        }
    }

    public static List<Integer> rightSideView(TreeNode root) {
        if(root == null) return Collections.emptyList();
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if(i == (size - 1)){
                    list.add(node.val);
                }
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
        }
        return list;
    }

    public static void BFS(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.print(node.val + " ");
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.left);
            }
        }
    }


}
