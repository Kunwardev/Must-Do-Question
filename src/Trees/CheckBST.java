package Trees;

public class CheckBST {
	
	private boolean function(TreeNode root, int min, int max){
		if(root == null)
			return true;
		if(root.data < min || root.data > max)
			return false;
		return (function(root.left, min, root.data-1) && (function(root.right, root.data+1, max)));
	}
	
	public static void main(String[] args){
		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(2);
		root.right = new TreeNode(5);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(3);
		CheckBST c = new CheckBST();
		System.out.println(c.function(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
	}
	
}
