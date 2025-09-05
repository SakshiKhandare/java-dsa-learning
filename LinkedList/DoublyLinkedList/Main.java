package LinkedList.DoublyLinkedList;

public class Main {

    public static void main(String[] args) {

        CustomDoublyLinkedList list = new CustomDoublyLinkedList();
        list.insertFirst(11);

        list.displayList();

        list.insertFirst(12);
        list.insertFirst(13);
        list.insertFirst(14);
        list.insertFirst(15);
        list.insertFirst(16);
        list.insertFirst(17);

        list.displayList();
        System.out.println("reverse list: ");
        list.reverseDisplayList();

        CustomDoublyLLwithHeadOnly newList = new CustomDoublyLLwithHeadOnly();
        newList.insertFirst(1);
        newList.insertFirst(2);
        newList.insertFirst(3);

        newList.displayList();
        newList.reverseDisplayList();

        newList.insertLast(99);
        newList.insertAfter(3,7);
        newList.displayList();
        newList.reverseDisplayList();
    }
}
