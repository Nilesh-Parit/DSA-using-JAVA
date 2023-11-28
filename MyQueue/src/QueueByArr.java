
public class QueueByArr
{
	private int[] arr;
	private int front;
	private int rear;
	private int size;
	
	public QueueByArr()
	{
		this.arr = new int[5];
		this.front = -1;
		this.rear = -1;
		this.size = 0;
	}
	
	public boolean isEmpty()
	{
		if(front==-1 && rear==-1)
			return true;
		else
			return false;
	}
	
	public boolean isFull()
	{
		if(front==0 && rear==arr.length-1)
			return true;
		else
			return false;
	}
	public void enqueue(int data)
	{
		if(isEmpty())
		{
			front++;
			arr[size]=data;
			rear++;
			size++;
		}
		else if(isFull())
		{
			System.out.println("The Element "+data+" Cannot be added - Queue is full");
		}
		else
		{
			arr[size]=data;
			rear++;
			size++;
		}
	}
	public void dequeue()
	{
		if(isEmpty())
		{
			System.out.println("The Queue is Empty");
		}
		else
		{
			System.out.println("Element ["+arr[front]+"] removed succeffully");
			front++;
			size--;
		}
		if(size==0)
		{
			front=-1;
			rear=-1;
		}
	}
	public void display()
	{
		if(isEmpty())
		{
			System.out.println("The Queue is Empty");
		}
		else
		{
			for(int i=front;i<=rear;i++)
			{
				System.out.print(arr[i]+" ");
			}
			System.out.println(" <----- Size is "+size);
			if(isFull())
			{
				System.out.println("The Queue is now full");
			}
		}
	}
}
