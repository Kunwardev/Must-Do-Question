package Trees;

import java.util.LinkedList;
import java.util.Queue;

class SpecialTreeNode{
	int data;
	SpecialTreeNode left, right, nextRight;
	
	public SpecialTreeNode(int data){
		this.data = data;
		this.left= null;
		this.right = null;
		this.nextRight = null;
	}
	
}

public class ConnectNodesAtSameLevel {
	
	private void function(SpecialTreeNode root){
		while(root != null){
			SpecialTreeNode q = root;
			while(q != null){
				if(q.left != null){
					if(q.right != null){
						q.left.nextRight = q.right;
					}else{
						q.left.nextRight = getRight(q);
					}
				}
				if(q.right != null){
					q.right.nextRight = getRight(q);
				}
				q = q.nextRight;
			}
			if(root.left != null)
				root = root.left;
			else if(root.right != null)
				root = root.right;
			else
				root = getRight(root);
		}		
	}
	
	private SpecialTreeNode getRight(SpecialTreeNode q){
		SpecialTreeNode temp = q;
		while(temp != null){
			if(temp.left != null)
				return temp.left;
			if(temp.right != null)
				return temp.right;
			temp = temp.nextRight;
		}
		return null;
	}
	
	public static void main(String[] args){
		ConnectNodesAtSameLevel c = new ConnectNodesAtSameLevel();
		SpecialTreeNode s = new SpecialTreeNode(1);
		s.left = new SpecialTreeNode(2);
		s.right = new SpecialTreeNode(3);
		s.left.left = new SpecialTreeNode(4);
		s.right.right = new SpecialTreeNode(5);
		c.function(s);
		System.out.println(s.left.nextRight);
		
	}
	
}
