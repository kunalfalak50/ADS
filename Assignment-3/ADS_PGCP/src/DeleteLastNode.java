class Node3 {
    int data;
    Node next;

    Node3(int data) {
        this.data = data;
        this.next = null;
    }
}
public class DeleteLastNode  {
    Node head;

    // Delete last node
    void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // If only one node
        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;

        // Traverse to second-last node
        while (temp.next.next != null) {
            temp = temp.next;
        }

        // Remove last node
        temp.next = null;
    }

    // Display LinkedList
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        
    }

	public static void main(String[] args) {
		DeleteLastNode list = new DeleteLastNode();

        // Creating LinkedList: 10 → 20 → 30 → 40
        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);
        list.head.next.next.next = new Node(40);

        System.out.print("\nBefore deletion: ");
        list.display();

        list.deleteLast();

        System.out.print("\nAfter deletion: ");
        list.display();

	}

}
