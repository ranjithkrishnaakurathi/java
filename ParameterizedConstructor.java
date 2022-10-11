class ParameterizedConstructor
{
	int age;
	String name;
	static String nationality = "India";
	
	public static void main(String[] args)
	{
		ParameterizedConstructor adr1 = new ParameterizedConstructor(19,"Ranjith");
		System.out.println("age: "+adr1.age);
		System.out.println("name: "+adr1.name);
		System.out.println("nationality: "+ParameterizedConstructor.nationality);
		
		ParameterizedConstructor adr2 = new ParameterizedConstructor(23,"Krishna");
		System.out.println("age: "+adr2.age);
		System.out.println("name: "+adr2.name);
		System.out.println("nationality: "+ParameterizedConstructor.nationality);
	}
	ParameterizedConstructor(int x,String y)
	{
		age = x;
		name = y;
	}
}