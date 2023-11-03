class Power
{
	public static void main(String... s)
	{
		System.out.print("Enter a number: ");
		int num = new java.util.Scanner(System.in).nextInt();
		System.out.print("Enter a power number: ");
		int pow = new java.util.Scanner(System.in).nextInt();
		int res = 1;
		
		for(int i=1; i<=pow; i++)
		{
			res*=num;
		}
		System.out.println(res);
	}
}