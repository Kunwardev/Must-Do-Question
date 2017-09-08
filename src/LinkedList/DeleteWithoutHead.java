package LinkedList;

public class DeleteWithoutHead {
	
	private void delete(Node pointer){
		Node temp = pointer.next;
		pointer.data = temp.data;
		pointer.next = temp.next;
	}
	
private void printList(Node head){
		
		while(head != null){
			System.out.print(head.data + " ");
			head = head.next;
		}
	}
	
public static void main(String[] args){
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		DeleteWithoutHead d = new DeleteWithoutHead();
		d.delete(head.next);
		d.printList(head);
		
	}
	
}
