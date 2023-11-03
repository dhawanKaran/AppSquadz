/*
    *
   * *
  *   *
 *     *
*********
*/
class Pattern7
{
	public static void main(String... s)
	{
		System.out.print("Enter the number of rows: ");
		int n = new java.util.Scanner(System.in).nextInt();
		int x = 1;
		for(int i=1; i<=n; i++)
		{
			for(int j=n-1; j>=i; j--)
			{
				System.out.print(" ");
			}
			
			for(int k=1; k<=x; k++)
			{
				if(i==n || k==1 || k==x)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			x+=2;
			System.out.println();
		}
	}
}
