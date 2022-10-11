class ConstructorOverloading
{
	int age;
	String name;
	
	public static void main(String[] args)
	{
		ConstructorOverloading adr1 = new ConstructorOverloading(19,"Ranjith");
		System.out.println("age: "+adr1.age);
		System.out.println("name: "+adr1.name);
		
		ConstructorOverloading adr2 = new ConstructorOverloading(23);
		System.out.println("age: "+adr2.age);
		System.out.println("name: "+adr2.name);
	}
	ConstructorOverloading(int x,String y)
	{
		age = x;
		name = y;
	}
	
	ConstructorOverloading(int x)
	{
		age = x;
	}
}