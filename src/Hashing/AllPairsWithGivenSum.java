package Hashing;

import java.util.HashMap;

public class AllPairsWithGivenSum {
	
	private void function(int[] arr1, int[] arr2, int k){
		HashMap<Integer, Integer> hm1 = new HashMap<>();
		
		for(int p: arr1)
			hm1.put(p, 1);
		
		for(int i=0;i<arr2.length;i++){
			if(hm1.containsKey(k-arr2[i])){
				System.out.println((k - arr2[i])+"  "+arr2[i]);
			}
		}
	}
	
	public static void main(String[] args){
		int[] arr1 = new int[]{-1, -2, 4, -6, 5, 7};
		int[] arr2 = new int[]{6, 3, 4, 0};
		int k = 8;
		AllPairsWithGivenSum a = new AllPairsWithGivenSum();
		a.function(arr1, arr2, k);
	}
	
}
