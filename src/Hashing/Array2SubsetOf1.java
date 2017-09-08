package Hashing;

import java.util.HashMap;

public class Array2SubsetOf1 {

	private boolean function(int[] arr1, int[] arr2){
		
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int i=0;i<arr1.length;i++){
			hm.put(arr1[i], 1);
		}
		for(int j=0;j<arr2.length;j++){
			if(!hm.containsKey(arr2[j]))
				return false;
		}
		return true;
	}
	
	public static void main(String[] args){
		Array2SubsetOf1 a = new Array2SubsetOf1();
		int[] arr1 = new int[]{11, 1, 13, 21, 3, 7};
		int[] arr2 = new int[]{11, 3, 7, 1};
		System.out.println(a.function(arr1, arr2));
	}
	
}
