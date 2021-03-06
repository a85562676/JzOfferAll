package LeetCode;

public class LeetCode101_IsSymmetricTree {

    public static class TreeNode{
        public TreeNode left;
        public TreeNode right;
        public int value;

        public TreeNode(int value){
            this.value = value;
        }
    }

    public static boolean isSymmetricTree(TreeNode root){
        if(root == null){
            return true;
        }
        return process(root.left, root.right);
    }

    public static boolean process(TreeNode t1, TreeNode t2) {
        if(t1 == null && t2 ==null){
            return true;
        }
        if(t1 !=null && t2 == null){
            return false;
        }
        if(t1 == null && t2 != null){
            return false;
        }
        if(t1.value != t2.value){
            return false;
        }
        return process(t1.left, t2.right) && process(t1.right, t2.left);
    }
}
