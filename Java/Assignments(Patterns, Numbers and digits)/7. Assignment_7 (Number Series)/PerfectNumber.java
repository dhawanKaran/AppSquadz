class PerfectNumber
{
	public static void main(String... s)
	{
		System.out.print("Enter the number to check whether it is a perfect number or not? : ");
		int n = new java.util.Scanner(System.in).nextInt();
		
		int num = n;
		
		for(int i=1; i<=num; i++)
		{
			if(i