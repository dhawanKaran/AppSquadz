/*
1
12
123
1234
12345
*/
class Pattern57
{
	public static void main(String... s)
	{
		for(int i=0; i<5; i++)
		{
			for(int j=1; j<=i+1; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}