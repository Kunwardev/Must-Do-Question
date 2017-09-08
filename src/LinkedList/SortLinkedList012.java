package LinkedList;

public class SortLinkedList012 {
	
	private Node sort(Node head){
		int count_0 = 0, count_1 = 0, count_2 = 0;
		Node sort = null;
		while(head != null){
			if(head.data == 0)
				count_0++;
			else if(head.data == 1)
				count_1++;
			else
				count_2++;
			head = head.next;
		}
		for(int i=0;i<count_2;i++){
			Node temp = new Node(2);
			if(sort == null){
				sort = temp;
			}else{
				temp.next = sort;
				sort = temp;
			}
		}
		for(int i=0;i<count_1;i++){
			Node temp = new Node(1);
			if(sort == null){
				sort = temp;
			}else{
				temp.next = sort;
				sort = temp;
			}
		}
		for(int i=0;i<count_0;i++){
			Node temp = new Node(0);
			if(sort == null){
				sort = temp;
			}else{
				temp.next = sort;
				sort = temp;
			}
		}
			return sort;
	}
	
	private void printList(Node head){
		
		while(head != null){
			System.out.print(head.data + " ");
			head = head.next;
		}
	}
	
	public static void main(String[] ar){
		Node head = new Node(1);
		head.next = new Node(0);
		head.next.next = new Node(2);
		head.next.next.next = new Node(0);
		SortLinkedList012 s = new SortLinkedList012();
		//s.printList(head);
		head = s.sort(head);
		s.printList(head);
	}
	
}
