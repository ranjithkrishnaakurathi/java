import java.util.*;
class NoOfDigits
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num value: ");
		int num = sc.nextInt();
		int count=0;
		
		while(num > 0){
			num=num/10;
			count++;
		}
		System.out.println("No of digits in a given number: "+count);
	}
}
