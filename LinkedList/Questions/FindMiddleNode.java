package LinkedList.Questions;

public class FindMiddleNode {

    public static ListNode findmiddleNode(ListNode head){

        ListNode slow = head;
        ListNode fast = head;

        // Traverse the list: move slow by one and fast by two.
        // When fast reaches the end, slow will be at the middle.
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        // Odd length: 1 -> 2 -> 3 -> 4 -> 5
        int[] arr1 = {1, 2, 3, 4, 5};
        ListNode head1 = Utilities.createLLFromArray(arr1);
        System.out.print("List (odd): ");
        Utilities.printList(head1);
        ListNode mid1 = findmiddleNode(head1);
        System.out.println("Middle node value (odd): " + (mid1 != null ? mid1.val : "null"));
        System.out.println("--------------------------------------");

        // Even length: 10 -> 20 -> 30 -> 40 -> 50 -> 60
        int[] arr2 = {10, 20, 30, 40, 50, 60};
        ListNode head2 = Utilities.createLLFromArray(arr2);
        System.out.print("List (even): ");
        Utilities.printList(head2);
        ListNode mid2 = findmiddleNode(head2);
        System.out.println("Middle node value (even): " + (mid2 != null ? mid2.val : "null"));
        System.out.println("--------------------------------------");

        // Single node: 99
        int[] arr3 = {99};
        ListNode head3 = Utilities.createLLFromArray(arr3);
        System.out.print("List (single node): ");
        Utilities.printList(head3);
        ListNode mid3 = findmiddleNode(head3);
        System.out.println("Middle node value (single node): " + (mid3 != null ? mid3.val : "null"));
        System.out.println("--------------------------------------");

        // Two nodes: 1 -> 2
        int[] arr4 = {1, 2};
        ListNode head4 = Utilities.createLLFromArray(arr4);
        System.out.print("List (two nodes): ");
        Utilities.printList(head4);
        ListNode mid4 = findmiddleNode(head4);
        System.out.println("Middle node value (two nodes): " + (mid4 != null ? mid4.val : "null"));
        System.out.println("--------------------------------------");

        // Empty list
        int[] arr5 = {};
        ListNode head5 = Utilities.createLLFromArray(arr5);
        System.out.print("List (empty): ");
        Utilities.printList(head5);
        ListNode mid5 = findmiddleNode(head5);
        System.out.println("Middle node value (empty): " + (mid5 != null ? mid5.val : "null"));
        System.out.println("--------------------------------------");
    }
}
