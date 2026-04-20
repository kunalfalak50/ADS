package pgcp;

class Nodes{
    int data;
    Nodes next;

    Nodes(int data) {
        this.data = data;
        this.next = null;
    }
}

class ReverseLinkedList {
    Nodes head;

    void reverse() {
        Nodes prev = null;
        Nodes curr = head;
        Nodes next = null;

        while (curr != null) {
            next = curr.next;   // store next
            curr.next = prev;   // reverse link
            prev = curr;        // move prev
            curr = next;        // move curr
        }

        head = prev;
    }

    void printList() {
        if (head == null) {
            System.out.println("LinkedList: (empty)");
            return;
        }

        Nodes temp = head;
        System.out.print("LinkedList: ");
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) System.out.print(" → ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Testcase 1
    	ReverseLinkedList list1 = new ReverseLinkedList();
        list1.head = new Nodes(10);
        list1.head.next = new Nodes(20);
        list1.head.next.next = new Nodes(30);
        list1.head.next.next.next = new Nodes(40);

        list1.reverse();
        list1.printList();

        // Testcase 2
        ReverseLinkedList list2 = new ReverseLinkedList();
        list2.reverse();
        list2.printList();
    }
}