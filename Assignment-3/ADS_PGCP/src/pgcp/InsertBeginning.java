package pgcp;

class Node1 {
    int data;
    Node next;

    Node1(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList1 {
    Node head;

    // Insert at beginning
    void insertAtBeginning(int data) {
        Node newNode = new Node(data);

        newNode.next = head; // Step 1
        head = newNode;      // Step 2
    }

    // Display list
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null)
                System.out.print(" → ");
            temp = temp.next;
        }
    }
}

public class InsertBeginning {
    public static void main(String[] args) {
        LinkedList1 list = new LinkedList1();

        // Existing list: 10 → 20 → 30
        list.insertAtBeginning(30);
        list.insertAtBeginning(20);
        list.insertAtBeginning(10);

        // Insert 5 at beginning
        list.insertAtBeginning(5);

        System.out.print("LinkedList: ");
        list.display();
    }
}