class StaticVariable
{	
	int id;
	String name;
	static String dept="ECE";
	public static void main(String[] args)
	{	
		StaticVariable obj = new StaticVariable();
		obj.id=101;
		obj.name="Ranjith";
		System.out.println("-------------------------");
		System.out.println("Student1 details: ");
		System.out.println("id: "+obj.id);
		System.out.println("name: "+obj.name);
		System.out.println("dept: "+StaticVariable.dept);
		
		StaticVariable obj1 = new StaticVariable();
		obj1.id=201;
		obj1.name="Krishna";
		System.out.println("-------------------------");
		System.out.println("Student2 details: ");
		System.out.println("id: "+obj1.id);
		System.out.println("name: "+obj1.name);
		System.out.println("dept: "+StaticVariable.dept);
		
		StaticVariable.dept="CSE";
		
		System.out.println("After Update: ");
		
		System.out.println("-------------------------");
		System.out.println("Student1 details: ");
		System.out.println("id: "+obj.id);
		System.out.println("name: "+obj.name);
		System.out.println("dept: "+StaticVariable.dept);
		
		System.out.println("-------------------------");
		System.out.println("Student2 details: ");
		System.out.println("id: "+obj1.id);
		System.out.println("name: "+obj1.name);
		System.out.println("dept: "+StaticVariable.dept);
		
	}
}

	
