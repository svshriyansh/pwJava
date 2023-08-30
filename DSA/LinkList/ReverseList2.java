package DSA.LinkList;

public class ReverseList2 {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
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

    public Node Reversal(Node head, int left, int right) {

        if (head == null || head.next == null)
            return head;
        Node node = new Node(-1);
        Node prev = node;
        node.next = head;
        for (int i = 0; i < left - 1; i++) {
            prev = prev.next;
            // System.out.println(prev.data);
        }
        Node curr = prev.next;

        Node next;
        for (int i = 0; i < right - left; i++) {
            next = curr.next;
            System.out.println("Next element is " + next.data);
            System.out.println("current element is " + curr.data);
            curr.next = next.next;
            System.out.println("current element is " + curr.data + " Next .next data is " + next.next.data);
            next.next = prev.next;
            System.out.println("prev next is " + prev.next.data + " Next .next data is " + next.next.data);
            prev.next = next;
            System.out.println("prev next is " + prev.next.data);
        }
        return node.next;

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

    public void printll(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        ReverseList2 list = new ReverseList2();
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);
        list.insertAtEnd(5);

        list.Displayll();
        list.head = list.Reversal(list.head, 3, 4);
        System.out.println("Reversed list is ");
        list.Displayll();

    }
}
