package DoublyLinkedList;

public class TestDLL
{
	public static void main(String[] args)
	{
		DLL dll = new DLL();
		
		dll.addFirst(15);
		dll.addFirst(25);
		dll.addFirst(35);
		dll.addFirst(45);
		dll.display();
		dll.addLast(55);
		dll.addLast(65);
		dll.addLast(75);
		dll.display();
		dll.addAtPosition(1, 50);
		dll.display();
		dll.addAtPosition(3, 60);
		dll.display();
		dll.addAtPosition(10, 70);
		dll.display();
//		dll.deleteAtFirst();
//		dll.display();
//		dll.deleteAtFirst();
//		dll.display();
//		dll.deleteAtFirst();
//		dll.display();
//		dll.deleteAtLast();
//		dll.display();
		dll.deleteAtPosition(3);
		dll.display();
		dll.deleteAtPosition(4);
		dll.display();
		dll.deleteAtPosition(5);
		dll.display();
		dll.deleteAtPosition(10);
		dll.display();
		dll.deleteAtPosition(6);
		dll.display();
		dll.addAtPosition(5, 100);
		dll.display();
		dll.deleteByValue(100);
		dll.display();
	}

}
