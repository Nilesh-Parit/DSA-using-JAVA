package LinkedList;

public class SinglyLinkedList
{
	private Node head;
	class Node
	{
		private int data;
		private Node next;
		
		public Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	public SinglyLinkedList()
	{
		head = null;
	}
	public void addNodeAtEnd(int data)
	{
		Node newNode = new Node(data);
		if(head==null)
		{
			head = newNode;
		}
		else
		{
			Node temp = head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=newNode;
		}
	}
	public void addAtBegining(int data)
	{
		Node newNode = new Node(data);
		if(head==null)
		{
			head = newNode;
		}
		else
		{
			newNode.next=head;
			newNode = head;
		}
	}
	public void addByPosition(int pos,int data)
	{
		if(head==null)
		{
			System.out.println("The list is Empty 💔");
		}
		if(pos==1)
		{
			addAtBegining(data);
		}
		else
		{
			Node newNode = new Node(data);
			Node prev = head;
			int count = 1;
			while(prev.next!=null && count<pos)
			{
				prev = prev.next;
				count++;
			}
			if(prev!=null && count<pos)
			{
				Node temp = prev.next;
				prev.next = newNode;
				newNode.next = temp;
			}else
				System.out.println("Invalid Position");
		}
	}
	public void deleteAtStart()
	{
		if(head==null)
		{
			System.out.println("The list is Empty 💔");
		}else
		{
			System.out.println("Head element "+head.data+" deleted from start");
			head = head.next;
		}	
	}
	public void deleteAtEnd()
	{
		if(head==null)
		{
			System.out.println("The list is Empty 💔");
		}else
		{
			Node prev = head;
			Node temp = null;
			while(prev.next!=null)
			{
				temp = prev;
				prev = prev.next;
			}
			System.out.println("End element "+prev.data+" deleted from End");
			temp.next=null;
		}
	}
	public void displayAll()
	{
		Node temp = head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
}
