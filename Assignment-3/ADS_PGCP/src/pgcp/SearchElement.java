package pgcp;

class Node2 {
    int data;
    Node next;

    Node2(int data) {
        this.data = data;
        this.next = null;
    }
}

class SearchElement {
    Node head;

    // Insert at end
    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Search element
    int search(int key) {
        Node temp = head;
        int index = 0;

        while (temp != null) {
            if (temp.data == key) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }

    public static void main(String[] args) {
    	SearchElement  list = new SearchElement ();

        // Creating LinkedList: 10 → 20 → 30 → 40
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        int result = list.search(30);

        if (result != -1)
            System.out.println("Element found at index " + result);
        else
            System.out.println("Element not found");
    }
}