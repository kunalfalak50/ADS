class Node2
{
	int data;
	Node next;
	
	Node2(int data){
		this.data = data;
		this.next = null;
	}
}
public class DeleteFirstNode {
    Node head;

    // Delete first node
    void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }
    //Display LinkedList
    void display() {
    	Node temp = head;
    	while(temp != null) {
    		System.out.print(temp.data + " " );
            temp = temp.next;
    	}
    	 
    }



	public static void main(String[] args) {
		
		  
			  DeleteFirstNode  list = new DeleteFirstNode ();

		        // Creating LinkedList: 10 → 20 → 30 → 40
		        list.head = new Node(10);
		        list.head.next = new Node(20);
		        list.head.next.next = new Node(30);
		        list.head.next.next.next = new Node(40);

		        System.out.print("\nBefore deletion: ");
		        list.display();

		        list.deleteFirst();

		        System.out.print("\nAfter deletion: ");
		        list.display();
	}

}
