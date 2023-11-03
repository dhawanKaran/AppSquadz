/*
    *****
   *****
  *****
 *****
*****
*/
class Pattern18
{
	public static void main(String... s)
	{
		System.out.print("Enter the number of rows: ");
		int n = new java.util.Scanner(System.in).nextInt();
		
		for(int i=1; i<=n; i++)
		{
			for(int j=n-1; j>=i; j--)
			{
				System.out.print(" ");
			}
			
			for(int k=1; k<=5; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
