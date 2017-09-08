package Hashing;

import java.util.HashMap;

public class ArrayPairDivisiblity {
	
	private boolean function(int[] arr, int k){
		HashMap<Integer, Integer> hm = new HashMap<>();
		
		if(arr.length % 2 != 0)
			return false;
		
		for(int i=0;i<arr.length;i++){
			if(hm.containsKey(arr[i] % k )){
				hm.put(arr[i] % k, hm.get(arr[i] % k)+1);
			}else{
				hm.put(arr[i]%k, 1);
			}
		}
		
		for(int i=0;i<arr.length;i++){
			int rem = arr[i] % k;
			if(rem == 0){
				if(hm.get(rem)%2 != 0)
					return false;
			}else if((2 * rem) == k){
				if(hm.get(rem)% 2 != 0)
					return false;
			}else{
				if((hm.get(rem) != hm.get(k-rem)))
					return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args){
		ArrayPairDivisiblity a = new ArrayPairDivisiblity();
		int[] arr = new int[]{9, 7, 5, 3 };
		int k = 6;
		System.out.println(a.function(arr, k));
	}
	
}
