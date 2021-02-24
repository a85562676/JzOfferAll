package code;

public class Code31_MirrorOfBinaryTree {
    public static class TreeNode{
        public TreeNode left;
        public TreeNode right;
        public int val;
        public TreeNode(int value){
            this.val = value;
        }
    }

    public static void Mirror(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return;
        }

        TreeNode t = root.left;
        root.left = root.right;
        root.right = t;
        Mirror(root.left);
        Mirror(root.right);
    }


    public static void mirrorOfBinaryTree(TreeNode root){

        if(root == null || ( root.left == null && root.right == null)){
            return;
        }
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        mirrorOfBinaryTree(root.left);
        mirrorOfBinaryTree(root.right);
    }




    public static void main(String[] args){
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);

        n1.left  = n2;
        n1.right = n3;
        n2.left  = n4;
        n2.right = n5;
        n3.left  = n6;
        n3.right = n7;

//        Mirror(n1);
        mirrorOfBinaryTree(n1);

        System.out.println(n1.left.val);
        System.out.println(n1.right.val);
        System.out.println(n1.left.left.val);
        System.out.println(n1.left.right.val);
        System.out.println(n1.right.left.val);
        System.out.println(n1.right.right.val);

    }
}
