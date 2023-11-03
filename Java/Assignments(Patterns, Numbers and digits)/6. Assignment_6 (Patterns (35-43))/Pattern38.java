/*
*****
 *   * 
  *   *
   *   *
    *****
*/
class Pattern38
{
	public static void main(String... s)
	{	
		//outer loop
        for(int i=1; i<=5; i++)
        {
            //inner loop for spacing
			for(int j=1; j<=i-1; j++)
			{
				System.out.print(" ");
			}
			
			//inner loop for printing the pattern 
			for(int k=1; k<=5; k++)
			{
				if(i==1 || i==5 || k==1 || k==5)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}		
}