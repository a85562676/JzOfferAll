package 面试遇到;

public class Code31_Solution {
    //链表反转，有序列表合并，基本排序算法（快排，归并排序，堆排），二分查找等。
    //q1: 反转链表
    public static class TreeNode {
        public TreeNode next;
        public int val;

        public TreeNode(int value) {
            this.val = value;
        }
    }

    public static TreeNode reverseLinkedList(TreeNode head) {
        TreeNode pre = null;  //保存前一个
        TreeNode next = null; //保存后一个

        while (head != null) {
            next = head.next;  //保存下一个
            head.next = pre;   //断链反指
            pre = head;        //pre右移
            head = next;       //head右移
        }
        return pre;
    }

    //q2: leetcode 21题：有序列表合并
    public static class ListNode {
        public int val;
        public ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        ListNode head = new ListNode();
        ListNode pre = head;
        while((l1 != null) && (l2 != null)){
            if(l1.val <= l2.val){
                head.next = l1;
                head = l1;
                l1 = l1.next;
            } else{
                head.next = l2;
                head = l2;
                l2 = l2.next;
            }
        }
        if(l1 != null){
            head.next = l1;
        }
        if(l2 != null){
            head.next = l2;
        }
        return pre.next;
    }

    //q3: 找到链表中倒数第K个节点
    public static TreeNode FindKthToTail(TreeNode head, int k){
        if(head == null || k <= 0){  //head为null，或者k <=0 都没有
            return null;
        }
        TreeNode fast = head;   //快指针先走k-1步
        TreeNode slow = head;   //慢指针
        for(int i = 0; i < k-1; i++){
            if(fast.next != null){
                fast = fast.next;
            }else{
                return null;
            }
        }
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
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

        TreeNode treeNode = FindKthToTail(node1, 2);
        System.out.println(treeNode.val);
    }



}
