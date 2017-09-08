package Hashing;

import java.util.HashMap;

public class SwapPairToMakeEqualSum {
	
	private void function(int[] arr1, int[]arr2){
		
		HashMap<Integer, Integer> hm = new HashMap<>();
		int sum1 =0, sum2 = 0, diff = 0, flag = 0;
		for(int p: arr1)
			sum1+=p;
		for(int q:arr2)
			sum2+=q;
		if(arr1.length > arr2.length){
			diff = (sum2 - sum1)/2;
			for(int i=0;i<arr2.length;i++){
				hm.put(arr2[i], i);
			}
			for(int j=0;j<arr1.length;j++){
				if(hm.containsKey(arr1[j]+diff)){
					flag = 1;
					System.out.println(arr1[j]+" "+(arr1[j]+diff));
					break;
				}
			}
		}else{
			diff = sum1 - sum2;
			for(int i=0;i<arr1.length;i++){
				hm.put(arr1[i], i);
			}
			for(int j=0;j<arr2.length;j++){
				if(hm.containsKey(arr2[j]+diff)){
					flag = 1;
					System.out.println(arr2[j]+" "+(arr2[j]+diff));
					break;
				}
			}
		}
		if(flag == 0)
			System.out.println("NO PAIR FOUND");
	}
	
	public static void main(String[] args){
		int[] arr1 = new int[]{ 4, 1, 2, 1, 1, 2 };
		int[] arr2 = new int[]{ 1, 6, 3, 3 };
		SwapPairToMakeEqualSum s = new SwapPairToMakeEqualSum();
		s.function(arr1, arr2);
	}
	
}
