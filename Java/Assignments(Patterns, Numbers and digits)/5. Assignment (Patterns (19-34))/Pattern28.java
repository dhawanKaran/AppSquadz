/*
1
23
345
4567
56789
*/

class Pattern28
{
	public static void main(String... s)
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=0; j<i; j++)
			{
				System.out.print(i+j);
			}
			System.out.println();
		}
	}
}
		