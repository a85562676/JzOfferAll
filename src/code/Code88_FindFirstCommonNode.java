package code;

import LeetCode.LeetCode160_getIntersectionNode;

import java.util.Map;

//寻找两条链表的第一个公共节点
public class Code88_FindFirstCommonNode {
    public static class TreeNode{
        public TreeNode next;
        public int value;

        public TreeNode(int value){
            this.value = value;
        }
    }

    public static TreeNode FindFirstCommonNode(TreeNode head1, TreeNode head2){
        //得到两条链表的长度
        int L1 = GetListLength(head1); //第一条链表的长度
        int L2 = GetListLength(head2); //第二条链表的长度
        int diff = Math.abs(L1 - L2);

        TreeNode pListHeadLong  = L1 >= L2 ?  head1 : head2;
        TreeNode pListHeadShort = L1 <  L2  ? head1 : head2;

        //先让长的走diff步
        for (int step = 0; step < diff; step++) {
            pListHeadLong = pListHeadLong.next;
        }

        while ((pListHeadLong != null) && (pListHeadShort != null) && (pListHeadLong != pListHeadShort)){
            pListHeadLong =  pListHeadLong.next;
            pListHeadShort = pListHeadShort.next;
        }
        //得到第一个公共节点
        TreeNode pFirstCommonNode = pListHeadLong;

        return pFirstCommonNode;
    }

    //获取链表的长度
    public static int GetListLength(TreeNode head){
        int length = 0;
        while(head != null){
            head = head.next;
            length++;
        }
        return length;
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        node1.next = node2;
        node2.next = node3;
        node3.next = node6;
        node6.next = node7;
        node4.next = node5;
        node5.next = node6;

        TreeNode FirstCommonNode = FindFirstCommonNode(node1, node4);
        System.out.println(FirstCommonNode.value);
    }
}
