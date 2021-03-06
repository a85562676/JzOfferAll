package LeetCode;

public class LeetCode141_hasCycle {

    public static class ListNode{
        public ListNode next;
        public int val;
        public ListNode(int val){
            this.val = val;
        }
    }

    public static boolean hasCycle(ListNode head) {
        if(head == null || head.next == null || head.next.next == null){
            return false;
        }
        ListNode slow = head.next;
        ListNode fast = head.next.next;
        while(slow != fast){
            if(fast.next == null || fast.next.next == null){
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}
