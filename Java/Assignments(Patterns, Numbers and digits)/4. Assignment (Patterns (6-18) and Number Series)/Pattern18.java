/*
    1
   222
  33333
 4444444
555555555
*/

class Pattern18
{
	public static void main(String... s)
	{
		int x=1;
		for(int i=1; i<=5; i++)
		{
			for(int j=4; j>=i; j--)
				System.out.print(" "); 
			
			for(int k=1; k<=x; k++)
				System.out.print(i);
			
			x+=2;
			System.out.println();
		}
	}
}