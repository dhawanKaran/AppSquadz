/*
54321
5432
543
54
5
*/
class Pattern42
{
	public static void main(String... s)
	{
		//outer loop
		for(int i=5; i>=1; i--)
		{
			//inner loop
			for(int j=i; j>=1; j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}