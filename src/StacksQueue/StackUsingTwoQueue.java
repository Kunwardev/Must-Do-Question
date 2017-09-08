package StacksQueue;

import sun.misc.Queue;

public class StackUsingTwoQueue {
	
	Queue<Integer> q1 = new Queue<>();
	Queue<Integer> q2 = new Queue<>();
	
	private void push(int data) throws InterruptedException{
		q2.enqueue(data);
		while(!q1.isEmpty()){
			q2.enqueue(q1.dequeue());
		}
		Queue<Integer> q = q2;
		q2 = q1;
		q1 = q;
	}
	
	private int pop() throws InterruptedException{
		return q1.dequeue();
	}
	
	public static void main(String[] args) throws InterruptedException{
		StackUsingTwoQueue s = new StackUsingTwoQueue();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		System.out.println(s.pop());
	}
	
}
