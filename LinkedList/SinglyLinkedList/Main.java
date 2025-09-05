package LinkedList.SinglyLinkedList;

public class Main {

    public static void main(String[] args) {

        CustomLinkedList list = new CustomLinkedList();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);

        list.insertLast(100);
        list.displayList();

        list.insertAtIndex(99,2);
        list.displayList();

        System.out.println("deleted: "+list.deleteFirst());
        list.displayList();

        list.insertFirst(27);
        list.insertFirst(46);
        list.displayList();

        System.out.println("deleted: "+list.deleteLast());
        list.displayList();

        list.insertAtIndex(3333,3);
        list.displayList();

        System.out.println("deleted at index: "+list.deleteAtIndex(3));
        list.displayList();

        System.out.println(list.findNodeWithValue(99));

    }
}
