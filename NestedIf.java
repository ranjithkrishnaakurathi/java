import java.util.*;
class NestedIf
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1 value: ");
		int num1 = sc.nextInt();
		System.out.println("Enter num2 value: ");
		int num2 = sc.nextInt();
		System.out.println("Enter num3 value: ");
		int num3 = sc.nextInt();
		if (num1 > num2)
		{
			if (num1 > num3)
			{
				System.out.println(num1+" is a largest number");
			}
			else
			{
				System.out.println(num3+" is a largest number");
			}
		}
		else if (num2 > num3)
		{
			System.out.println(num2+" is a largest number");
		}	
		else
		{
			System.out.println(num3+" is a largest number");
		}
		
	}
}