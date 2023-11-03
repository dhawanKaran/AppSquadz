/*
    *
   - -
  * * *
 - - - -
* * * * *
 - - - -
  * * *
   - -
    *
*/
class Pattern14
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
			
			for(int k=1; k<=i; k++)
			{
				if(i%2!=0)
					System.out.print("* ");
				else
					System.out.print("- ");
			}
			System.out.println();
		}
		
		for(int i=1; i<=n-1; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(" ");
			}
			
			for(int k=n-1; k>=i; k--)
			{
				if((n-1)%2!=0 && i%2!=0)
					System.out.print("* ");
				else if((n-1)%2==0 && i%2==0)
					System.out.print("* ");
				else
					System.out.print("- ");
			}
			System.out.println();
		}
	}
}