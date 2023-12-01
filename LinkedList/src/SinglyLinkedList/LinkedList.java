package SinglyLinkedList;

public class LinkedList
{
	private Node head;
	class Node
	{
		int data;
		Node next;
		
		Node(int d)
		{
			data= d;
			next =null;
		}
		
	}
		public LinkedList()
		{
			head = null; 
	       }
		
		public void addAtEnd(int value)
		{
			Node newnode = new Node(value);
			if(head==null) {
				head = newnode;
				
			}
			
			else {
				Node temp= head;
				while(temp.next!=null) {
					temp= temp.next;
					
				}
				temp.next= newnode;
			}
			
		
		}
		
		
		public void addByPosition(int value,int position) {
			Node newnode = new Node(value);
			
			if(head==null) {
				System.out.println("list is empty");
			}
			
			if(position == 1) {
				if(head==null) {
					head = newnode;
				}
				else {
					newnode.next=head;
					head= newnode;
				}
			}
			
			else {
				
				Node prev= head;
				for(int i =1;prev!=null && i<=position-2;i++) {
					prev = prev.next;
				}
				if(prev!=null) {
		    		   newnode.next=prev.next;
		    		   prev.next=newnode;
		    		}
		    		else 
					{
		    			System.out.println("position is wrong");
		    		}
			}
		}
		
		 public void displaydata()
		 {
		    	Node temp=head;
		    	while(temp!=null)
		    	{
		    		System.out.println(temp.data);
		    		temp=temp.next;
		    	}
		 } 	
}
