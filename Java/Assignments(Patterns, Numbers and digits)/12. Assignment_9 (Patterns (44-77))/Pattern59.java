/*
1
23
345
4567
56789
*/
class Pattern59
{
	public static void main(String... s)
	{
		for(int i=0; i<5; i++)
		{
			for(int j=1; j<=i+1; j++)
			{
				System.out.print(i+j);
			}
			System.out.println();
		}
	}
}