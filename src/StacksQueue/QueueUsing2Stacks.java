package StacksQueue;

import java.util.Stack;

public class QueueUsing2Stacks {
	
	Stack<Integer> st1 = new Stack<>();
	Stack<Integer> st2 = new Stack<>();
	
	private void push(int data){
		if(st1.isEmpty()){
			st2.push(data);
		}else{
			st1.push(data);
		}
	}
	
	private int pop(){
		if(st1.isEmpty()){
			while(!st2.isEmpty()){
				st1.push(st2.pop());
			}
			return st1.pop();
		}else if(st2.isEmpty()){
			while(!st1.isEmpty()){
				st2.push(st1.pop());
			}
			return st2.pop();
		}else{
			return -1;
		}
	}
	
	public static void main(String[] args){
		QueueUsing2Stacks q = new QueueUsing2Stacks();
		q.push(1);
		q.push(2);
		q.push(3);
		q.pop();
		System.out.println(q.st1);
		System.out.println(q.st2);
	}
	
}
