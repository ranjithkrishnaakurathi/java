import java.util.*;
class DoWhile
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num value: ");
		int num = sc.nextInt();
		int sum=0;
		
		int i = 1;
		do{
			sum=sum+i;
			i++;
		}while(i <= num);
		System.out.println("sum of all numbers: "+sum);
	}
}