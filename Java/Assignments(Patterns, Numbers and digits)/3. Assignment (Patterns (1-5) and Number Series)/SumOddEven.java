class SumOddEven
{
	public static void main(String... s)
	{
		System.out.print("Enter the number: ");
		int num = new java.util.Scanner(System.in).nextInt();
		int even=0,odd=0;
		
		for(int i=1; i<=num; i++)
		{
			if(i%2==0)
			{
				even += i;
			}
			else
			{
				odd += i;
			}
		}
		System.out.println("The total of even integers: "+ even);
		System.out.println("The total of odd integers: "+ odd);
	}
}