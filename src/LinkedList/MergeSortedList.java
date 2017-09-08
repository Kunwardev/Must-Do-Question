package LinkedList;

public class MergeSortedList {
	private Node Merge(Node a, Node b){
		if(a == null)
			return b;
		if(b == null)
			return a;
		Node temp;
		if(a.data > b.data){
			temp = b;
			temp.next = Merge(a, b.next);
		}else{
			temp = a;
			temp.next = Merge(a.next, b);
		}
		return temp;
	}
	
	public static void main(String[] args){
		Node a = new Node(1);
		Node b = new Node(2);
		a.next = new Node(3);
		b.next = new Node(4);
		a.next.next = new Node(5);
		b.next.next = new Node(6);
		MergeSortedList m = new MergeSortedList();
		a = m.Merge(a, b);
		while(a != null){
			System.out.print(a.data+" ");
			a = a.next;
		}
	}
	
}
