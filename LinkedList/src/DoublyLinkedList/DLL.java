package DoublyLinkedList;

public class DLL
{
	Node head;
	Node tail;
	static int size;
	class Node
	{
		int data;
		Node prev;
		Node next;
		
		public Node(int data)
		{
			this.data = data;
			this.prev = null;
			this.next = null;
		}
	}
	public void addFirst(int data)
	{
		Node newNode = new Node(data);
		
		if(head==null)
		{
			System.out.println("The List is Empty ..💔");
			head = newNode;
			tail =newNode;
			size++;
			System.out.println("New List is created..❤");
		}
		else
		{
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
			size++;
		}
	}
	public void addLast(int data)
	{
		Node newNode = new Node(data);
		
		if(head==null)
		{
			System.out.println("The List is Empty ..💔");
			head = newNode;
			tail =newNode;
			size++;
			System.out.println("New List is created..❤");
		}
		else
		{
			Node temp = head;
			while(temp.next!=null)
			{
				temp = temp.next;
			}
			temp.next = newNode;
			newNode.prev =temp;
			tail = newNode;
			size++;
		}
	}
	public void addAtPosition(int pos,int data)
	{
		Node newNode = new Node(data);
		
		if(head==null)
		{
			System.out.println("The List is Empty ..💔");
			head = newNode;
			tail =newNode;
			size++;
			System.out.println("New List is created..❤");
		}
		else if(pos == 1)
		{
			addFirst(data);
		}else if(pos >= size+1)
		{
			System.out.println(pos+" --> Invalid Position...☹");
		}
		else
		{
			int count = 1;
			Node temp = head;
			Node curr = head.next;
			while(count<pos-1)
			{
				temp = temp.next;
				curr = curr.next;
				count++;
			}
			temp.next = newNode;
			newNode.prev = temp;
			newNode.next = curr;
			curr.prev = newNode;
			size++;
		}
	}
	public void deleteAtFirst()
	{
		if(head==null)
		{
			System.out.println("The List is Empty ..💔");
		}else if(size == 1)
		{
			System.out.println("Element deleted succefully --> "+head.data );
			head = null;
			size--;
		}else
		{
			System.out.println("Element deleted succefully --> "+head.data );
			head = head.next;
			head.prev =null;
			size--;
		}
	}
	public void deleteAtLast()
	{
		if(head==null)
		{
			System.out.println("The List is Empty ..💔");
		}else if(size == 1)
		{
			System.out.println("Element deleted succefully --> "+head.data );
			head = null;
			size--;
		}else
		{
			Node temp = head;
			Node previous = temp.prev;
			while(temp.next!=null)
			{
				System.out.print(temp.data+" ");
				temp=temp.next;
				previous = temp.prev;
			}
			System.out.println("Element deleted succefully --> "+temp.data );
			previous.next = null;
			size--;
		}
	}
	public void deleteAtPosition(int pos)
	{
		if(head==null)
		{
			System.out.println("The List is Empty ..💔");
		}
		else if(pos == 1)
		{
			deleteAtFirst();
		}else if(pos == size)
		{
			deleteAtLast();
		}else if(pos == 0 || pos >= size+1)
		{
			System.out.println(pos+" --> Invalid Position...☹");
		}
		else
		{
			int count = 1;
			Node first = head;
			Node last = head.next.next;
			while(count<pos-1)
			{
				first = first.next;
				last = last.next;
				count++;
			}
			System.out.println("Element deleted succefully --> "+first.next.data+" From Position "+pos );
			first.next = last;
			last.prev = first;
			size--;
		}
	}
	public void deleteByValue(int data)
	{
		Node temp = head;
		int count = 1;
		while(temp.next!=null)
		{
			if(temp.data == data)
			{
				deleteAtPosition(count);
				break;
			}
			else
			{
				temp=temp.next;
				count++;
			}
		}
		if(count>=size+1)
		{
			System.out.println("Value Not Found");
		}
	}
	public void display()
	{
		Node temp = head;
		if(head==null)
		System.out.println("The List is Empty ..💔");
		else
		{
			while(temp!=null)
			{
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			System.out.println("null");
			System.out.println("Size is "+size);
		}
	}
}
