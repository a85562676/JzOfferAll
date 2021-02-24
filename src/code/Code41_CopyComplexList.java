package code;

public class Code41_CopyComplexList {

    public static class Node{
        public int value;
        public Node next;
        public Node rand;

        public Node(int value){
            this.value = value;
        }
    }

    public static Node Clone(Node head){
        if(head == null){
            return null;
        }
        // 1、复制每个节点，并插入到被复制节点的后面。比如1->2->3 clone 1->1->2->2->3->3
        Node cur = head;
        Node next = null;
        while(cur != null){
            next = cur.next;
            cur.next = new Node(cur.value);
            cur.next.next = next;
            cur = next;
        }

        // 2、复制随机节点。当遍历到的当前节点存在随机节点时，则其复制节点也应该存在随机节点。
        // 比如当前节点cur.random != null，则RandomListNode clone = cur.next;clone.random = cur.random.next;
        cur = head;
        Node curCopy = null;
        while (cur != null) {
            next = cur.next.next;
            curCopy = cur.next;
            curCopy.rand = cur.rand != null ? cur.rand.next : null;
            cur = next;
        }

        // 3、分离两个链表。其中奇数链表为原链表，偶数链表为复制的链表
        Node res = head.next;
        cur = head;
        while (cur != null) {
            next = cur.next.next;
            curCopy = cur.next;
            cur.next = next;
            curCopy.next = next != null ? next.next : null;
            cur = next;
        }
        return res;
    }
}
