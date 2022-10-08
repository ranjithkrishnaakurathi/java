import java.util.*;
class MissingDigit
{
	public static void main(String[] args)
	{	
		int[] a = {1,4,2,8,7,5,3,10,9};
		int x=0;
		int y=0;
		int res;
		
		for(int i = 1;i <= 10;i++)
		{
			x=x+i;
		}
		for(int i = 0;i < a.length;i++)
		{
			y=y+a[i];
		}
		res=x-y;
		System.out.println("MissingDigit is: "+res);	
			
		
	}
}

	
