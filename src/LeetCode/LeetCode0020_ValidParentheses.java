package LeetCode;

import java.util.HashMap;
import java.util.Stack;

/**
Example 1:
 Input: s = "()"
 Output: true

Example 2:
 Input: s = "()[]{}"
 Output: true

Example 3:
 Input: s = "(]"
 Output: false
*/

public class LeetCode0020_ValidParentheses {
    public static boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        Stack<Character> stack = new Stack<Character>();
        map.put(']', '[');
        map.put('}', '{');
        map.put(')', '(');

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                char topElement = stack.empty() ? '#' : stack.pop();
                if (topElement != map.get(ch)) {
                    return false;
                }
            } else {
                stack.push(ch);
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        String s = "([)]{}";
        boolean valid = isValid(s);
        System.out.println(valid);
    }
}
