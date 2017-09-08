package Arrays;

public class ZigZagFashion {
	private void zigzag(int[] arr){
		boolean flag = true;
		for(int i=0;i<arr.length-1;i++){
			if(flag){
				if(arr[i] > arr[i+1]){
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}else{
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}flag = !flag;
		}
	}
	
	public static void main(String[] args){
		int[] arr = new int[] {4, 3, 7, 8, 6, 2, 1};
		ZigZagFashion z = new ZigZagFashion();
		z.zigzag(arr);
		for(int j:arr){
			System.out.print(j+", ");
		}
	}
	
}
