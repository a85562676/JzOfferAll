package Zuochengyunbook.Chapter8;


public class ReverseLinkedList {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }


    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next;

        while (current != null) {
            next = current.next; // Save the next node
            current.next = prev; // Reverse the link

            // Move to the next pair of nodes
            prev = current;
            current = next;
        }

        // After the loop, 'prev' will be the new head of the reversed list
        return prev;
    }

    // Helper method to print the linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ReverseLinkedList solution = new ReverseLinkedList();

        // Example usage:
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original Linked List:");
        solution.printList(head);

        ListNode reversedHead = solution.reverseList(head);

        System.out.println("Reversed Linked List:");
        solution.printList(reversedHead);
    }
}

