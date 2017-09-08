package Trees;

public class LeftViewOfTree {

	static int maxLevel = 0;
	private void function(TreeNode root, int level){
		if(root == null)
			return;
		if(level > maxLevel){
			System.out.print(root.data+" ");
			maxLevel = level;
		}
		function(root.left, level+1);
		function(root.right, level+1);
	}
	
	public static void main(String[] args){
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.right.right = new TreeNode(4);
		root.right.right.left = new TreeNode(5);
		LeftViewOfTree l = new LeftViewOfTree();
		l.function(root, 1);
	}
	
}
