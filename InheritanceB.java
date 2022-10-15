package inheritance;

public class InheritanceB extends InheritanceA{
		int z = 300;
		
		void m3()
		{
			System.out.println("B class m3 method");
		}
		
		public static void main(String[] args)
		{
			InheritanceB obj = new InheritanceB();
			
			System.out.println(obj.z);
			System.out.println(obj.x);
			
			obj.m3();
			obj.m1();
	}
}

