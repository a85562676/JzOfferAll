package code;

import java.util.Stack;

public class Code35_IsPopOrder {

    public static boolean IsPopOrder(int[] pushA,int[] popA) {
        if (pushA == null || popA == null || pushA.length != popA.length) {
            return false;
        }
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        int n = pushA.length;
        boolean flag = false;
        for (int val : popA) {
            while (stack.isEmpty() || stack.peek() != val) {
                if (i >= n) {
                    flag = true;
                    break;
                }
                stack.push(pushA[i++]);
            }
            if (flag) {
                break;
            }
            stack.pop();
        }
        return stack.isEmpty();
    }

    public static void main(String[] args){
        int[] pushA = new int[]{1,2,3,4,5};
        int[] popA  = new int[]{4,3,5,1,2};
        System.out.println(IsPopOrder(pushA, popA));
    }
}
