/*
*********
 *     *
  *   *
   * *
    *
*/
class Pattern8
{
	public static void main(String... s)
	{
		System.out.print("Enter the number of rows: ");
		int n = new java.util.Scanner(System.in).nextInt();
		int x = n+n-1;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i-1; j++)
			{
				System.out.print(" ");
			}
			
			for(int k=x; k>=1; k--)
			{
				if(i==1 || k==1 || k==x)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			x-=2;
			System.out.println();
		}
	}
}
