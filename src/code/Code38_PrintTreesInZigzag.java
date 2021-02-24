package code;
import java.util.Stack;
import java.util.ArrayList;

public class Code38_PrintTreesInZigzag {

    public static class TreeNode{
        public TreeNode left;
        public TreeNode right;
        public int val;
        public TreeNode(int value){
            this.val = value;
        }
    }


    public static ArrayList<ArrayList<Integer>> PrintTreesInZigzag(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if(pRoot == null){
            return res;
        }
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.push(pRoot);
        int index = 1;
        Stack<TreeNode> stack = stack1;
        while (!stack.isEmpty()){
            ArrayList<Integer> list = new ArrayList<>();
            while (!stack.isEmpty()){
                TreeNode node = stack.pop();
                list.add(node.val);
                if(index % 2 == 1){
                    if(node.left != null){
                        stack2.push(node.left);
                    }
                    if(node.right !=null){
                        stack2.push(node.right);
                    }
                }else {
                    if(node.right != null){
                        stack1.push(node.right);
                    }
                    if(node.left != null){
                        stack1.push(node.left);
                    }
                }
            }
            res.add(list);
            ++index;
            stack = stack1.isEmpty() ? stack2 : stack1;
        }
        return res;
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

        ArrayList<ArrayList<Integer>> arrayLists = PrintTreesInZigzag(n1);
        System.out.println(arrayLists);
    }
}
