package LeetCode;

public class LeetCode206_ReverseList {

    public static class ListNode{
        public ListNode next;
        public int value;
        public ListNode(int value){
            this.value = value;
        }
    }

    public static ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode next = null;

        while(head != null){
            next = head.next; //保存下一个
            head.next = pre; //断链反指
            pre = head; //pre指针右移
            head = next; // head指针右移
        }
        return pre;
    }


}
