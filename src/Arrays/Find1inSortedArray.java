package Arrays;

public class Find1inSortedArray {
	
	private void search(int[] arr, int low, int high){
		if(low > high)
            return;
        if(low == high)
        {
            System.out.println("The required element is "+arr[low]);
            return;
        }
        int mid = (low + high)/2;
        if(mid % 2 == 0)
        {
            if(arr[mid] == arr[mid+1])
                search(arr, mid+2, high);
            else
                search(arr, low, mid);
        }
        else if(mid % 2 == 1)
        {
            if(arr[mid] == arr[mid-1])
                search(arr, mid-2, high);
            else
                search(arr, low, mid-1);
        }
	}
	public static void main(String[] args){
		Find1inSortedArray f = new Find1inSortedArray();
		int[] arr = new int[]{1,1,2,2,3,4,4,5,5};
		f.search(arr, 0, arr.length-1);
	}
	
	
}
