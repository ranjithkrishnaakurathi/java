class BubbleSort
{
	public static void main(String[] args)
	{	
		int[] a = {5,2,3,7,6,1,9};
	
		for(int i = 0;i < a.length;i++)
		{
			for(int j = 1;j <a.length-i;j++)
			{
				if(a[j-1] >= a[j])
				{
					int temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
				}	
			}
		}
		for(int i : a)
		{
			System.out.print(i+" ");
		}
	}
}

	
