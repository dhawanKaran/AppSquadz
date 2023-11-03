class PrintTable
{
	public static void main(String... s)
	{
		System.out.print("Enter a number for a arithmetic table: ");
		int num = new java.util.Scanner(System.in).nextInt();
		int mul;
		
		for(int i=1; i<=10; i++)
		{
			mul=num*i;
			System.out.println(num+"x"+i+"="+mul);
		}
	}
}