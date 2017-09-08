package LinkedList;

public class AddTwoLL {
	
	private Node add(Node h1, Node h2){
		int carry = 0;
		Node newHead = null;
		Node curr=null;
		while(h1!=null && h2!=null){
			int a = h1.data;
			int b = h2.data;
			int total = a+b+carry;
			if(total>=10){
				carry = 1;
				total = total-10;
			}
			if(newHead==null){
				newHead = new Node(total);
				curr = newHead;
			}else{
				Node n = new Node(total);
				curr.next = n;
				curr = curr.next;
			}
			h1=h1.next;
			h2=h2.next;
		}
		while(h1!=null){
			int x= h1.data + carry;
			Node n = new Node(x);
			curr.next = n;
			curr = curr.next;
			h1=h1.next;
			carry=0;
		}
		while(h2!=null){
			int x= h2.data + carry;
			Node n = new Node(x);
			curr.next = n;
			curr = curr.next;
			h2=h2.next;
			carry=0;
		}
		if(carry>0){
			Node n = new Node(1);
			curr.next = n;
			curr = curr.next;
		}
		return newHead;
	}
	
	public static void main(String[] args){
		Node one = new Node(5);
		one.next = new Node(4);
		Node two = new Node(5);
		two.next = new Node(4);
		two.next.next = new Node(3);
		AddTwoLL a = new AddTwoLL();
		one = a.add(one, two);
		while(one!=null){
			System.out.print(one.data+"-");
			one = one.next;
		}
		System.out.println("NULL");
	}
	
}
