package Trees;

public class LowestCommonAncestor {
	
	private TreeNode result(TreeNode root,TreeNode r1, TreeNode r2){
		if(root == null)
			return null;
		if(root == r1 || root == r2)
			return root;
		TreeNode left = result(root.left, r1, r2);
		TreeNode right = result(root.right, r1, r2);
		if(left != null && right != null)
			return root;
		if(left == null && right == null)
			return null;
		return left != null ? left : right;
	}
	
	public static void main(String[] args){
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(6);
		root.right = new TreeNode(8);
		root.left.left = new TreeNode(2);
		root.left.right = new TreeNode(11);
		root.right.right = new TreeNode(13);
		root.right.right.left = new TreeNode(7);
		root.left.right.left = new TreeNode(9);
		root.left.right.right = new TreeNode(5);
		LowestCommonAncestor l = new LowestCommonAncestor();
		System.out.println(l.result(root, root.left.left, root.left.right.right).data);
	}
	
}
