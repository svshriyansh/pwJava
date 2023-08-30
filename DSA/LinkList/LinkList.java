package DSA.LinkList;

public class LinkList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void insertAtBegning(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
        return;
    }

    public void insertAtEnd(int newData) {
        Node newNode = new Node(newData);
        // check if ll is empty
        if (head == null) {
            head = new Node(newData);
            return;
        }
        // ll is not empty
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return;

    }

    // Implementation of deletion f a node in linkList
    public void Deletion(int position) {
        // checking is linklist empty?
        Node temp = head;
        if (head == null) {
            return;
        }
        // deletion is in the begning of node
        if (position == 0) {
            head = head.next;
            return;
        }
        // deletion is not in the begning

        for (int i = 0; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null && temp.next == null) {
            return;
        }
        temp.next = temp.next.next;
    }

    public void InsertAfter(int newData, Node prev_node) {
        Node newNode = new Node(newData);
        if (prev_node == null) {
            System.out.println("The previous node cannot contain value null");
        }

        newNode.next = prev_node.next;
        prev_node.next = newNode;
        return;
    }

    // Display ll
    public void Displayll() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();

        return;
    }

    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.insertAtEnd(2);
        list.insertAtEnd(5);
        list.insertAtEnd(8);

        list.Displayll();
        System.out.println("Inserting value after 2");
        list.InsertAfter(14, list.head);
        list.Displayll();

        System.out.println("Adding value 10 at the start");
        list.insertAtBegning(10);
        list.Displayll();

        list.Deletion(0);
        System.out.println("LinkList after Delition of 0 position");
        list.Displayll();
        list.Deletion(2);
        System.out.println("LinkList after Delition of 2 postion");
        list.Displayll();
    }

    public void Reverse() {
    }

}
