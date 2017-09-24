package Heap;

public class HeapSort {
	
	private void heapify(int[] arr, int n, int i){
		int largest = i;
		int left = 2*i + 1;
		int right= 2*i + 2;
		if(left < n && arr[left] > arr[largest])
			largest = left;
		if(right <n && arr[right] > arr[largest])
			largest = right;
		if(largest != i){
			int swap = arr[largest];
			arr[largest] = arr[i];
			arr[i] = swap;
			heapify(arr, n, largest);
		}
	}
	
	private void heapSort(int[] arr){
		for(int i=arr.length/2-1;i>=0;i--)
			heapify(arr, arr.length,i);
		for(int i=arr.length-1;i>=0;i--){
			int swap = arr[i];
			arr[i] = arr[0];
			arr[0] = swap;
			heapify(arr, i, 0);
		}
	}
	
	public static void main(String[] args){
		int[] arr = new int[]{12,11,14,5,6,2};
		HeapSort h = new HeapSort();
		h.heapSort(arr);
		for(int p: arr)
			System.out.print(p+" ");
	}
	
}
