package Hashing;

import java.util.HashMap;

public class ZeroSumSubArray {
	
	private int function(int[] arr){
		int count = 0, sum = 0;
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int i=0;i<arr.length;i++){
			sum += arr[i];
			if(arr[i] == 0)
				count++;
			if(sum == 0 && arr[i] != 0)
				count++;
			Integer prev_i = hm.get(sum);
			if(prev_i != null ){
				count++;
			}else{
				if(sum != 0)
					hm.put(sum, i);
			}
		}
		return count;
	}
	
	public static void main(String[] args){
		int[] arr = new int[]{0,0,5,5,0,0};
		ZeroSumSubArray z = new ZeroSumSubArray();
		System.out.println(z.function(arr));
	}
	
}
