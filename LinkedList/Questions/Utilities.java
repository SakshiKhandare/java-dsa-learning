package LinkedList.Questions;

public class Utilities {

    // function to create linked list from array
    public static ListNode createLLFromArray(int[] arr){

        if(arr.length == 0){
            return null;
        }

        ListNode head = new ListNode(arr[0]);
        ListNode curr = head;

        for (int i = 1; i < arr.length; i++) {
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }

        return head;
    }


    // function to print linked list
    public static void printList(ListNode head){

        while (head != null){
            System.out.print(head.val + " -> ");
            head = head.next;
        }

        System.out.println("null");
    }
}