/*
54321
65432
76543
87654
98765
*/

class Pattern13
{
	public static void main(String... s)
	{
		int x=5;
		for(int i=1; i<=5; i++)
		{
			for(int j=x; j>=i; j--)
			{
				System.out.print(j);
			}
			x++;
			System.out.println();
		}
	}
}