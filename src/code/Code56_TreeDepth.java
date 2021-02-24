package code;

public class Code56_TreeDepth {

    public static class TreeNode{
        public TreeNode left;
        public TreeNode right;
        public int val;
        public TreeNode(int value){
            this.val = value;
        }
    }

    public static int treeDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int lDepth = treeDepth(root.left);
        int rDepth = treeDepth(root.right);
        return 1 + Math.max(lDepth, rDepth);
    }

}
