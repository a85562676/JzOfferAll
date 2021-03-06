package LeetCode;

import java.util.Stack;

public class LeetCode234_palindromeLinedList {
    public static class ListNode{
        public ListNode next;
        public int val;
        public ListNode(int val){
            this.val = val;
        }
    }

    public static boolean isPalindrome(ListNode head) {

        Stack<ListNode> s = new Stack<ListNode>();
        ListNode cur = head;
        while(cur != null){
            s.push(cur);
            cur = cur.next;
        }
        while(head != null){
            int value = s.pop().val;
            if(value != head.val){
                return false;
            }
            head = head.next;
        }
        return true;
    }
}
