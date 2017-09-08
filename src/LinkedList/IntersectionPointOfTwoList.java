package LinkedList;

public class IntersectionPointOfTwoList {
	
	private int length(Node root){
		int count = 0;
		while(root != null){
			count++;
			root = root.next;
		}
		return count;
	}
	
	private Node findIntersection(Node a, Node b){
		int length_a = length(a);
		int length_b = length(b);
		int diff = Math.abs(length_a - length_b);
		if(length_a > length_b){
			for(int i=0;i<diff;i++){
				a = a.next;
			}
		}else{
			for(int i=0;i<diff;i++){
				b = b.next;
			}
		}
		while((a != b) && (a != null || b != null)){
			a = a.next;
			b = b.next;
		}
		
		return (a != null) ? a : null;
	}
	
	public static void main(String[] args){
		Node a = new Node(3);
		a.next = new Node(6);
		a.next.next = new Node(9);
		a.next.next.next = new Node(15);
		a.next.next.next.next = new Node(30);
		Node b = new Node(10);
		b.next = a.next.next.next;
		IntersectionPointOfTwoList i = new IntersectionPointOfTwoList();
		System.out.println(i.findIntersection(a, b).data);
	}
	
}
