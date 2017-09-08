package LinkedList;

public class Rotate_LinkedList {
	
	private Node rotate(Node head, int k){
		Node temp = head;
		while(temp.next != null){
			temp = temp.next;
		}
		temp.next = head;
		Node prev = null;
		for(int j=0;j<k;j++){
			prev = head;
			head = head.next;
		}
		prev.next = null;
		return head;
	}
	
	public static void main(String[] args){
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = new Node(6);
		head.next.next.next.next.next.next = new Node(7);
		head.next.next.next.next.next.next.next = new Node(8);
		Rotate_LinkedList r = new Rotate_LinkedList();
		head = r.rotate(head, 4);
		head.printList(head);
		
	}

}
