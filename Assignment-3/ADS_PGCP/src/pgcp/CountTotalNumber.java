package pgcp;

class Nodee {
    int data;
    Node next;

    Nodee(int data) {
        this.data = data;
        this.next = null;
    }
}

class CountTotalNumber{
    Node head;

    void countNodes() {
        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        System.out.println("Total nodes: " + count);
    }

    public static void main(String[] args) {
    	CountTotalNumber list = new CountTotalNumber();

        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);
        list.head.next.next.next = new Node(40);

        list.countNodes();
    }
}