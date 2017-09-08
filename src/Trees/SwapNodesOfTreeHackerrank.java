package Trees;

public class SwapNodesOfTreeHackerrank {
	
	int k = 2;
	
	private TreeNode swap(TreeNode root, int l){
		if(root != null){
			if(l == k){
				TreeNode temp = root.left;
				root.left = swap(root.right, ++l);
				root.right = temp;
				return root;
			}else{
				root.left = swap(root.left, ++l);
				root.right = swap(root.right, l);
				return root;
			}
		}
		return null;
	}
	
	private void inOrder(TreeNode root){
		if(root != null){
			inOrder(root.left);
			System.out.print(root.data+" ");
			inOrder(root.right);
		}
	}
	
	public static void main(String[] args){
		SwapNodesOfTreeHackerrank s = new SwapNodesOfTreeHackerrank();
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.right = new TreeNode(4);
		root.right.right = new TreeNode(5);
		s.inOrder(root);
		System.out.println("");
		root = s.swap(root, 1);
		s.inOrder(root);
	}
	
}
