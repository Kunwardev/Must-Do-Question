package Hashing;

import java.util.LinkedHashMap; // Can also used HashMap

public class FirstElementToOccurKTimes {
	
	private int function(int[] arr, int k){
		LinkedHashMap<Integer, Integer> lm = new LinkedHashMap<>();
		for(int i: arr){
			if(!lm.containsKey(i))
				lm.put(i, 1);
			else
				lm.put(i, lm.get(i)+1);
		}
		for(int i:arr){
			if(lm.get(i) == k)
				return i;
		}
		return -1;
	}
	
	public static void main(String[] args){
		int[] arr = new int[]{1,7,4,3,4,8,7};
		FirstElementToOccurKTimes f = new FirstElementToOccurKTimes();
		System.out.println(f.function(arr, 2));
	}
	
	
}
