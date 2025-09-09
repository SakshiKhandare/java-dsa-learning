package LinkedList.Questions;

public class RemoveGreaterThanValue {

    public static ListNode removeGreaterThanValue(ListNode head, int val){

        // Initialize a dummy node to simplify edge case handling (e.g., deleting head nodes)
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        // left tracks the last node kept, right traverses the list
        ListNode prev = dummy;
        ListNode curr = head;
        while (curr != null){
            if (curr.val > val){
                // Remove: skip current node
                prev.next = curr.next;
            } else {
                // Move previous when keeping node
                prev = curr;
            }
            // Always move curr
            curr = curr.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        // Test 1: Mixed values, val in the middle
        System.out.println("Test 1: Mixed values, val = 5");
        ListNode head1 = Utilities.createLLFromArray(new int[]{1, 3, 5, 7, 2, 8, 4});
        head1 = removeGreaterThanValue(head1, 5);
        Utilities.printList(head1); // Expected: 1 -> 3 -> 5 -> 2 -> 4 -> null

        // Test 2: All nodes greater than val
        System.out.println("\nTest 2: All nodes greater than val = 0");
        ListNode head2 = Utilities.createLLFromArray(new int[]{2, 3, 10, 8});
        head2 = removeGreaterThanValue(head2, 0);
        Utilities.printList(head2); // Expected: null

        // Test 3: All nodes less than or equal to val
        System.out.println("\nTest 3: All nodes <= val = 10");
        ListNode head3 = Utilities.createLLFromArray(new int[]{2, 3, 10, 7});
        head3 = removeGreaterThanValue(head3, 10);
        Utilities.printList(head3); // Expected: 2 -> 3 -> 10 -> 7 -> null

        // Test 4: Empty list
        System.out.println("\nTest 4: Empty list");
        ListNode head4 = Utilities.createLLFromArray(new int[]{});
        head4 = removeGreaterThanValue(head4, 5);
        Utilities.printList(head4); // Expected: null

        // Test 5: Single node, above threshold
        System.out.println("\nTest 5: Single node above threshold");
        ListNode head5 = Utilities.createLLFromArray(new int[]{42});
        head5 = removeGreaterThanValue(head5, 10);
        Utilities.printList(head5); // Expected: null

        // Test 6: Single node, below or equal to threshold
        System.out.println("\nTest 6: Single node <= threshold");
        ListNode head6 = Utilities.createLLFromArray(new int[]{0});
        head6 = removeGreaterThanValue(head6, 0);
        Utilities.printList(head6); // Expected: 0 -> null

        // Test 7: Duplicates of threshold
        System.out.println("\nTest 7: Duplicates of threshold value 5");
        ListNode head7 = Utilities.createLLFromArray(new int[]{5, 5, 5, 6, 5, 7});
        head7 = removeGreaterThanValue(head7, 5);
        Utilities.printList(head7); // Expected: 5 -> 5 -> 5 -> 5 -> null

        // Test 8: All values equal to val
        System.out.println("\nTest 8: All values == val = 4");
        ListNode head8 = Utilities.createLLFromArray(new int[]{4, 4, 4});
        head8 = removeGreaterThanValue(head8, 4);
        Utilities.printList(head8); // Expected: 4 -> 4 -> 4 -> null

        // Test 9: Threshold at Integer.MIN_VALUE (remove all positives)
        System.out.println("\nTest 9: Threshold at Integer.MIN_VALUE");
        ListNode head9 = Utilities.createLLFromArray(new int[]{-5, 0, 10});
        head9 = removeGreaterThanValue(head9, Integer.MIN_VALUE);
        Utilities.printList(head9); // Expected: null

        // Test 10: Threshold at Integer.MAX_VALUE (nothing removed)
        System.out.println("\nTest 10: Threshold at Integer.MAX_VALUE");
        ListNode head10 = Utilities.createLLFromArray(new int[]{-100, 0, 100, 5000});
        head10 = removeGreaterThanValue(head10, Integer.MAX_VALUE);
        Utilities.printList(head10); // Expected: -100 -> 0 -> 100 -> 5000 -> null
    }
}
