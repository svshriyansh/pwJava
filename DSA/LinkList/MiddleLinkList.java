package DSA.LinkList;

public class MiddleLinkList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void middleEle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Middle element is " + slow.data);
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
        MiddleLinkList list = new MiddleLinkList();
        list.insertAtEnd(2);
        list.insertAtEnd(5);
        list.insertAtEnd(8);
        list.insertAtBegning(10);
        list.insertAtBegning(12);

        list.Displayll();

        list.middleEle();
    }
}
