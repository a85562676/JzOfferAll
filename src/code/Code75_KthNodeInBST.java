package code;

import java.util.ArrayList;

public class Code75_KthNodeInBST {

    public static class Node{
        public Node left;
        public Node right;
        public int value;

        public Node(int value){
            this.value = value;
        }
    }

    public static ArrayList<Node> resultList=new ArrayList<>();

    public static Node KthNode(Node pRoot, int k)
    {
        if(pRoot==null){
            return null;
        }
        interTransform(pRoot);
        if(k<=resultList.size() && k>=1){
            return resultList.get(k - 1);
        }
        return null;
    }

    public  static void interTransform(Node pRoot){
        if(pRoot == null){
            return;
        }
        interTransform(pRoot.left);
        resultList.add(pRoot);
        interTransform(pRoot.right);
    }

    public static void main(String[] args){
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        Node n8 = new Node(8);

        n5.left = n3;
        n5.right = n7;
        n3.left = n2;
        n3.right = n4;
        n7.left = n6;
        n7.right = n8;

        System.out.println(KthNode(n5,4).value);
    }
}
