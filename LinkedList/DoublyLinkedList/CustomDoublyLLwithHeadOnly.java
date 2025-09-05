package LinkedList.DoublyLinkedList;

public class CustomDoublyLLwithHeadOnly {

    private Node head;
    private int size;

    public CustomDoublyLLwithHeadOnly() {
        this.size = size;
    }

    public void insertFirst(int val){

        Node node = new Node(val);
        node.next = head;
        node.prev = null;

        if(head != null)
            head.prev = node;

        head = node;
        size++;
    }

    public void insertLast(int val){

        Node node = new Node(val);
        Node temp = head;

        node.next = null;

        if(head == null){
            node.prev = null;
            head = node;
            return;
        }
        while(temp.next != null){
            temp = temp.next;
        }

        node.prev = temp;
        temp.next = node;
    }

    public Node findNodeWithValue(int val){

        Node temp = head;

        while(temp != null){
            if(temp.value == val){
                return temp;
            }
            temp = temp.next;
        }

        return null;
    }

    public void insertAfter(int after,int val){

        Node temp = findNodeWithValue(after);

        if(temp == null){
            System.out.println("Node does not exists");
            return;
        }

        Node node = new Node(val);
        node.next = temp.next;
        node.prev = temp;
        if(temp.next != null)
            temp.next.prev = node;
        temp.next = node;

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

        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }

        while(temp != null){
            System.out.print(temp.value+" --> ");
            temp = temp.prev;
        }

        System.out.println("START");
    }

    private class Node{

        private int value;
        private Node prev;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node prev, Node next){
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }


}
