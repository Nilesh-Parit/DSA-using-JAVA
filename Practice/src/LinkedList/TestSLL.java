package LinkedList;

public class TestSLL
{
	public static void main(String[] args)
	{
		SinglyLinkedList sll = new SinglyLinkedList();
		
		sll.addAtBegining(15);
		sll.addAtBegining(25);
		sll.addAtBegining(35);
		sll.addAtBegining(45);
		sll.addNodeAtEnd(55);
		sll.addNodeAtEnd(65);
		sll.addNodeAtEnd(75);
		sll.addNodeAtEnd(85);
		sll.displayAll();
		sll.deleteAtStart();
		sll.displayAll();
		sll.deleteAtEnd();
		sll.displayAll();
	}
}
