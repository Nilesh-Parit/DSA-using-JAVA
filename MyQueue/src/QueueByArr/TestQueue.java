package QueueByArr;

public class TestQueue
{
	public static void main(String[] args)
	{
		Queue q = new Queue();
		q.isEmpty();
		q.enqueue(5);
		q.enqueue(10);
		q.display();
		q.dequeue();
		q.display();
		q.enqueue(15);
		q.enqueue(20);
		q.enqueue(25);
		q.enqueue(30);
		q.display();
		q.enqueue(35);
		q.enqueue(40);
		q.display();
		q.enqueue(45);
		q.enqueue(50);
		q.display();
		q.enqueue(55);
		q.enqueue(60);
	}
}
