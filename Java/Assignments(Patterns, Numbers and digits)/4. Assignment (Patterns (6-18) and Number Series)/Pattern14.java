/*
10101
01010
10101
01010
10101
*/

class Pattern14
{
	public static void main(String... s)
	{
		int x=1;
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				System.out.print(x%2);
				x++;
			}
			System.out.println();
		}
	}
}