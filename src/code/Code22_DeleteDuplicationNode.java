package code;

//删除链表中重复的节点1 Input(sorted linked list): 1->2->2->3->3->4->5 Output: 1->4->5
//删除链表中重复的节点2 Input: 1->1->2->3->3 Output: 1->2->3
public class Code22_DeleteDuplicationNode {
    public static class TreeNode{
        public TreeNode next;
        public int val;

        public TreeNode(int value){
            this.val = value;
        }
    }
    //删除链表中重复的节点2 Input: 1->1->2->3->3 Output: 1->2->3
    public static TreeNode deleteDuplication(TreeNode head) {
        if(head==null|| head.next==null){
            return head;
        }
        TreeNode l1 = head;
        TreeNode l2 = head.next;
        while(l2 != null){
            if(l1.val != l2.val){
                l1 = l1.next;
            }
            else{
                l1.next = l2.next;
            }
            l2 = l2.next;
        }
        return head;
    }


    public static TreeNode deleteDuplication2(TreeNode pHead) {
        if (pHead == null || pHead.next == null) {
            return pHead;
        }
        TreeNode pre = null;
        TreeNode cur = pHead;
        while (cur != null) {
            if (cur.next != null && cur.next.val == cur.val) {
                int val = cur.val;
                while (cur.next != null && cur.next.val == val) {
                    cur = cur.next;
                }
                if (pre == null) {
                    pHead = cur.next;
                } else {
                    pre.next = cur.next;
                }
            } else {
                pre = cur;
            }
            cur = cur.next;
        }
        return pHead;
    }

    /**
     * 删除链表重复的节点
     * @param pHead 链表头节点
     * @return 删除节点后的链表
     */
    public static TreeNode deleteDuplication3(TreeNode pHead) {
        if (pHead == null || pHead.next == null) {
            return pHead;
        }

        if (pHead.val == pHead.next.val) {
            if (pHead.next.next == null) {
                return null;
            }
            if (pHead.next.next.val == pHead.val) {
                return deleteDuplication(pHead.next);
            }
            return deleteDuplication(pHead.next.next);
        }
        pHead.next = deleteDuplication(pHead.next);
        return pHead;
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(3);
        TreeNode node5 = new TreeNode(4);
        TreeNode node6 = new TreeNode(4);
        TreeNode node7 = new TreeNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;

        System.out.println(node1.val);
        System.out.println(node1.next.val);
        System.out.println(node1.next.next.val);
        System.out.println(node1.next.next.next.next.val);
        System.out.println(node1.next.next.next.next.next.val);
        System.out.println(node1.next.next.next.next.next.next.val);

        TreeNode treeNode = deleteDuplication(node1);
        System.out.println("===========================================");

        System.out.println(treeNode.val);
        System.out.println(treeNode.next.val);
        System.out.println(treeNode.next.next.val);
        System.out.println(treeNode.next.next.next.val);
        System.out.println(treeNode.next.next.next.next.val);



    }
}
