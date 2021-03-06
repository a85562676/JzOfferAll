package LeetCode;

import java.util.Stack;

public class LeetCode155_MinStack {
    Stack<Integer> stack = new Stack<>();  //主栈
    Stack<Integer> minstack = new Stack<>();     //维系最小值的栈

    public void push(int x) {
        stack.push(x);
        if(minstack.isEmpty() || x <= minstack.peek()){
            minstack.push(x);
        }
    }

    public void pop() {
        int popValue = stack.pop();
        if(popValue == minstack.peek()){
            minstack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minstack.peek();
    }

    public static void main(String[] args) {
        LeetCode155_MinStack minStack = new LeetCode155_MinStack();
        minStack.push(10);
        minStack.push(2);
        minStack.push(3);
        minStack.push(4);
    }

}
