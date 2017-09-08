package LinkedList;

public class PalindromeList {

	private Node reverse(Node a){
		Node current = a, prev = null, next;
		while(current != null){
			next = current.next;
			current.next = prev;
			prev = current;
			current = prev;
		}
		
		return prev;
		
	}
	
	private boolean function(Node a, int length){
		Node slow = a, fast = a, prev = null;
		while(fast != null && fast.next != null){
			prev = slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		if(length % 2 == 1){
			slow.next = reverse(slow.next);
		}else{
			prev.next = reverse(slow);
		}
		while(slow != null){
			if(a.data != slow.data)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args){
		PalindromeList p = new PalindromeList();
		Node a = new Node(1);
		a.next = new Node(2);
		a.next.next = new Node(1);
		a = p.reverse(a);
		while(a!=null){
			System.out.print(a.data+" ");
			a = a.next;
		}
	}
	
}
