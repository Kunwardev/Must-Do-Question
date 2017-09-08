package LinkedList;

public class AddTwoLLRecursive {
	
	private Node addR(Node h1, Node h2, int carry){
		if(h1 != null && h2 != null){
			int sum = (h1.data + h2.data + carry);
			carry = sum / 10;
			System.out.println(sum+" "+carry);
			Node h3 = new Node(sum%10);
			h3.next = addR(h1.next, h2.next, carry);
			return h3;
		}else if(h1 == null && h2 != null){
			int sum = (h2.data + carry);
			carry = sum / 10;
			Node h3 = new Node(sum%10);
			h3.next = addR(h1, h2.next, carry);
			return h3;
		}else if(h1 != null && h2 == null){
			int sum = (h1.data + carry);
			carry = sum / 10;
			Node h3 = new Node(sum%10);
			h3.next = addR(h1.next, h2, carry);
			return h3;
		}else{
			if(carry == 0)
				return null;
			else
				return new Node(1);
		}
	}
	
	public static void main(String[] args){
		
		Node h1 = new Node(3);
		h1.next = new Node(1);
		h1.next.next = new Node(2);
		Node h2 = new Node(5);
		h2.next = new Node(9);
		h2.next.next = new Node(9);
		AddTwoLLRecursive a = new AddTwoLLRecursive();
		Node h3 = a.addR(h1, h2, 0);
		while(h3 != null){
			System.out.print(h3.data+" ");
			h3 = h3.next;
		}
	}
	
}
