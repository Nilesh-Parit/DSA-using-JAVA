package pac1;

import java.util.Arrays;

public class MyCircularQueue {
	private int[] arr;
	private int size;
	private int front;
	private int rear;
	
	public MyCircularQueue() {
		size=10;
		arr=new int[size];
		front=-1;
		rear=-1;
	}
	
	public MyCircularQueue(int s) {
		size = s;
		arr = new int[size];
		front=-1;
		rear=-1;
	}
	
	private boolean isFull() {
//		if(front==0 && rear==size-1) {
//			return true;
//		}
//		else 
		if((rear+1)%size==front) {
			return true;
		}
		return false;
	
	}
	
	private boolean isEmpty() {
		if(front==-1) {
			return true;
		}
		return false;
	}
	
	public void enqueue(int i) {
		if(!isFull()) {
			if(front==-1) {
				front=0;
			}
			rear=(rear+1)%size;
			System.out.println(i+" added in the queue at position "+rear);
			arr[rear]=i;
		}
		else {
			System.out.println("queue is full, cannot add");
		}
		
	}
	
	
	public int dequeue() {
		if(!isEmpty()) {
			int temp=arr[front];
			if(front==rear) {
				temp=arr[front];
				System.out.println("removed value from front end "+front+"---->"+temp);
				front=-1;
				rear=-1;
				return temp;
			}
			System.out.println("removed value from front end "+front+"---->"+temp);
			front=(front+1)%size;
			return temp;
		}
		else {
			System.out.println("Queue is Empty");
			return -1;
		}
		
	}

	@Override
	public String toString() {
		return Arrays.toString(arr)+" front :"+front+" rear: "+rear;
	}
	
	
	
}
