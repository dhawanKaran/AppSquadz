/*
12345
1234
123
12
1
*/
class Pattern41
{
	public static void main(String... s)
	{
		//outer loop
		for(int i=5; i>=1; i--)
		{
			//inner loop
			for(int j=1; j<=i; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}