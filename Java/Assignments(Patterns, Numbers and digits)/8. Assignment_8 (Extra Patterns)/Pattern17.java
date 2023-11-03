/*
   *      *
  ***    ***
 *****  *****
**************

   *--- ---*
  ***-- --***
 *****- -*****
******* *******
*/
class Pattern17
{
	public static void main(String... s)
	{
		System.out.print("Enter a number of rows: ");
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
				System.out.print("*");
			}
			
			for(int l=n-1; l>=i; l--)
			{
				System.out.print(" ");
			}
			
			for(int m=n-1; m>=i; m--)
			{
				System.out.print(" ");
			}
			
			for(int p=1; p<=x; p++)
			{
				System.out.print("*");
			}
			x+=2;
			System.out.println();
		}
	}
}