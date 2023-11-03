/*
11111
2222
333
44
5
*/
class Pattern43
{
	public static void main(String... s)
	{
		int x=5;
		//outer loop
		for(int i=1; i<=5; i++)
		{
			//inner loop
			for(int j=x; j>=1; j--)
			{
				System.out.print(i);
			}
			x--;
			System.out.println();
		}
	}
}