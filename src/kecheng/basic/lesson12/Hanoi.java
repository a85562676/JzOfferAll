package kecheng.basic.lesson12;

import algorithmbasic2020.class17.Code02_Hanoi;

import java.util.Stack;

// 汉诺塔问题
public class Hanoi {

    public static void hanoi1(int n) {
        leftToRight(n);
    }

    // 请把1～N层圆盘 从左移到右
    /**
     * 三个步骤：
     * 1.先把1～N-1层从left移到mid
     * 2.再把第N层从left移到right
     * 3.再把1～N-1层从mid移到right
     */
    public static void leftToRight(int n) {
        if (n == 1) {  // base case
            System.out.println("Move 1 from left to right");
            return;
        }
        leftToMid(n - 1);  // 先把1～N-1层从left移到mid
        System.out.println("Move " + n + " from left to right"); // 再把第N层从left移到right
        midToRight(n - 1); // 再把1～N-1层从mid移到right
    }

    // 请把1～N层圆盘 从左移到中间
    /**
     * 三个步骤：
     * 1.先把1～N-1层从left移到right
     * 2.再把第N层从left移到mid
     * 3.再把1～N-1层从right移到mid
     */
    private static void leftToMid(int n) {
        if (n == 1) { // base case
            System.out.println("Move 1 from left to mid");
            return;
        }
        leftToRight(n - 1); // 先把1～N-1层从left移到right
        System.out.println("Move " + n + " from left to mid"); // 再把第N层从left移到mid
        rightToMid(n - 1); // 再把1～N-1层从right移到mid
    }

    // 请把1～N层圆盘 从中间移到右
    /**
     * 三个步骤：
     * 1.先把1～N-1层从left移到mid
     * 2.再把第N层从left移到right
     * 3.再把1～N-1层从mid移到right
     */
    private static void midToRight(int n) {
        if (n == 1) {
            System.out.println("Move 1 from mid to right");
            return;
        }
        midToLeft(n - 1); //先把1～N-1层从mid移到left
        System.out.println("Move " + n + " from mid to right"); // 再把第N层从mid移到right
        leftToRight(n - 1); // 再把1～N-1层从left移到right
    }

    // 请把1～N层圆盘 从中间移到左
    /**
     * 三个步骤：
     * 1.先把1～N-1层从mid移到right
     * 2.再把第N层从mid移到left
     * 3.再把1～N-1层从right移到left
     */
    private static void midToLeft(int n) {
        if (n == 1) {
            System.out.println("Move 1 from mid to left");
            return;
        }
        midToRight(n - 1); //先把1～N-1层从mid移到left
        System.out.println("Move " + n + " from mid to left"); // 再把第N层从mid移到right
        rightToLeft(n - 1); // 再把1～N-1层从left移到right
    }

    // 请把1～N层圆盘 从右移到中间
    /**
     * 三个步骤：
     * 1.先把1～N-1层从right移到left
     * 2.再把第N层从right移到mid
     * 3.再把1～N-1层从left移到mid
     */
    private static void rightToMid(int n) {
        if (n == 1) { // base case
            System.out.println("Move 1 from right to mid");
            return;
        }
        rightToLeft(n - 1); // 先把1～N-1层从left移到right
        System.out.println("Move " + n + " from right to mid"); // 再把第N层从left移到mid
        leftToMid(n - 1); // 再把1～N-1层从right移到mid
    }

    // 请把1～N层圆盘 从右移到左
    /**
     * 三个步骤：
     * 1.先把1～N-1层从right移到mid
     * 2.再把第N层从right移到left
     * 3.再把1～N-1层从mid移到left
     */
    private static void rightToLeft(int n) {
        if (n == 1) { // base case
            System.out.println("Move 1 from right to left");
            return;
        }
        rightToMid(n - 1); // 先把1～N-1层从right移到mid
        System.out.println("Move " + n + " from right to left"); // 再把第N层从right移到left
        midToLeft(n - 1); // 再把1～N-1层从mid移到left
    }

    public static void hanoi2(int n) {
        if (n > 0) {
            func(n, "left", "right", "mid");
        }
    }

    private static void func(int n, String from, String to, String other) {
        if (n == 1) { // base case
            System.out.println("Move 1 from " + from + " to " + to);
        } else {
            func(n - 1, from, other, to);
            System.out.println("Move " + n + " from " + from + " to " + to);
            func(n - 1, other, to, from);
        }
    }

    public static class Record {
        public boolean finish1;
        public int base;
        public String from;
        public String to;
        public String other;

        public Record(boolean f1, int b, String f, String t, String o) {
            finish1 = false;
            base = b;
            from = f;
            to = t;
            other = o;
        }
    }

    public static void hanoi3(int N) {
        if (N < 1) {
            return;
        }
        Stack<Record> stack = new Stack<>();
        stack.add(new Record(false, N, "left", "right", "mid"));
        while (!stack.isEmpty()) {
            Record cur = stack.pop();
            if (cur.base == 1) {
                System.out.println("Move 1 from " + cur.from + " to " + cur.to);
                if (!stack.isEmpty()) {
                    stack.peek().finish1 = true;
                }
            } else {
                if (!cur.finish1) {
                    stack.push(cur);
                    stack.push(new Record(false, cur.base - 1, cur.from, cur.other, cur.to));
                } else {
                    System.out.println("Move " + cur.base + " from " + cur.from + " to " + cur.to);
                    stack.push(new Record(false, cur.base - 1, cur.other, cur.to, cur.from));
                }
            }
        }
    }

    public static void main(String[] args) {
        hanoi1(3);
        System.out.println("======================");
        hanoi2(3);
        System.out.println("======================");
        hanoi3(3);
    }
}
