/*
11111
00000
11111
00000
11111
*/

class Pattern6
{
	public static void main(String... s)
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5;j++)
			{
				System.out.print(i%2);
			}
			System.out.println();
		}		
	}
}