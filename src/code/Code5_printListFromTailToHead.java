package code;

import java.util.ArrayList;
import java.util.Stack;

public class Code5_printListFromTailToHead {

    public static class ListNode{
        public int val;
        public ListNode next;
        public ListNode(int value){
            this.val = value;
        }
    }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> res = new ArrayList<>();
        if (listNode == null) {
            return res;
        }
        Stack<Integer> stack = new Stack<>();
        while (listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        while (!stack.isEmpty()) {
            res.add(stack.pop());
        }
        return res;
    }
}
