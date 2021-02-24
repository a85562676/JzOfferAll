package code;

import java.util.*;

public class Code34_MinInStack {

    public static Stack<Integer> stack1 = new Stack<>();
    public static Stack<Integer> stack2 = new Stack<>();

    public static void push(int node){
        stack1.push(node);
        if (stack2.isEmpty() || stack2.peek() >= node){
            stack2.push(node);
        }else {
            stack2.push(stack2.peek());
        }
    }

    public static void pop(){
        stack1.pop();
        stack2.pop();
    }

    public static int min(){
        return stack2.peek();
    }

}
