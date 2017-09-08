package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
	
	private void Level(TreeNode root){
		Queue<TreeNode> q = new LinkedList<>();
		q.offer(root);
		while(!q.isEmpty()){
			TreeNode temp = q.poll();
			if(temp != null){
			System.out.print(temp.data+" ");
			q.offer(temp.left);
			q.offer(temp.right);}
		}
	}
	
	public static void main(String[] args){
		LevelOrderTraversal l = new LevelOrderTraversal();
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.right.right = new TreeNode(4);
		root.right.left = new TreeNode(5);
		root.left.right = new TreeNode(6);
		root.left.left = new TreeNode(7);
		l.Level(root);
	}
	
}
