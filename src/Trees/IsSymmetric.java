package Trees;

public class IsSymmetric {
	
	private boolean check(TreeNode root){
		return function(root, root);
	}

	private boolean function(TreeNode root1, TreeNode root2) {
		if(root1 == null && root2 == null)
			return true;
		if(root1 != null && root2 != null && root1.data == root2.data){
			return (function(root1.left, root2.right) && function(root1.right, root2.left));
		}
		return false;
	}
	
	public static void main(String[] args){
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(2);
		root.left.left = new TreeNode(3);
		root.right.right = new TreeNode(3);
		IsSymmetric i = new IsSymmetric();
		System.out.println(i.check(root));
	}
	
}
