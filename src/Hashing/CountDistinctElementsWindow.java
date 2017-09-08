package Hashing;

import java.util.HashMap;

public class CountDistinctElementsWindow {
	
	private void function(int[] arr, int k){
		HashMap<Integer, Integer> hm = new HashMap<>();
		int dist_count = 0;
		for(int i=0;i<k;i++){
			if(hm.containsKey(arr[i])){
				hm.put(arr[i], hm.get(arr[i])+1);
			}else{
				hm.put(arr[i], 1);
			}
		}
		
		dist_count = hm.size();
		System.out.print(dist_count+" ");
		int j = 0;
		for(int i=k;i<arr.length;i++){
			if(hm.get(arr[j]) == 1){
				dist_count--;
				hm.remove(arr[j]);
			}else{
				hm.put(arr[j], hm.get(arr[j])-1);
			}
			j++;
			if(hm.containsKey(arr[i])){
				hm.put(arr[k], hm.get(arr[k])+1);
			}else{
				dist_count++;
				hm.put(arr[k], 1);
			}
			System.out.print(dist_count+" ");
		}
	}
	
	public static void main(String[] args){
		int[] arr = new int[]{1, 2, 1, 3, 4, 2, 3};
		CountDistinctElementsWindow c = new CountDistinctElementsWindow();
		c.function(arr, 4);
	}
	
}
