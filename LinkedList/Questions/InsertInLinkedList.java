package LinkedList.Questions;

import static LinkedList.Questions.CountNodesLinkedList.countNodes;

public class InsertInLinkedList {

    public static ListNode insertAtStart(ListNode head, int val){

        ListNode node = new ListNode(val);
        node.next = head;
        head = node;

        return head;
    }

    public static ListNode insertAtEnd(ListNode head, int val){

        if(head == null){
            return insertAtStart(head,val);
        }

        ListNode node = new ListNode(val);
        ListNode curr = head;

        while(curr.next != null){
            curr = curr.next;
        }

        curr.next = node;
        node.next = null;

        return head;
    }

    public static ListNode insertAtPosition(ListNode head, int val, int pos){

        // If inserting at position 1, use insertAtStart() and return new head
        if(pos == 1){
            return insertAtStart(head,val);
        }

        // If position is greater than length+1, insert at end and return head
        if(pos > countNodes(head)+1){
            return insertAtEnd(head, val);
        }

        ListNode node = new ListNode(val);
        ListNode curr = head;
        int index = 1;

        // Traverse list to reach node at (pos-1) position
        while (index != pos-1){
            curr = curr.next;
            index++;
        }

        node.next = curr.next;
        curr.next = node;

        return head;
    }

    public static void main(String[] args) {
        // Test case 1: Insert at start
        System.out.println("Test 1: Insert at Start");
        ListNode head1 = Utilities.createLLFromArray(new int[]{2, 3, 4});
        head1 = insertAtStart(head1, 1);
        Utilities.printList(head1); // Expected: 1 -> 2 -> 3 -> 4 -> null

        // Test case 2: Insert at end
        System.out.println("\nTest 2: Insert at End");
        ListNode head2 = Utilities.createLLFromArray(new int[]{1, 2, 3});
        head2 = insertAtEnd(head2, 4);
        Utilities.printList(head2); // Expected: 1 -> 2 -> 3 -> 4 -> null

        // Test case 3: Insert at position 1 (start)
        System.out.println("\nTest 3: Insert at Position 1 (Start)");
        ListNode head3 = Utilities.createLLFromArray(new int[]{10, 20, 30});
        head3 = insertAtPosition(head3, 5, 1);
        Utilities.printList(head3); // Expected: 5 -> 10 -> 20 -> 30 -> null

        // Test case 4: Insert at middle position
        System.out.println("\nTest 4: Insert at Middle Position");
        ListNode head4 = Utilities.createLLFromArray(new int[]{100, 200, 400});
        head4 = insertAtPosition(head4, 300, 3);
        Utilities.printList(head4); // Expected: 100 -> 200 -> 300 -> 400 -> null

        // Test case 5: Insert at position countNodes(head)+1 (end)
        System.out.println("\nTest 5: Insert at Last Position");
        ListNode head5 = Utilities.createLLFromArray(new int[]{7, 8, 9});
        int pos5 = countNodes(head5) + 1; // position 4
        head5 = insertAtPosition(head5, 10, pos5);
        Utilities.printList(head5); // Expected: 7 -> 8 -> 9 -> 10 -> null

        // Test case 6: Insert at position out of bounds (> length+1)
        System.out.println("\nTest 6: Insert at Out Of Bounds Position");
        ListNode head6 = Utilities.createLLFromArray(new int[]{1, 2, 3});
        head6 = insertAtPosition(head6, 99, 10);
        Utilities.printList(head6); // Expected: 1 -> 2 -> 3 -> 99 -> null

        // Test case 7: Insert in empty list at start
        System.out.println("\nTest 7: Insert in Empty List at Start");
        ListNode head7 = null;
        head7 = insertAtStart(head7, 5);
        Utilities.printList(head7); // Expected: 5 -> null

        // Test case 8: Insert at end when list is empty
        System.out.println("\nTest 8: Insert at End on Empty List");
        ListNode head8 = null;
        head8 = insertAtEnd(head8, 100);
        Utilities.printList(head8); // Expected: 100 -> null

        // Test case 9: Insert at position when list is empty
        System.out.println("\nTest 9: Insert at Position on Empty List");
        ListNode head9 = null;
        head9 = insertAtPosition(head9, 11, 1);
        Utilities.printList(head9); // Expected: 11 -> null
    }

}
