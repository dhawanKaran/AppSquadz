class PrimeOrNot
{
	public static void main(String... s)
	{
		System.out.print("Enter a number: ");
		int num = new java.util.Scanner(System.in).nextInt();
		int count=0;
		
		
		for(int i=1; i<=num; i++)
		{
			if(num%i==0)
				count++;
		}
		
		if(count==2)
			System.out.println("It is a prime number.");
		else
			System.out.println("It is not a prime number.");
	}
}