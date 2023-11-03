/*
    *
   ***
  *****
 *******
*********
*/

class Pattern17
{
	public static void main(String... s)
	{
		int x=1;
		for(int i=1; i<=5; i++)
		{
			for(int j=4; j>=i; j--)
				System.out.print(" "); 
			
			for(int k=1; k<=x; k++)
				System.out.print("*");
			
			x+=2;
			System.out.println();
		}
	}
}