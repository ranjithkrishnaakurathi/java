import java.util.*;
class Switch
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int a = sc.nextInt();
		System.out.println("Enter b value: ");
		int b = sc.nextInt();
		System.out.println("Enter option: ");
		String s = sc.next();
		
		switch(s){
			case "+":
				System.out.println("Addition: "+(a+b));
				break;
			case "-":
				System.out.println("Subtraction: "+(a-b));
				break;
			case "*":
				System.out.println("Multiplication: "+(a*b));
				break;
			case "/":
				System.out.println("Division: "+(a/b));
				break;
			case "%":
				System.out.println("Modulo: "+(a%b));
				break;
			default:
				System.out.println("Please enter valid option...");
				
		}
		
	}
}