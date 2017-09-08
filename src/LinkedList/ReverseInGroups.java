package LinkedList;

public class ReverseInGroups {
	
	private Node reverse(Node head){
		Node prev = null, current = head, next;
		while(current != null){
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		return prev;
	}
	
	private Node reverseK(Node head, int k){
		Node prev = null, current = head, next = null;
		int count = k;
		while(current != null && k != 0){
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			k--;
		}
		if(next != null){
			head.next = reverseK(next, count);
		}
		return prev;
	}
	
	public static void main(String[] args){
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		ReverseInGroups r = new ReverseInGroups();
		head = r.reverseK(head,3);
		while(head != null){
			System.out.print(head.data+" ");
			head = head.next;
		}
	}
	
}
