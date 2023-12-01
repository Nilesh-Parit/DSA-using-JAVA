package Tree;

public class BST
{
	Node root;
	class Node
	{
		Node left;
		Node right;
		int data;
		
		public Node(int data)
		{
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	public BST()
	{
		this.root=null;
	}
	
	public void addNode(int data)
	{
		Node newNode = new Node(data);
		if(root==null)
		{
			root = newNode;
		}
	}
	
	public void deleteNode()
	{
		
	}
	
	public void display(int choice)
	{
		
	}
}
