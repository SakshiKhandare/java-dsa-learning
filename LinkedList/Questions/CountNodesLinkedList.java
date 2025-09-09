package LinkedList.Questions;

public class CountNodesLinkedList {

    public static int countNodes(ListNode head){

        ListNode curr = head;
        int size = 0;

        while (curr != null){
            size++;
            curr = curr.next;
        }

        return size;
    }

    public static void main(String[] args) {
        // Create a linked list from an array
        int[] arr = {1, 2, 3, 4, 5};
        ListNode head = Utilities.createLLFromArray(arr);

        // Print the linked list
        System.out.print("Linked List: ");
        Utilities.printList(head);

        // Count nodes
        int result = countNodes(head);
        System.out.println("Number of nodes: " + result);
    }
}
