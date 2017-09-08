package Hashing;

import java.util.HashMap;

public class CheckIfTwoArraysareEqua {

	private boolean function(int[] arr1, int[] arr2){
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int p: arr1){
			hm.put(p, 1);
		}
		for(int q: arr2){
			if(!hm.containsKey(q))
				return false;
		}
		return true;
	}
	
	public static void main(String[] args){
		int[] arr1 = new int[]{1,2,5,4,6};
		int[] arr2 = new int[]{4,2,1,6,8};
		CheckIfTwoArraysareEqua c = new CheckIfTwoArraysareEqua();
		System.out.println(c.function(arr1, arr2));
	}
	
}
