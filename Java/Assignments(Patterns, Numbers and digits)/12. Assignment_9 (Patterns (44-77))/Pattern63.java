/*
    1
   321
  54321
 7654321
987654321
*/
class Pattern63
{
	public static void main(String... s)
	{
		System.out.print("Enter the value of number of rows: ");
		int n = new java.util.Scanner(System.in).nextInt();
		
		for(int i=0; i<n; i++)
		{
			for(int j=i; j<n-1; j++)
			{
				System.out.print(" ");
			}
			
			for(int k=i+1; k>=1; k--)
			{
				System.out.print(k+i);
			}
			
			for(int l=i; l>=1; l--)
			{
				System.out.print(l);
			}
			System.out.println();
		}
	}
}