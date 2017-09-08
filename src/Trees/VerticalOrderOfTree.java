package Trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class VerticalOrderOfTree {
	
	LinkedHashMap<Integer, ArrayList<Integer>> hm = new LinkedHashMap<>();
	
	private void makeVertical(TreeNode root, int d){
		
		if(root == null)
			return;
		
		if(hm.containsKey(d)){
			ArrayList<Integer> a = hm.get(d);
			a.add(root.data);
			hm.put(d, a);
		}else{
			ArrayList<Integer> a = new ArrayList<>();
			a.add(root.data);
			hm.put(d, a);
		}
		makeVertical(root.left, d-1);
		makeVertical(root.right, d+1);
	
	}
	
	private void printVertical(){
		Iterator it = hm.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry m = (Map.Entry) it.next();
			System.out.println(m.getValue());
			it.remove();
		}
	}
	
	public static void main(String[] args){
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.right.left = new TreeNode(5);
		VerticalOrderOfTree v = new VerticalOrderOfTree();
		v.makeVertical(root, 0);
		v.printVertical();
	}
	
}
