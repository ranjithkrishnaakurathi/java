import java.util.*;
class While
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num value: ");
		int num = sc.nextInt();
		int sum=0;
		
		int i = 1;
		while(i <= num){
			sum=sum+i;
			i++;
		}
		System.out.println("sum of all numbers: "+sum);
	}
}