package Trees;

public class IdenticalTrees {
	
	private boolean function(TreeNode r1, TreeNode r2){
		
		if(r1 == null && r2 == null)
			return true;
		if(r1.data != r2.data)
			return false;
		
		boolean checkLeft = function(r1.left, r2.left);
		boolean checkRight = function(r1.right, r2.right);
		
		return (checkLeft && checkRight);
	}
	
	public static void main(String[] args){
		
		IdenticalTrees i = new IdenticalTrees();
		TreeNode root1 = new TreeNode(3);
		root1.left = new TreeNode(6);
		root1.right = new TreeNode(8);
		root1.left.left = new TreeNode(2);
		root1.left.right = new TreeNode(11);
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(6);
		root.right = new TreeNode(8);
		root.left.left = new TreeNode(2);
		root.left.right = new TreeNode(11);
		System.out.println(i.function(root, root1));
	}
	
}
