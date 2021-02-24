package code;

public class Code7_NextNodeInBinaryTrees {

    public static class Node{
        public Node parent;
        public Node left;
        public Node right;
        public int value;

        public Node(int val){
            this.value = val;
        }
    }

    public static Node getNextNode(Node node){
        if(node == null){
            return node;
        }
        if(node.right != null){
            return getLeftMost(node.right);
        }else {
            Node parent = node.parent;
            while (parent != null && parent.left != node){
                node = parent;
                parent = node.parent;
            }
            return parent;
        }
    }

    public static Node getLeftMost(Node node) {
        if(node == null){
            return node;
        }
        while (node.left != null){
            node = node.left;
        }
        return node;
    }
}
