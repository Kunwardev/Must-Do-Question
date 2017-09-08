package Arrays;

public class LongestSubarraywithElementSumatMostK {

	private static int function(int[] arr, int k){
		int length = 0, maxLength = 0;
		int sum = 0, j = 0;
		for(int i=0;i<arr.length;i++){
			if(sum + arr[i] <= k){
				sum += arr[i];
				length++;
			}else{
				sum -= arr[i-length];
				length--;
				if(sum + arr[i] <= k){
					sum += arr[i];
					length++;
				}
			}
			maxLength = Math.max(maxLength, length);
		}
		return maxLength;
	}
	
	
	public static void main(String[] args){
		int[] arr = new int[] {1, 2, 1, 0, 1, 1, 0};
		int k = 5;
		System.out.println(function(arr, k));
	}
	
}
