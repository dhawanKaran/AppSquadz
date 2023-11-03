/*
    *  
   * * 
  * * *
 * * * *
* * * * *
*/
class Pattern35
{
	public static void main(String... s)
	{
		int x = 5;
		
		//outer loop
		for(int i=1; i<=5; i++)
		{
			//inner loop for spacing
			for(int j=4; j>=i; j--)
			{
				System.out.print(" ");
			}
			
			//inner loop for printing star(*)
			for(int k=x; k<=5; k++)
			{
				System.out.print("* ");
			}
			x--;
			System.out.println();
		}
	}
}