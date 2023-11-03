/*
    1
   121
  12321
 1234321
123454321
*/
class Pattern69
{
	public static void main(String... s)
	{
		System.out.print("Enter the number of rows: ");
		int n = new java.util.Scanner(System.in).nextInt();
		
		for(int i=0; i<n; i++)
		{
			for(int j=i; j<n-1; j++)
			{
				System.out.print(" ");
			}
			
			for(int k=1; k<=i+1; k++)
			{
				System.out.print(k);
			}
			
			for(int l=i; l>=1; l--)
			{
				System.out.print(l);
			}
			System.out.println();
		}
	}
}