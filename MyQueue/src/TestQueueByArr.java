
public class TestQueueByArr {

	public static void main(String[] args)
	{
		QueueByArr qba = new QueueByArr();
		
		qba.enqueue(15);
		qba.display();
		qba.enqueue(25);
		qba.display();
		qba.enqueue(35);
		qba.display();
		qba.enqueue(45);
		qba.display();
		qba.enqueue(55);
		qba.display();
		qba.enqueue(65);
		qba.display();
		qba.dequeue();
		qba.display();
		qba.dequeue();
		qba.display();
		qba.dequeue();
		qba.display();
		qba.dequeue();
		qba.display();
		qba.dequeue();
		qba.display();
	}
}
