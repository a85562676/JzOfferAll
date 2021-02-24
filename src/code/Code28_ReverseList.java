package code;

public class Code28_ReverseList {
    public static class Node{
        public int value;
        public Node next;
        public Node(int data){
            this.value = data;
        }
    }

    /**
     * 1、保存下一个
     * 2、断链反指
     * 3、pre右移
     * 4、head右移
     */


    public static Node reeverseList(Node head){
        Node pre  = null;
        Node next = null;
        while(head != null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}
