package LinkedList;

class ListNode{
	int data;
	ListNode right;
	ListNode down;
	
	public ListNode(){
		
	}
	
}

public class LinkedListFrom2DMatrix {
	
	private ListNode function(int[][] mat, int i, int j){
		if(i > mat.length-1 || j > mat[0].length-1)
			return null;
		ListNode temp = new ListNode();
		temp.data = mat[i][j];
		temp.down = function(mat, i+1, j);
		temp.right = function(mat, i, j+1);
		return temp;
	}
	
	public static void main(String[] args){
		int[][] mat = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		LinkedListFrom2DMatrix l = new LinkedListFrom2DMatrix();
		ListNode head = l.function(mat, 0, 0);
		while(head != null){
			ListNode temp = head;
			while(temp != null){
				System.out.print(temp.data+" ");
				temp = temp.right;
			}
			System.out.println();
			head = head.down;
		}
	}
	
}
