package LinkedList;

public class NthNodeFromLinkedList {
	
	private Node NthNode(Node head, int k){
		Node temp = head;
		for(int i=0;i<k;i++){
			temp = temp.next;
		}
		while(temp != null){
			temp = temp.next;
			head = head.next;
		}
		return head;
	}
	
	public static void main(String[] args){
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		NthNodeFromLinkedList n = new NthNodeFromLinkedList();
		System.out.println(n.NthNode(head, 2).data);
	}
	
	
}
