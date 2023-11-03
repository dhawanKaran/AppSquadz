class FibonacciSeries
{
	public static void main(String... s)
	{
		System.out.print("Enter the nth digit of number: ");
		int num = new java.util.Scanner(System.in).nextInt();
		int initial = 0, next = 1, sum=0;
		
		System.out.print(initial + "  " + next);
		
		for(int i=0; i<=num; i++)
		{
			sum = initial+next;
			System.out.print("  " + sum);
			initial = next;
			next = sum;
		}
	}
}
		
		