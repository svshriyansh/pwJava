package DSA.LinkList;

public class ReverseLinkList {
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

    public void InsertAfter(int newData, Node prev_node) {
        Node newNode = new Node(newData);
        if (prev_node == null) {
            System.out.println("The previous node cannot contain value null");
        }

        newNode.next = prev_node.next;
        prev_node.next = newNode;
        return;
    }

    // Recursive approach of reversal of linkList
    public void reverseRec(Node cur, Node prev) {
        if (cur.next == null) {
            head = cur;
            cur.next = prev;
            return;
        }
        Node next = cur.next;
        cur.next = prev;
        reverseRec(next, cur);
    }

    // Iterative approach of revercing a linklist
    public void Reverse() {
        Node curr = head;
        Node next = null;
        Node prev = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
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
        ReverseLinkList list = new ReverseLinkList();
        list.insertAtEnd(2);
        list.insertAtEnd(5);
        list.insertAtEnd(8);

        System.out.println("Orignal LinkList");
        list.Displayll();
        list.Reverse();
        System.out.println("Reversed LinkList");
        list.Displayll();
        System.out.println("Reversal of  LinkList recursively");
        list.reverseRec(list.head, null);
        list.Displayll();

    }
}
