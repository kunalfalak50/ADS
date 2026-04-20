package pgcp;

class Node4 {
    int data;
    Node next;

    Node4(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DeleteByValue  {
    Node head;

    // Delete node by value
    void deleteValue(int value) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // If head node needs to be deleted
        if (head.data == value) {
            head = head.next;
            return;
        }

        Node temp = head;

        // Find the node before the one to delete
        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }

        // If value found, delete it
        if (temp.next != null) {
            temp.next = temp.next.next;
        } else {
            System.out.println("Value not found");
        }
    }

    // Display LinkedList
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "  ");
            temp = temp.next;
        }
        
    }

    public static void main(String[] args) {
    	DeleteByValue  list = new DeleteByValue ();

        // Creating LinkedList: 10 → 20 → 30 → 40
        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);
        list.head.next.next.next = new Node(40);

        System.out.print("\nBefore deletion: ");
        list.display();

        list.deleteValue(30);

        System.out.print("\nAfter deletion: ");
        list.display();
    }
}