package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class SortAccordingToDifferentArray {
	private int[] function(int[]A1, int[]A2){
		HashMap<Integer, Integer> ha2 = new HashMap<>();
		//System.out.println(A1.length);
		for(int i=0;i<A1.length;i++){
			if(!ha2.containsKey(A1[i]))
				ha2.put(A1[i], 1);
			else
				ha2.put(A1[i], (ha2.get(A1[i])+1));
		}
		//System.out.print(ha2);
		int index = 0, counts = 0;
		int[] arr = new int[A1.length];
		for(int i=0;i<A2.length;i++){
			if(ha2.containsKey(A2[i])){
				int count = ha2.get(A2[i]);
				for(int k=0;k<count;k++){
					arr[index++] = A2[i];
				}
				ha2.remove(A2[i]);
			}
		}
//		for(int p:arr)
//			System.out.print(p+" ");
//		System.out.println(ha2);
		int flag = index;
		for(int i=0;i<A1.length;i++){
			if(ha2.containsKey(A1[i])){
				int count = ha2.get(A1[i]);
				for(int k=0;k<count;k++){
					arr[index++] = A1[i];
				}
				ha2.remove(A1[i]);
			}
		}
		Arrays.sort(arr, flag, index);
		return arr;
	}
	
	public static void main(String[] args){
		int[] A1 = new int[]{2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8, 7, 5, 6, 9, 7, 5};
		int[] A2 = new int[]{2,1,8,3};
		SortAccordingToDifferentArray s = new SortAccordingToDifferentArray();
		int[] arr = s.function(A1, A2);
		for(int j: arr){
			System.out.print(j+" ");
		}
	}
	
}
