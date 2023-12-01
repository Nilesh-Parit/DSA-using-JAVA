class MCQ2
{
	public static void main(String[] args) {
		Recursion obj = new Recursion();
		System.out.println(obj.function(8));
	}
}

class Recursion
{
	int function(int n)
	{
		int result;
		if(n!=1)
			return n;
		result = function(n-1);
		return result;
	}
}
