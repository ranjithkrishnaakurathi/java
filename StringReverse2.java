import java.util.*;
class StringReverse2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String a = sc.next();
		
		StringBuilder sb = new StringBuilder(a);
		System.out.println("Reverse string: "+sb.reverse());
	}
}
		
		