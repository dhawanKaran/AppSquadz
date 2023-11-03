class Factorial
{
	public static void main(String... s)
	{
		System.out.print("Enter a number: ");
		int num = new java.util.Scanner(System.in).nextInt();
		int fac = 1;
		
		for(int i=num; i>=1; i--)
		{
			fac*=i;
		}
		System.out.println(fac);
	}
}