package code;

public class Code76_TreeDepth {

    public static class Node{
        public Node left;
        public Node right;
        public int value;

        public Node(int value){
            this.value = value;
        }
    }

    public static int TreeDepth(Node root){
        if(root == null){
            return 0;
        }
        int LDeepth = TreeDepth(root.left);
        int RDeepth = TreeDepth(root.right);
        return Math.max(LDeepth,RDeepth) + 1;
    }

    public static void main(String[] args) {
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        Node n8 = new Node(8);
        Node n9 = new Node(9);

        n5.left = n3;
        n5.right = n7;
        n3.left = n2;
        n3.right = n4;
        n7.left = n6;
        n7.right = n8;
        n8.left = n9;

        System.out.println(TreeDepth(n5));

    }
}
