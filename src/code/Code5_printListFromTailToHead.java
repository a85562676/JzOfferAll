package code;

import java.util.ArrayList;
import java.util.Stack;

public class Code5_printListFromTailToHead {

    public static class TreeNode{
        public int value;
        public TreeNode next;
        public TreeNode(int value){
            this.value = value;
        }
    }

    //用栈的方式
    public static ArrayList<Integer> printListFromTailToHead(TreeNode listNode) {
        ArrayList<Integer> res = new ArrayList<>();
        if (listNode == null) {
            return res;
        }
        Stack<Integer> stack = new Stack<>();
        while (listNode != null) {
            stack.push(listNode.value);
            listNode = listNode.next;
        }
        while (!stack.isEmpty()) {
            res.add(stack.pop());
        }
        return res;
    }

    //用递归的方式
    public static ArrayList<Integer> printListFromTailToHead1(TreeNode head, ArrayList<Integer> res) {
        if(head != null){
            if(head.next != null){
                printListFromTailToHead1(head.next, res);
            }
            res.add(head.value);
        }
        return res;
    }


    public static void main(String[] args) {

        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        System.out.println(node1.value);
        System.out.println(node1.next.value);
        System.out.println(node1.next.next.value);
        System.out.println(node1.next.next.next.value);

        ArrayList<Integer> list = printListFromTailToHead1(node1, new ArrayList<Integer>());
        System.out.println(list);
    }

}
