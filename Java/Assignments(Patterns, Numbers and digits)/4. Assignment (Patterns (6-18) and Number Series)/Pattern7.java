/* 
12345
23456
34567
45678
56789
*/

class Pattern7
{
	public static void main(String... s)
	{
		int x=5;
		for(int i=1; i<=5; i++)
		{
			for(int j=i; j<=x; j++)
			{
				System.out.print(j);
			}
			x++;
			System.out.println();
		}
	}
}