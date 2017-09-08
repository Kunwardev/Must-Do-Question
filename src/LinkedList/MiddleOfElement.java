package LinkedList;

public class MiddleOfElement {
	
	private Node function(Node head){
		Node temp = head;
		while(head != null && head.next != null){
			head = head.next.next;
			temp = temp.next;
		}
		return temp;
	}
	
	public static void main(String[] args){
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		MiddleOfElement m = new MiddleOfElement();
		System.out.println(m.function(head).data);
	}
	
}
