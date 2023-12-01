package pac1;

public class TestQueue {

	public static void main(String[] args) {
		MyQueue ob=new MyQueue(5);
		ob.enqueue(25);
		ob.enqueue(35);
		ob.enqueue(45);
		System.out.println(ob);
		ob.enqueue(55);
		ob.dequeue();
		System.out.println(ob);
		ob.dequeue();
		ob.dequeue();
		ob.dequeue();
		System.out.println(ob);
		ob.dequeue();
	}
}