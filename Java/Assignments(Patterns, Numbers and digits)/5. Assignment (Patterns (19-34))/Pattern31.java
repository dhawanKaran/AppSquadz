/*
1
21
321
4321
54321
*/

class Pattern31
{
	public static void main(String... s)
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=0; j<i; j++)
			{
				System.out.print(i-j);
			}
			System.out.println();
		}
		
		/*for(int i=4; i>=0; i--)
		{
			for(int j=5; j>i; j--)
			{
				System.out.print(j-i);
			}
			System.out.println();
		}*/
	}
}