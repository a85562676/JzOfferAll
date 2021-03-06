package LeetCode;

public class LeetCode108_sortedArrayToBST {
    public static class TreeNode{
        public TreeNode left;
        public TreeNode right;
        public int val;

        public TreeNode(int val){
            this.val = val;
        }
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        int numsLength = nums.length;
        return getHeightBalancedBST(nums, 0, numsLength);
    }

    public static TreeNode getHeightBalancedBST(int[] nums, int start, int length){
        if(length == 0){
            return null;
        }
        int half = length / 2;
        int halfPos = start + half;
        TreeNode root = new TreeNode(nums[halfPos]);
        if(length > 1){
            root.left = getHeightBalancedBST(nums, start, half);
            root.right = getHeightBalancedBST(nums, halfPos + 1, length - 1 - half);
        }
        return root;
    }

}
