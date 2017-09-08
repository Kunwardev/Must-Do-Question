package LinkedList;

public class StackUSingLinkedList {
	
	Node top = null;
	
	private void push(int data){
		Node temp = new Node(data);
		if(top == null){
			top = temp;
		}else{
			temp.next = top;
			top = temp;
		}
	}
	
	private int pop(){
		int data = -1;
		if(top == null){
			System.out.println("THE STACK IS EMPTY");
			return -1;
		}else{
			data = top.data;
			top = top.next;
		}
		return data;
	}
	
	private void PrintList(){
		Node temp = top;
		System.out.print("[ ");
		while(temp != null){
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println(" ]");
	}
	
	public static void main(String[] args){
		StackUSingLinkedList s = new StackUSingLinkedList();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.pop();
		s.PrintList();
	}
	
}
