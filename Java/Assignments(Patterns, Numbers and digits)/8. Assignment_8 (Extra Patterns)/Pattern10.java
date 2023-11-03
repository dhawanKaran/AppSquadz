/*
1 2 3 4 5
 2 3 4 5
  3 4 5
   4 5
    5
   4 5
  3 4 5
 2 3 4 5
1 2 3 4 5
*/
class Pattern10
{
	public static void main(String... s)
	{
		System.out.print("Enter the number of rows: ");
		int n = new java.util.Scanner(System.in).nextInt();
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i-1; j++)
			{
				System.out.print(" ");
			}
			
			for(int k=i; k<=n; k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
		
		for(int i=n-1; i>=1; i--)
		{
			for(int j=1; j<=i-1; j++)
			{
				System.out.print(" ");
			}
			
			for(int k=i; k<=n; k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
}
