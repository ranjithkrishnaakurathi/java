import java.util.*;
class FinalSumOfDigits
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num value: ");
		int num = sc.nextInt();
		
		int result = num%9 == 0 ? 9 : num%9;
		
		System.out.println("Final sum: "+result);
	}
}

