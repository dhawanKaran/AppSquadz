/*
11111
0000
111
00
1
*/
class Pattern53
{
	public static void main(String... s)
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=i; j<=5; j++)
			{
				System.out.print(i%2);
			}
			System.out.println();
		}
	}
}