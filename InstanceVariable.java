class InstanceVariable
{	
	int c = 5;
	int sum(int a){
		return a+c;
	}
	int multiply(int a){
		return a*c;
	}
	public static void main(String[] args)
	{
		InstanceVariable obj = new InstanceVariable();
		int a = 20;
		int result = obj.sum(a);
		System.out.println("Sum: "+result);
		int result1 = obj.multiply(a);
		System.out.println("multiply: "+result1);
		
	}
}

	
