package Arrays;

public class ElementLeftSmallAndGreatRight {
	private void function(int[] arr){
		int[]leftMax = new int[arr.length];
		int[]rightMin = new int[arr.length];
		leftMax[0] = arr[0];
		for(int i=1;i<arr.length;i++){
			if(leftMax[i-1] > arr[i]){
				leftMax[i] = leftMax[i-1];
			}else
				leftMax[i] = arr[i];
		}
		
		rightMin[arr.length-1] = arr[arr.length-1];
		for(int j=arr.length-2;j>=0;j--){
			if(rightMin[j+1] < arr[j])
				rightMin[j] = rightMin[j+1];
			else
				rightMin[j] = arr[j];
		}
		for(int i=0;i<arr.length;i++){
			if(leftMax[i] == rightMin[i]){
				System.out.println(leftMax[i]);
				break;
			}
			if(i == arr.length-1)
				System.out.println(-1);
		}
	}
	
	public static void main(String[] args){
		ElementLeftSmallAndGreatRight e = new ElementLeftSmallAndGreatRight();
		int[] arr = new int[]{5,4,3,2,1,6};
		e.function(arr);
	}
	
}
