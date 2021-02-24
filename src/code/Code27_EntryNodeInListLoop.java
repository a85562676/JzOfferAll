package code;

import 面试遇到.Code31_Solution;

public class Code27_EntryNodeInListLoop {
    // 链表中环的入口节点 判断是否有环？双指针找到第一个相遇的环内节点？一个指针从头开始，两个指针一步一步走，相遇的即为入口节点
    public static class TreeNode{
        public TreeNode next;
        public int val;

        public TreeNode(int value){
            this.val = value;
        }
    }

    public static TreeNode getLoopNode(TreeNode head){
        if(head == null || head.next == null || head.next.next == null){
            return null;
        }
        TreeNode fast = head.next.next;
        TreeNode slow = head.next;

        while(fast != slow){
            if(fast.next == null || fast.next.next ==null){
                return null;
            }
            fast = fast.next.next;
            slow = slow.next;
        }

        fast = head;
        while(fast != slow){
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node2;

        TreeNode loopNode = getLoopNode(node1);
        System.out.println(loopNode.val);

    }
}
