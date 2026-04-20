package pgcp;

class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
		this.next = null;
	}
}
class LinkedList{
	Node head;
	
	void insertAtEnd(int data) {
		Node newNode =  new Node(data);
		
		//If list is empty
		if(head == null)
		{
			head =  newNode;
			return;
		}
		
		//Traverse to last Node
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		//Insert at end
		temp.next = newNode;
	}
	void display() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data);
			if (temp.next != null) {
                System.out.print(" → ");
            }
            temp = temp.next;
		}
	}
	
}

public class InsertElementEnd {

	public static void main(String[] args) {
		 LinkedList list = new LinkedList();

	        // Existing LinkedList: [5, 10, 15]
	        list.insertAtEnd(5);
	        list.insertAtEnd(10);
	        list.insertAtEnd(15);

	        // Elements to insert: [20, 25]
	        list.insertAtEnd(20);
	        list.insertAtEnd(25);

	        // Output
	        System.out.print("LinkedList: ");
	        list.display();

	}

}
