public class LL {

    private Node head;
    private Node tail;

    private int size;

    public LL() {
        this.size = 0;
    }

    /* this is to insert a new element to a newly created linked list */

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }

        size += 1;
    }


    /* If the specified index is neither 0 nor the size of the list,
     then the new node needs to be inserted somewhere in the middle of the list.
     The method does this by creating a new Node object with the given value
     and a reference to the node that currently occupies the index after the specified
     index. It then sets the next property of the node at the index before the specified
     index to the new node. Finally, the size of the linked list is incremented by 1. */

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            inserLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;
        size += 1;
    }


    /* To delete the first element of the linked list */

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    /* To delete the last element of the linked list */

    public int deleteLast() {
        if (size <= 1){
            return deleteFirst();
        }
        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1){
            return deleteLast();
        }
        Node prev = get(index);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;
    }

    /*  to find the index of the value that is asked */

    public Node find(int value) {
        Node node = head;
        while (node != null){
            if (node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 1; i < index; i++){
            node = node.next;
        }
        return node;
    }

    /*  To display all the elements in the linked list */

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
    }

    /*  it adds a new node to the end of the linked list */
    
    public void inserLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size += 1;
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
