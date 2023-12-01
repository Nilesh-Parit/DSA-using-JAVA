public class testLLstack
{
	public static void main(String[] args)
	{
		StackLinkedList n=new StackLinkedList();
		n.push(25);
		n.push(35);
		n.push(45);
		n.push(55);
		System.out.println(n.pop());
		System.out.println(n.pop());
	}
}
