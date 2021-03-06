package LeetCode;

import code.Code88_FindFirstCommonNode;

public class LeetCode160_getIntersectionNode {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public static ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
        int lenA = 0;  //A链表长度
        int lenB = 0;  //B链表长度
        int diff = 0; //两条链表的长度差，后面长的要先走多少步
        ListNode curA = headA;
        while(curA != null){
            lenA = lenA + 1;
            curA = curA.next;
        }
        ListNode curB = headB;
        while(curB != null){
            lenB = lenB + 1;
            curB = curB.next;
        }
        if(lenA >= lenB){
            diff = lenA - lenB;
            while(diff > 0){
                headA = headA.next;
                diff--;
            }
        }else{
            diff = lenB - lenA;
            while(diff > 0){
                headB = headB.next;
                diff--;
            }
        }
        while(headA!=null && headB!=null ){
            if(headA == headB){
                break;
            }else {
                headA = headA.next;
                headB = headB.next;
            }
        }
        return headA;
    }

    public static ListNode getIntersectionNode(ListNode head1, ListNode head2){
        //得到两条链表的长度
        int L1 = GetListLength(head1); //第一条链表的长度
        int L2 = GetListLength(head2); //第二条链表的长度
        int diff = Math.abs(L1 - L2);

        ListNode pListHeadLong  = L1 >= L2 ?  head1 : head2;
        ListNode pListHeadShort = L1 <  L2  ? head1 : head2;

        //先让长的走diff步
        for (int step = 0; step < diff; step++) {
            pListHeadLong = pListHeadLong.next;
        }

        while ((pListHeadLong != null) && (pListHeadShort != null) && (pListHeadLong != pListHeadShort)){
            pListHeadLong =  pListHeadLong.next;
            pListHeadShort = pListHeadShort.next;
        }
        //得到第一个公共节点
        ListNode pFirstCommonNode = pListHeadLong;

        return pFirstCommonNode;
    }

    //获取链表的长度
    public static int GetListLength(ListNode head){
        int length = 0;
        while(head != null){
            head = head.next;
            length++;
        }
        return length;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        ListNode node7 = new ListNode(7);
        node1.next = node2;
        node2.next = node3;
        node3.next = node6;
        node6.next = node7;
        node4.next = node5;
        node5.next = node6;

        ListNode FirstCommonNode = getIntersectionNode1(node1, node4);
        System.out.println(FirstCommonNode.val);
    }

}
