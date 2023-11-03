/*
10101
1010
101
10
1
*/
class Pattern54
{
	public static void main(String... s)
	{
		for(int i=5; i>=1; i--)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(j%2);
			}
			System.out.println();
		}
	}
}