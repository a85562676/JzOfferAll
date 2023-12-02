package LeetCode;

/**
Example 1:
1链表 2 -> 4 -> 3
2链表 5 -> 6 -> 4
3链表 7 -> 0 -> 8

Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.

Example 2:
Input: l1 = [0], l2 = [0]
Output: [0]

Example 3:
Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
Explanation: 9999999 + 9999 = 10009998
 */
public class LeetCode0002_AddTwoNumbers {

    public static class ListNode {
        public ListNode next;
        public int val;

        public ListNode() {}
        public ListNode(int val) {
            this.val = val;
        }
        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }
        if (l1 == null && l2 != null) {
            return l2;
        }
        if (l2 == null && l1 != null) {
            return l1;
        }
        int sum = 0;
        int flag = 0;
        ListNode result = new ListNode(0);
        ListNode head = result;
        while (l1 != null && l2 != null) {
            sum = l1.val + l2.val + flag;
            flag = sum / 10;
            head.next = new ListNode(sum % 10);
            l1 = l1.next;
            l2 = l2.next;
            head = head.next;
        }
        while (l1 != null) {
            sum = l1.val + flag;
            flag = sum / 10;
            head.next = new ListNode(sum % 10);
            l1 = l1.next;
            head = head.next;
        }
        while (l2 != null) {
            sum = l2.val + flag;
            flag = sum / 10;
            head.next = new ListNode(sum % 10);
            l2 = l2.next;
            head = head.next;
        }
        if (flag != 0) {
            head.next = new ListNode(1);
        }
        return result.next;
    }
}
