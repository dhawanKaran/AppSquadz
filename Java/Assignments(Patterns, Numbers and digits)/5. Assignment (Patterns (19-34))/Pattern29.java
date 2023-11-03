/*
1
32
543
7654
98765
*/

class Pattern29
{
	public static void main(String... s)
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(2*i-j);
			}
			System.out.println();
		}
	}
}
		