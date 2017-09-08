package LinkedList;

public class QueueUsingLinkedList {
	
	Node head = null, rear = null;
	
	private void push(int data){
		if(head == null && rear == null){
			rear = new Node(data);
			head = rear;
		}else{
			Node temp = new Node(data);
			rear.next = temp;
			rear = temp;
		}
	}
	
	private int pop(){
		int ret = 0;
		if(head == null){
			System.out.println("THE QUEUE IS EMPTY");
			return -1;
			}
		if(head == rear){
			ret = head.data;
			head = null;
			rear = null;
			return ret;
		}else{
			ret = head.data;
			head = head.next;
		}
		return ret;
	}
	
	private void printQueue(){
		Node q = head;
		if(q == null){
			System.out.println("[ ]");
			return ;
		}else{
			System.out.print("[ ");
			System.out.print(q.data);
			while(q != rear){
				q = q.next;
				System.out.print(" "+q.data);
			}System.out.println(" ]");
		}
	}
	
	public static void main(String[] args){
		QueueUsingLinkedList q = new QueueUsingLinkedList();
		q.push(1);
		q.push(2);
		q.push(4);
		q.push(3);
		//q.pop();q.pop();q.pop();q.pop();System.out.println(q.pop());
		q.printQueue();
	}
	
}
