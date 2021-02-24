package code;

// 时间复杂度O(1) 删除一个节点
public class Code21_DeleteNode {

    public static class TreeNode{
        public TreeNode next;
        public int value;

        public TreeNode(int value){
            this.value = value;
        }
    }

    // pListHead 头结点   pToBeDeleted  需要删除的点
    public static void DeleteNode(TreeNode pListHead, TreeNode pToBeDeleted){
        if(pListHead == null || pToBeDeleted == null){  //链表长度为0 需要删除的点为空
            return;
        }

        //需要删除的节点不是尾节点
        if(pToBeDeleted.next != null){
            TreeNode next = pToBeDeleted.next;
            pToBeDeleted.value = next.value;
            pToBeDeleted.next = next.next;
        }

        // 链表只有一个节点，删除头结点(也是尾节点)
        else if(pListHead == pToBeDeleted){
            pListHead = null;
            pToBeDeleted = null;
        }

        //链表中有多个节点，删除尾节点
        else {
            TreeNode cur = pListHead;
            while (cur.next != pToBeDeleted){
                cur = cur.next;
            }
            cur.next = null;
        }
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        System.out.println(node1.value);
        System.out.println(node1.next.value);
        System.out.println(node1.next.next.value);
        System.out.println(node1.next.next.next.value);

        DeleteNode(node1, node2);
        System.out.println("===========================================");

        System.out.println(node1.value);
        System.out.println(node1.next.value);
        System.out.println(node1.next.next.value);


    }
}
