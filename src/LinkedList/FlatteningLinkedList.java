package LinkedList;

class NewNode{
	int data;
	NewNode right, down;
	NewNode(int data){
		this.data = data;
		this.right = null;
		this.down = null;
	}
}

public class FlatteningLinkedList {
	
	NewNode head;
	private NewNode merge(NewNode a, NewNode b){
		if(a == null)
			return b;
		if(b == null)
			return a;
		NewNode result;
		
		if(a.data < b.data){
			result = a;
			result.down = merge(a.down, b);
		}else{
			result = b;
			result.down = merge(a, b.down);
		}
		return result;
	}
	
	private NewNode flatten(NewNode root){
		if(root == null || root.right == null)
			return root;
		root.right = flatten(root.right);
		root = merge(root, root.right);
		return root;
		
	}
	
	private NewNode push(NewNode head, int data){
		NewNode temp = new NewNode(data);
		temp.down = head;
		head = temp;
		return head;
	}
	
	public static void main(String[] args){
		FlatteningLinkedList f = new FlatteningLinkedList();
		f.head = f.push(f.head, 30);
		f.head = f.push(f.head, 8);
		f.head = f.push(f.head, 7);
		f.head = f.push(f.head, 5);
		
		f.head.right = f.push(f.head.right, 20);
		f.head.right = f.push(f.head.right, 10);
		
		f.head.right.right = f.push(f.head.right.right, 50);
		f.head.right.right = f.push(f.head.right.right, 22);
		f.head.right.right = f.push(f.head.right.right, 19);
		
		f.head.right.right.right = f.push(f.head.right.right.right, 45);
		f.head.right.right.right = f.push(f.head.right.right.right, 40);
		f.head.right.right.right = f.push(f.head.right.right.right, 35);
		f.head.right.right.right = f.push(f.head.right.right.right, 20);
		
		f.head = f.flatten(f.head);
		while(f.head != null){
			System.out.print(f.head.data+" ");
			f.head = f.head.down;
		}
	}
	
}
