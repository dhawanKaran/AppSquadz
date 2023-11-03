/*
*
** 
***
****
*****
*/
class Pattern36
{
	public static void main(String... s)
	{
		// outer loop
		for(int i=1; i<=5; i++)
		{
			//inner loop
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}