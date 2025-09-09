package LinkedList.Questions;

public class DeleteNodebyValue {

    public static ListNode deleteNodebyValue(ListNode head, int value){

        if(head == null){
            return null;
        }

        if(head.val == value){
            head = head.next;
            return head;
        }

        ListNode curr = head;
        while(curr.next != null && curr.next.val != value){
            curr = curr.next;
        }

        // value not found
        if(curr.next == null){
            return head;
        }

        curr.next = curr.next.next;

        return head;
    }

    public static void main(String[] args) {
        // 1. Delete from empty list
        ListNode head1 = null;
        head1 = deleteNodebyValue(head1, 10);
        System.out.print("Test 1 (Empty List): ");
        Utilities.printList(head1);

        // 2. Delete head node
        ListNode head2 = Utilities.createLLFromArray(new int[]{1, 2, 3, 4});
        System.out.print("Original List (Test 2): ");
        Utilities.printList(head2);
        head2 = deleteNodebyValue(head2, 1);
        System.out.print("After Deleting 1 (Head): ");
        Utilities.printList(head2);

        // 3. Delete middle node
        ListNode head3 = Utilities.createLLFromArray(new int[]{10, 20, 30, 40, 50});
        System.out.print("Original List (Test 3): ");
        Utilities.printList(head3);
        head3 = deleteNodebyValue(head3, 30);
        System.out.print("After Deleting 30 (Middle): ");
        Utilities.printList(head3);

        // 4. Delete last node
        ListNode head4 = Utilities.createLLFromArray(new int[]{5, 6, 7});
        System.out.print("Original List (Test 4): ");
        Utilities.printList(head4);
        head4 = deleteNodebyValue(head4, 7);
        System.out.print("After Deleting 7 (Last): ");
        Utilities.printList(head4);

        // 5. Try to delete non-existing value
        ListNode head5 = Utilities.createLLFromArray(new int[]{100, 200, 300});
        System.out.print("Original List (Test 5): ");
        Utilities.printList(head5);
        head5 = deleteNodebyValue(head5, 400);
        System.out.print("After Trying to Delete 400 (Not Found): ");
        Utilities.printList(head5);

        // 6. Delete only node in single-node list
        ListNode head6 = Utilities.createLLFromArray(new int[]{999});
        System.out.print("Original List (Test 6): ");
        Utilities.printList(head6);
        head6 = deleteNodebyValue(head6, 999);
        System.out.print("After Deleting 999 (Single Node): ");
        Utilities.printList(head6);
    }

}
