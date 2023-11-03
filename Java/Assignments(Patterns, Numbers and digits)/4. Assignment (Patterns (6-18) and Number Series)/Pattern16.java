/*
    *
   **
  ***
 ****
*****
*/

class Pattern16
{
	public static void main(String... s)
	{
		for(int i=4; i>=0; i--)
		{
			for(int j=i; j>=1; j--)
				System.out.print(" "); 
			
			for(int k=4;k>=i;k--)
				System.out.print("*");

			System.out.println();
		}
	}
}