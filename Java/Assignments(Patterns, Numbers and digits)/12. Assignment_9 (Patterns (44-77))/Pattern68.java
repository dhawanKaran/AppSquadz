/*
    1
   123
  12345
 1234567
123456789
*/	
class Pattern68
{
	public static void main(String... s)
	{
		System.out.print("Enter the number of rows: ");
		int n = new java.util.Scanner(System.in).nextInt();
		int x=1;
		for(int i=1; i<=n; i++)
		{
			for(int j=i; j<=n-1; j++)
			{
				System.out.print(" ");
			}
			
			for(int k=1; k<=x; k++)
			{
				System.out.print(k);
			}
			x+=2;
			System.out.println();
		}
	}
}