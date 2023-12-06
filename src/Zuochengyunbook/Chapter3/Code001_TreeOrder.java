package Zuochengyunbook.Chapter3;

import java.util.Stack;

// 二叉树进行前，中，后的排序
public class Code001_TreeOrder {

    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;
        public TreeNode() {}
        public TreeNode(int val) {
            this.val = val;
        }
    }

    // 先序遍历递归
    public static void preOrderRecusive(TreeNode head) {
        if (head == null) {
            return;
        }
        System.out.print(head.val + " ");
        preOrderRecusive(head.left);
        preOrderRecusive(head.right);
    }

    // 中序遍历递归
    public static void inOrderRecusive(TreeNode head) {
        if (head == null) {
            return;
        }
        inOrderRecusive(head.left);
        System.out.print(head.val + " ");
        inOrderRecusive(head.right);
    }

    // 后序列遍历递归
    public static void posOrderRecusive(TreeNode head) {
        if (head == null) {
            return;
        }
        posOrderRecusive(head.left);
        posOrderRecusive(head.right);
        System.out.print(head.val + " ");
    }

    // 先序遍历非递归
    public static void preOrderInRecusive(TreeNode head) {
        if (head == null) {
            return;
        }
        Stack<TreeNode> s = new Stack<TreeNode>();
        s.add(head);
        while (!s.isEmpty()) {
            TreeNode cur = s.pop();
            System.out.print(cur.val + " ");
            if (cur.right != null) {
                s.add(cur.right);
            }
            if (cur.left != null) {
                s.add(cur.left);
            }
        }
    }

    // 中序遍历非递归
    public static void inOrderInRecusive(TreeNode head) {
        if (head == null) {
            return;
        }
        Stack<TreeNode> s = new Stack<TreeNode>();
        while (!s.isEmpty() || head != null) {
            if (head != null) {
                s.add(head);
                head = head.left;
            } else {
                head = s.pop();
                System.out.print(head.val + " ");
                head = head.right;
            }
        }
    }

    // 后序列遍历非递归
    public static void posOrderInRecusive(TreeNode head) {
        if (head == null) {
            return;
        }
        Stack<TreeNode> s1 = new Stack<TreeNode>();
        Stack<TreeNode> s2 = new Stack<TreeNode>();
        s1.add(head);
        while (!s1.isEmpty()) {
            TreeNode cur = s1.pop();
            s2.add(cur);
            if (cur.left != null) {
                s1.add(cur.left);
            }
            if (cur.right != null) {
                s1.add(cur.right);
            }
        }
        while (!s2.isEmpty()) {
            System.out.print(s2.pop().val + " ");
        }
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;
        preOrderRecusive(node1);
        System.out.println();
        inOrderRecusive(node1);
        System.out.println();
        posOrderRecusive(node1);
        System.out.println();
        preOrderInRecusive(node1);
        System.out.println();
        inOrderInRecusive(node1);
        System.out.println();
        posOrderInRecusive(node1);
    }
}
