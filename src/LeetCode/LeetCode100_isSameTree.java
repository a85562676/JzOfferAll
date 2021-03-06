package LeetCode;

//判断是否是同一棵树
public class LeetCode100_isSameTree {

    public static class TreeNode{
        public TreeNode left;
        public TreeNode right;
        public int val;

        public TreeNode(int val){
            this.val = val;
        }
    }

    public static boolean isSameTree(TreeNode p, TreeNode q){
        if(p != null && q == null){
            return false;
        }
        if(p == null && q != null){
            return false;
        }
        if(p == null && q == null){
            return true;
        }
        if(p.val == q.val){
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }else {
            return false;
        }
    }


}
