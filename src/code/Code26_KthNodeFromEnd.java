package code;

public class Code26_KthNodeFromEnd {
    public static class TreeNode {
        public TreeNode next;
        public int val;

        public TreeNode(int value) {
            this.val = value;
        }
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
