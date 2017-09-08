package Trees;

class Answer{
	int val;
}

public class DiameterOfTree {
	
	private int function(TreeNode root, Answer ans){
		if(root == null)
			return 0;
		int lheight = function(root.left, ans);
		int rheight = function(root.right, ans);
		ans.val = Math.max(ans.val, 1+lheight+rheight);
		return (1+Math.max(lheight, rheight));
	}
	
	public static void main(String[] args){
		Answer ans = new Answer();
		ans.val = Integer.MIN_VALUE;
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		DiameterOfTree d = new DiameterOfTree();
		d.function(root, ans);
		System.out.println(ans.val);
		
	}
	
}
