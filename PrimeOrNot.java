import java.util.*;
class PrimeOrNot
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num value: ");
		int num = sc.nextInt();
		int fc = 0;
		
		//To reduce the time complexity
		if (num % 2 == 0){
			System.out.println("Not a prime number");
		}
		else{
		for (int i = 2;i <= Math.sqrt(num);i++){
			if(num%i == 0){
				fc++;
				break;
			}
		}
		
		if (fc > 0){
			System.out.println("Not a prime number");
		}
		else{
			System.out.println("prime number");
			}	
		}
	}
}

