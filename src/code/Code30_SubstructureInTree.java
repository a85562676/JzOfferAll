package code;

public class Code30_SubstructureInTree {

    public static class TreeNode{
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int data){
            this.val = data;
        }
    }

    public static boolean HasSubtree(TreeNode root1, TreeNode root2) {

        if (root1 == null || root2 == null) {
            return false;
        }

        return isSame(root1, root2) || HasSubtree(root1.left, root2) || HasSubtree(root1.right, root2);
    }

    private static boolean isSame(TreeNode root1, TreeNode root2) {

        if (root2 == null) {
            return true;
        }

        // 在root2，root1遍历完成后，仍未找到符合的结构，返回false
        if (root1 == null) {
            return false;
        }

        if (root1.val != root2.val) {
            return false;
        }

        return isSame(root1.left, root2.left) && isSame(root1.right, root2.right);
    }

}
