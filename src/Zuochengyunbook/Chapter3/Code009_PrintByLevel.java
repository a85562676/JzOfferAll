package Zuochengyunbook.Chapter3;

import java.util.LinkedList;
import java.util.Queue;

/**
       1
      / \
     2   3
    /   / \
   4   5   6
按层打印树
1.Level1: 1
  Level2: 2 3
  Level3: 4 5 6
  Level4: 7 8
按zizag打印树
2.Level1 from left to right: 1
  LevLe2 from right to left: 3 2
  Level3 from left to right: 4 5 6
  Level4 from right to left: 8
 */

public class Code009_PrintByLevel {

    public static class Node{
        public int value;
        public Node left;
        public Node right;
        public Node(){};
        public Node(int value) {
            this.value = value;
        }
    }

    public static void printByLevel(Node head) {
        Queue<Node> queue = new LinkedList<>();
        int level = 1;
        Node last = head; //last变量表示正在打印的当前行的最右节点
        Node nlast= null;//nLast表示下一行的最右节点
        queue.add(head);
        System.out.print ("Level " + (level++) + " : ");
        while (!queue.isEmpty()) {
            head = queue.poll();
            System.out.print(head.value + " ");
            if (head.left != null) {
                queue.add(head.left);
                nlast = head.left;
            }
            if (head.right != null) {
                queue.add(head.right);
                nlast = head.right;
            }
            if (head == last && !queue.isEmpty()) {
                System.out.print ("\nLevel " + (level++) + " : ");
                last = nlast;
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node3.left = node5;
        node3.right = node6;
        printByLevel(node1);
    }
}
