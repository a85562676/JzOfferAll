package code;

public class Code29_MergeSortedLists {

    public static class Node{
        public int value;
        public Node next;

        public Node(int data){
            this.value = data;
        }
    }

    public static Node MergeSortedLists(Node head1, Node head2){
        if(head1 == null || head2 == null){
            return head1 != null ? head1 : head2;
        }
        Node head = head1.value < head2.value ? head1 : head2;
        Node cur1 = head == head1 ? head1 : head2;
        Node cur2 = head == head1 ? head2 : head1;
        Node pre = null;
        Node next = null;
        while(cur1 != null && cur2 != null){
            if(cur1.value <= cur2.value){
                pre = cur1;
                cur1 = cur1.next;
            }else {
                next = cur2.next;
                pre.next = cur2;
                pre = cur2;
                cur2 = next;
            }
        }
        pre.next = cur1 == null ? cur2: cur1;
        return head;
    }
    public static Node mergeTwoLists(Node l1, Node l2) {
        Node head = new Node(0);
        Node cur = head;

        while(l1 != null && l2 !=null){
            if(l1.value <= l2.value){
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

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(4);

        Node n4 = new Node(1);
        Node n5 = new Node(2);
        Node n6 = new Node(3);

        n1.next = n2;
        n2.next = n3;

        n4.next = n5;
        n5.next = n6;

        Node head = mergeTwoLists(n1, n4);

        System.out.println(head.value);
        System.out.println(head.next.value);
        System.out.println(head.next.next.value);
        System.out.println(head.next.next.next.value);
        System.out.println(head.next.next.next.next.value);
        System.out.println(head.next.next.next.next.next.value);
    }

}
