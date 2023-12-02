package LeetCode;

public class LeetCode0021_MergeTwoLists {

    public static class TreeNode{
        public TreeNode next;
        public int val;
        public TreeNode(int val){
            this.val = val;
        }
    }

    public static TreeNode mergeTwoLists(TreeNode l1, TreeNode l2) {
        TreeNode head = new TreeNode(0);
        TreeNode cur = head;

        while(l1 != null && l2 !=null){
            if(l1.val <= l2.val){
                cur.next = l1;
                l1 = l1.next;
            } else{
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }

        if(l1 == null){
            cur.next = l2;
        }
        if(l2 == null){
            cur.next = l1;
        }
        return head.next;
    }
}
