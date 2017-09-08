package LinkedList;

public class ReverseLinkedList {
	private Node reverse(Node head){
		Node prev = null, current = head, nexts;
		while(current != null){
			nexts = current.next;
			current.next = prev;
			prev = current;
			current = nexts;
		}
		return prev;
	}
	
	public static void main(String[] args){
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head.printList(head);
		ReverseLinkedList r = new ReverseLinkedList();
		System.out.println();
		head = r.reverse(head);
		head.printList(head);
	}
	
}
