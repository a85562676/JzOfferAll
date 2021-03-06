package LeetCode;

//只给定要删除的链表节点，然后删除它，不会是尾节点
public class LeetCode237_DeleteNode {

    public static class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int x) {
            this.val = x;
        }
    }
    public static class TreeNode{
        public TreeNode left;
        public TreeNode right;
        public int val;

        public TreeNode(int val){
            this.val = val;
        }
    }

    public static void deleteNode(ListNode node) {
        ListNode pre = node;
        ListNode cur = node.next;
        pre.val = cur.val;
        pre.next = cur.next;
    }


}
