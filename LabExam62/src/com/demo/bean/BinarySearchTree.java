package com.demo.bean;

public class BinarySearchTree
{
	private Node root;
	
	class Node					
	{
		private int data;
		private Node left;
		private Node right;
		
		public Node(int data)	
		{
			this.data = data;
			this.left = null;
			this.left = null;
		}
	}
	public BinarySearchTree()
	{
		this.root = null;
	}
	
	public void insertNode(Node data)
	{
		root = data;
		System.out.println("New added succefully");
	}
	
	public void addNode(int data)		// Function to add a node at end;
	{
		Node newNode = new Node(data);
		
		if(root==null)
		{
			System.out.println("The Tree is empty");
			insertNode(newNode);
			System.out.println("New List has been made by adding First node");
		}
		else if(root.data<data)
		{
			insertNode(root.right);
		}
		else
		{
			insertNode(root.left);
		}
	}
}
