package LinkedList;

public class PairwiseSwapOfLinkedList {
	
	private Node pairwise(Node node){
		if(node == null || node.next == null)
			return node;
		
		Node prev = node;
		Node curr = node.next;
		node = curr;
		
		while(true){
			Node next = curr.next;
			curr.next = prev;
			if(next == null || next.next == null){
				prev.next = next;
				break;
			}
			prev.next = next.next;
			prev = next;
			curr = prev.next;
		}
		
		return node;
		
	}
	
	public static void main(String[] args){
		Node root = new Node(1);
		root.next = new Node(2);
		root.next.next = new Node(3);
		root.next.next.next = new Node(4);
		PairwiseSwapOfLinkedList p = new PairwiseSwapOfLinkedList();
		root = p.pairwise(root);
		while(root != null){
			System.out.print(root.data+" ");
			root = root.next;
		}
	}
	
}
