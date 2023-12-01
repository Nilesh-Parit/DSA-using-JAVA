package pac1;

public class TestCirular {

	public static void main(String[] args) {
		MyCircularQueue mcs=new MyCircularQueue();
		mcs.enqueue(5);
		mcs.enqueue(8);
		mcs.enqueue(10);
		mcs.enqueue(68);
		mcs.enqueue(57);
		mcs.enqueue(8);
		mcs.enqueue(10);
		mcs.enqueue(68);
		mcs.enqueue(57);
		mcs.enqueue(8);
		mcs.enqueue(10);
		mcs.enqueue(68);
		mcs.enqueue(57);
		mcs.dequeue();
		mcs.enqueue(100);
}
}