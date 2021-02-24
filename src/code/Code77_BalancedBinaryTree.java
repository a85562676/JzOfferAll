package code;

import com.sun.org.apache.regexp.internal.RE;

public class Code77_BalancedBinaryTree {

    public static class Node{
        public Node left;
        public Node right;
        public int value;

        public Node(int value){
          this.value = value;
        }
    }

    public static boolean IsBalanced(Node head){
        boolean[] res = new boolean[1];
        res[0] = true;
        getHeight(head, 1, res);
        return res[0];
    }

    private static int getHeight(Node head, int level, boolean[] res) {
        if(head == null){
            return level;
        }
        int LH = getHeight(head.left, level + 1, res);
        if(!res[0]){
            return level;
        }
        int RH = getHeight(head.right, level + 1, res);
        if(!res[0]){
            return level;
        }
        if(Math.abs(LH - RH) > 1){
            res[0] = false;
        }
        return Math.max(LH,RH);
    }


    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n4.left = n5;

        System.out.println(IsBalanced(n1));

    }
}
