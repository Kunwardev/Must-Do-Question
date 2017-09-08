package Hashing;

import java.util.HashMap;

public class LargestSubArrayWith0Sum {
	
	private int maxLen(int[] arr){
		HashMap<Integer, Integer> hm = new HashMap<>();
		int sum = 0, maxLen = 0;
		for(int i=0;i<arr.length;i++){
			sum += arr[i];
			if(arr[i] == 0 && maxLen == 0)
				maxLen = 1;
			if(sum == 0)
				maxLen = i+1;
			Integer prev_i = hm.get(sum);
			if(prev_i != null){
				maxLen = Math.max(maxLen, i - prev_i);
			}else
				hm.put(sum, i);
		}
		return maxLen;
	}

	public static void main(String[] args){
		int[] arr = new int[]{15,2,-2,-8,1,7,10,23};
		LargestSubArrayWith0Sum l = new LargestSubArrayWith0Sum();
		System.out.println(l.maxLen(arr));
	}
	
}
