/*
5
44
333
2222
11111
*/

class Pattern27
{
	public static void main(String... s)
	{
		for(int i=5; i>=1; i--)
		{
			for(int j=5; j>=i; j--)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
		