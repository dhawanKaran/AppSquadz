/*
1
32
543
7654
98765
*/
class Pattern60
{
	public static void main(String... s)
	{
		for(int i=0; i<5; i++)
		{
			for(int j=i+1; j>=1; j--)
			{
				System.out.print(i+j);
			}
			System.out.println();
		}
	}
}
