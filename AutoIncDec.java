class AutoIncDec
{
	public static void main(String[] args)
	{
		int a = 100;
		
		System.out.println("Auto-increment");
		System.out.println("Given value: "+a);
		System.out.println("post-increment: "+(a++));
		System.out.println("pre-increment: "+(++a));
		System.out.println();
		
		int b = 50;
		
		System.out.println("Auto-decrement");
		System.out.println("Given value: "+b);
		System.out.println("post-decrement: "+(b--));
		System.out.println("pre-decrement: "+(--b));
		
	}
}
		