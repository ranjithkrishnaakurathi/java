import java.util.*;
class TernaryOperator
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first value: ");
		int a = sc.nextInt();
		System.out.println("Enter second value: ");
		int b = sc.nextInt();
		System.out.println("Enter third value: ");
		int c = sc.nextInt();
		int res=(a>b) && (a>c)?a:(b>c)?b:c;
		System.out.println("Maxvalue: "+res);
	}
}