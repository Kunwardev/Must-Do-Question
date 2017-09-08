package StacksQueue;

import java.util.Stack;

public class GetMinimumElement {
	
	Stack<Integer> st = new Stack<Integer>();
	int minElement;
	private void push(int data){
		if(st.isEmpty()){
			st.push(data);
			minElement = data;
		}else{
			if(minElement <= data){
				st.push(minElement);
			}else{
				st.push((2*data - minElement));
				minElement = data;
			}
		}
	}
	
	private int pop(){
		if(st.isEmpty()){
			return Integer.MIN_VALUE;
		}else{
			int x = st.pop();
			if(x <= minElement){
				minElement = 2 * minElement - x;
			}
			return x;
		}
	}
	
	public static void main(String[] args){
		GetMinimumElement g = new GetMinimumElement();
		g.push(3);
		g.push(5);
		g.push(2);
		System.out.println(g.pop());
		System.out.println(g.minElement);
	}
	
}

