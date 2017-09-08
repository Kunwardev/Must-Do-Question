package Hashing;

import java.util.HashMap;

public class LongestConsecutiveSubSequ {

	private int function(int[] arr){
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int i: arr){
			hm.put(i, 1);
		}
		int maxLen = 0;
		for(int i=0;i<arr.length;i++){
			// If it's lower value occurs, don't go in the loop
			if(!hm.containsKey(arr[i]-1)){
				int j = arr[i];
				// Only count the higher values than that
				while(hm.containsKey(j)){
					j++;
				}
				if(maxLen < j-arr[i]){
					maxLen = j-arr[i];
				}
			}
		}
		return maxLen;
	}
	
	public static void main(String[] args){
		int[] arr = new int[]{1, 9, 3, 10, 4, 20, 2};
		LongestConsecutiveSubSequ l = new LongestConsecutiveSubSequ();
		System.out.println(l.function(arr));
	}
	
}
