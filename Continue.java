import java.util.*;
class Continue
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num value: ");
		int num = sc.nextInt();
		
		for(int i = 1;i <= num;i++){
			if(i == 6){
				continue;
			}
		System.out.println(i);
		}
	}
}

