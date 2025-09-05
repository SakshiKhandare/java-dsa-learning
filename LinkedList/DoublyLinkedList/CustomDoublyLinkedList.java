package LinkedList.DoublyLinkedList;

public class CustomDoublyLinkedList {
    private Node head;
    private Node tail;

    private int size;

    public CustomDoublyLinkedList() {
        this.size = size;
    }

    public void insertFirst(int val){

        Node node = new Node(val);
        node.next = head;
        node.prev = null;

        if(head != null){
            head.prev = node;
        }

        head = node;

        if(tail==null){
            tail = head;
        }

        size++;
    }

    public void displayList(){

        Node temp = head;

        while(temp != null){
            System.out.print(temp.value+" --> ");
            temp = temp.next;
        }


        System.out.println("END");
    }

    public void reverseDisplayList(){

        Node temp = tail;

        while(temp != null){
            System.out.print(temp.value+" --> ");
            temp = temp.prev;
        }

        System.out.println("END");
    }

    private class Node{

        private int value;
        private Node prev;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node prev, Node next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }

}
