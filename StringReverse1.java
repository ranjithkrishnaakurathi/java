class StringReverse1
{
	public static void main(String[] args)
	{
		String name = "ABCDE";
		char[] nameArray = name.toCharArray();
		
		int start = 0;
		int end = nameArray.length-1;
		
		while(start <= end){
			char temp = nameArray[start];
			nameArray[start] = nameArray[end];
			nameArray[end] = temp;
			start++;
			end--;
		}
		
		for (char c : nameArray){
			System.out.print(c);
		}
	}
}

