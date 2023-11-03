/*
10101
0101
010
01
0
*/
class Pattern55
{
	public static void main(String... s)
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=i; j<=5; j++)
			{
				System.out.print(j%2);
			}
			System.out.println();
		}
	}
}