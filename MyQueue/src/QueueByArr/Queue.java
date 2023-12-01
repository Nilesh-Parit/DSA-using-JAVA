package QueueByArr;

public class Queue
{
	int rear;
	int front;
	int size;
	int[] arr = new int[5];

	public Queue()
	{
		this.rear = -1;
		this.front= 0;
		this.size=10;
	}
	public boolean isEmpty()
	{
		return  front>rear;
	}
	public boolean isFull()
	{
		return rear == size-1;
	}

	public void enqueue(int data) {
		if(isFull()) {
			System.out.println("Queue is full");
		}
		else {
			rear++;
			arr[rear] =data;
			System.out.println(" Element added ");
		}
	}
	public void dequeue() {
		if(isEmpty()) {
			System.out.println(" Queue is Empty");
		}
		else { 
			int data =arr[front];
			System.out.println( data+"Data is removed ");
			front++;
		}
	}
	public void display()
	{
		for(int i =front;i<=rear;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
