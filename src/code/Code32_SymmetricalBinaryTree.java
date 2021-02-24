package code;

public class Code32_SymmetricalBinaryTree {

//    public static class TreeNode{
//        public TreeNode left;
//        public TreeNode right;
//        public int val;
//        public TreeNode(int value){
//            this.val = value;
//        }
//    }
//
//    public static boolean isSymmetrical(TreeNode pRoot) {
//        return isSymmetrical(pRoot, pRoot);
//    }
//
//    private static boolean isSymmetrical(TreeNode pRoot1, TreeNode pRoot2) {
//        if (pRoot1 == null && pRoot2 == null) {
//            return true;
//        }
//        if (pRoot1 == null || pRoot2 == null) {
//            return false;
//        }
//        if (pRoot1.val != pRoot2.val) {
//            return false;
//        }
//        return isSymmetrical(pRoot1.left, pRoot2.right) && isSymmetrical(pRoot1.right, pRoot2.left);
//    }

    public static class TreeNode{
        public TreeNode left;
        public TreeNode right;
        public int value;

        public TreeNode(int value){
            this.value = value;
        }
    }

    public static boolean isSymmetrical(TreeNode root){
        return isSymmetrical(root, root);
    }

    public static boolean isSymmetrical(TreeNode root1, TreeNode root2){
        if(root1 == null && root2 == null){
            return true;
        }

        if(root1 == null || root2 == null){
            return false;
        }

        if( root1.value != root2.value ){
            return false;
        }

        return isSymmetrical(root1.left, root2.right) && isSymmetrical(root1.right, root2.left);
    }


    public static void main(String[] args){
        TreeNode n1 = new TreeNode(8);
        TreeNode n2 = new TreeNode(6);
        TreeNode n3 = new TreeNode(6);
        TreeNode n4 = new TreeNode(5);
        TreeNode n5 = new TreeNode(7);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(5);

        n1.left  = n2;
        n1.right = n3;
        n2.left  = n4;
        n2.right = n5;
        n3.left  = n6;
        n3.right = n7;

        System.out.println(isSymmetrical(n1));

    }
}
