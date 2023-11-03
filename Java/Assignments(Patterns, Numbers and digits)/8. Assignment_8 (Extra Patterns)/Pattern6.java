/*
* * * * *
 * * * *
  * * *
   * *
    *
   * *
  * * *
 * * * *
* * * * *
*/
class Pattern6
{
	public static void main(String... s)
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i-1; j++)
			{
				System.out.print(" ");
			}
			
			for(int k=5; k>=i; k--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		int n = 5;
		for(int i=2; i<=n; i++)
		{
			for(int j=i; j<=n-1; j++)
			{
				System.out.print(" ");
			}
			
			for(int k=1; k<=i; k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}