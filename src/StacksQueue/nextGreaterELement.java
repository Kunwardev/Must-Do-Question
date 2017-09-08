package StacksQueue;

import java.util.Stack;

public class nextGreaterELement {
	
	private void function(int[] arr){
		Stack<Integer> st = new Stack<>();
		st.push(arr[0]);
		int next, element;
		for(int i=1;i<arr.length;i++){
			next = arr[i];
			if(!st.isEmpty()){
				element = st.pop();
				while(element < next){
					System.out.println(element+" "+next);
					if(st.isEmpty())
						break;
					element = st.pop();
				}
				if(element > next){
					st.push(element);
				}
			}
			st.push(next);
			//System.out.println(st);
		}
		next = -1;
		while(!st.isEmpty()){
			element = st.pop();
			System.out.println(element+" "+ -1);
		}
	}
	
	
	public static void main(String[] args){
		int[] arr = new int[]{11,13,21,3};
		nextGreaterELement n = new nextGreaterELement();
		n.function(arr);
	}
	
}
