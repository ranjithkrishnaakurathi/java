class VarArgs
{	
	static int sum(int... x)
	{
		int sum = 0;
		for(int i = 0;i < x.length;i++)
		{
			sum = sum + x[i];
		}
		return sum;
	}
	public static void main(String[] args)
	{
		int result = sum(10,20);
		System.out.println(result);
		
		int result1 = sum(10,20,30);
		System.out.println(result1);
		
		int result2 = sum(10,20,30,40);
		System.out.println(result2);
	}
}

	
