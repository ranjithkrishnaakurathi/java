import java.util.*;
class SumOfDigits
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num value: ");
		int num = sc.nextInt();
		int sum = 0;
		
		while (num>0){
			int i=num%10;
			sum=sum+i;
			num/=10;
		}
		System.out.println("Sum of digits: "+sum);
	}
}

