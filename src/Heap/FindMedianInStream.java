package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class FindMedianInStream {
	
	private void function(int[] arr){
		PriorityQueue<Integer> lower = new PriorityQueue<>(Collections.reverseOrder());
		PriorityQueue<Integer> upper = new PriorityQueue<>();
		for(int i=0;i<arr.length;i++){
			int number = arr[i];
			addNumber(number, lower, upper);
			reBalance(lower, upper);
			System.out.println("The Median of the stream after Entry "+(i+1)+": "+getMedian(lower, upper));
		}
	}

	private double getMedian(PriorityQueue<Integer> lower, PriorityQueue<Integer> upper) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> BigHeap = (upper.size() > lower.size()) ? upper : lower;
		PriorityQueue<Integer> SmallHeap = (upper.size() > lower.size()) ? lower : upper;
		if(BigHeap.size() == SmallHeap.size()){
			return (double)((BigHeap.peek()+SmallHeap.peek())/2);
		}else
			return (double)BigHeap.peek();
	}

	private void reBalance(PriorityQueue<Integer> lower, PriorityQueue<Integer> upper) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> BigHeap = (upper.size() > lower.size()) ? upper : lower;
		PriorityQueue<Integer> SmallHeap = (upper.size() > lower.size()) ? lower : upper;
		if(BigHeap.size()-SmallHeap.size() >= 2)
			SmallHeap.add(BigHeap.poll());
	}

	private void addNumber(int number, PriorityQueue<Integer> lower, PriorityQueue<Integer> upper) {
		// TODO Auto-generated method stub
		if(lower.isEmpty() || number > lower.peek())
			lower.add(number);
		else
			upper.add(number);
	}
	
	public static void main(String[] args){
		FindMedianInStream f = new FindMedianInStream();
		int[] arr = new int[]{5,15,1,3};
		f.function(arr);
	}
	
}
