/*
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
*/
class Pattern1
{
	public static void main(String... s)
	{
		int x=1;
		//outer loop for first phase.
		for(int i=1; i<=5; i++)
		{
			
			//inner loop for first phase's spacing
			for(int j=4; j>=i; j--)
			{
				System.out.print(" ");
			}
			
			for(int k=1; k<=x; k++)
			{
				System.out.print("*");
			}
			x+=2;
			System.out.println();
		}
		x-=2;
		//outer loop for second phase.
		for(int i=1; i<=5; i++)
		{
			x-=2;
			//inner loop for first phase's spacing
			for(int j=1; j<=i; j++)
			{
				System.out.print(" ");
			}
			
			for(int k=x; k>=1; k--)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
			