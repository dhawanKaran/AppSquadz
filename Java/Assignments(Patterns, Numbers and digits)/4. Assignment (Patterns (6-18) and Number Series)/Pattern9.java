/*
*****
22222
*****
44444
*****
*/

class Pattern9
{
	public static void main(String... s)
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				if(i%2==0)
					System.out.print(i);
				else
					System.out.print("*");	
			}
			System.out.println();
		}
	}
}