/*
*
 ** 
  ***
   ****
    *****
*/
class Pattern37
{
	public static void main(String... s)
	{
		//outer loop
		for(int i=5; i>=1; i--)
		{
			//inner loop for spacing
			for(int j=4; j>=i; j--)
			{
				System.out.print(" ");
			}
			
			//inner loop for printing star(*)
			for(int k=i; k<=5; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}