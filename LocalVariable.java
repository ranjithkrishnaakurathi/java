class LocalVariable
{	
	int sum(int b){
		int a =20;
		return a+b;
	}
	public static void main(String[] args)
	{
		LocalVariable obj = new LocalVariable();
		int b = 30;
		int result = obj.sum(b);
		System.out.println("Sum: "+result);
		
	}
}

	
