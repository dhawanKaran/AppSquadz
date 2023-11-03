/*
    0
   101
  21012
 3210123
432101234
*/
class Pattern71
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
			
			for(int k=i; k>=0; k--)
			{
				System.out.print(k);
			}
			
			for(int l=1; l<i+1; l++)
			{
				System.out.print(l);
			}
			System.out.println();
		}
	}
}
			