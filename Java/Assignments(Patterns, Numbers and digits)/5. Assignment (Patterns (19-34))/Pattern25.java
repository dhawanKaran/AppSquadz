/*
12345
ABCDE
12345
ABCDE
12345
*/

class Pattern25
{
	public static void main(String... s)
	{
		for(int i=1; i<=5; i++)
		{
			if(i%2!=0)
			{
				for(int j=1; j<=5; j++)
					System.out.print(j);
			}
			else
			{
				for(char k='A'; k<='E'; k++)
					System.out.print(k);
			}
			System.out.println();
		}
	}
}