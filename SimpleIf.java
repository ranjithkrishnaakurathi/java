import java.util.*;
class SimpleIf
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age : ");
		int age = sc.nextInt();
		
		if (age > 18)
		{
			System.out.println("Candidate is eligible for vote...");
		}
		System.out.println("Thank you for visiting...");
	}
}
