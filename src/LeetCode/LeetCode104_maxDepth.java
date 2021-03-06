package LeetCode;

public class LeetCode104_maxDepth {
    public static class TreeNode{
        public TreeNode left;
        public TreeNode right;
        public int val;

        public TreeNode(int val){
            this.val = val;
        }
    }

    public static int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

}
