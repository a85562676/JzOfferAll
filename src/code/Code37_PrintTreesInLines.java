package code;

import 面试遇到.Code4_Solution;

import java.util.*;
public class Code37_PrintTreesInLines {

    public static class TreeNode{
        public TreeNode left;
        public TreeNode right;
        public int val;
        public TreeNode(int value){
            this.val = value;
        }
    }

    public static void PrintTreesInLines(TreeNode pRoot) {
        if(pRoot == null){
            return;
        }
        Queue<TreeNode> nodes = new LinkedList<TreeNode>();
        int nextLevel = 0;
        int toBePrinted = 1;
        nodes.offer(pRoot);
        while(!nodes.isEmpty()){
            pRoot = nodes.peek();
            System.out.print(pRoot.val+" ");
            if(pRoot.left != null){
                nodes.offer(pRoot.left);
                ++nextLevel;
            }
            if(pRoot.right != null){
                nodes.offer(pRoot.right);
                ++nextLevel;
            }
            nodes.poll();
            --toBePrinted;
            if(toBePrinted == 0){
                System.out.print("\n");
                toBePrinted = nextLevel;
                nextLevel = 0;
            }
        }
    }

    public static void rightSideView(TreeNode root) {
        if(root == null) return ;
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                System.out.print(node.val + " ");
                if(i == (size - 1)){
                    System.out.print("\n");
                }
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
        }
    }

    public static void main(String[] args){
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);

        n1.left  = n2;
        n1.right = n3;
        n2.left  = n4;
        n2.right = n5;
        n3.left  = n6;
        n3.right = n7;

        PrintTreesInLines(n1);

        System.out.println("========================================");

        rightSideView(n1);

    }
}
