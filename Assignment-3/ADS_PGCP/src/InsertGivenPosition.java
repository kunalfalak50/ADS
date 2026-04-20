class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class InsertGivenPosition  {

    public static Node insertAtPosition(Node head, int data, int position) {

        Node newNode = new Node(data);

        // Case 1: Insert at beginning
        if (position == 0) {
            newNode.next = head;
            return newNode;
        }

        Node temp = head;

        // Traverse to (position - 1)
        for (int i = 0; i < position - 1; i++) {
            temp = temp.next;
        }

        // Insert node
        newNode.next = temp.next;
        temp.next = newNode;

        return head;
    }
    public static void printList(Node head) {
    Node temp = head;
    while (temp != null) {
        System.out.print(temp.data + " → ");
        temp = temp.next;
    }
    System.out.println("null");

    }
public static void main(String[] args) {

    // Creating LinkedList: 10 → 20 → 30 → 40
    Node head = new Node(10);
    head.next = new Node(20);
    head.next.next = new Node(30);
    head.next.next.next = new Node(40);

    head = insertAtPosition(head, 25, 2);

    printList(head);
}
}
