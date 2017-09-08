package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SpiralOrderTraversal {
	
	private void Spiral(TreeNode root){
		int d = 0;
		Stack<TreeNode> s1 = new Stack<>();
		Stack<TreeNode> s2 = new Stack<>();
		s1.push(root);
		while(!s1.isEmpty() || !s2.isEmpty()){
			while(!s1.isEmpty()){
				TreeNode temp = s1.pop();
				System.out.print(temp.data+" ");
				if(temp.right != null)
					s2.push(temp.right);
				if(temp.left != null)
					s2.push(temp.left);
			}
			while(!s2.isEmpty()){
				TreeNode temp = s2.pop();
				System.out.print(temp.data+" ");
				if(temp.left != null)
					s1.push(temp.left);
				if(temp.right != null)
					s1.push(temp.right);
				}
			}
		}
		
		
		public static void main(String[] args){
			TreeNode root1 = new TreeNode(1);
			root1.left = new TreeNode(2);
			root1.right = new TreeNode(3);
			root1.right.right = new TreeNode(4);
			root1.right.left = new TreeNode(5);
			root1.left.right = new TreeNode(6);
			root1.left.left = new TreeNode(7);
			SpiralOrderTraversal s = new SpiralOrderTraversal();
			s.Spiral(root1);
		}
		
	}
	
