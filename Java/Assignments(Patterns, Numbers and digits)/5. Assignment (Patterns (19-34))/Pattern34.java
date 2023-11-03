/*
A
CB
EDC
GFED
IHGFE
*/

class Pattern34
{
	public static void main(String... s)
	{
		for(char i='A'; i<='E'; i++)
		{
			for(char j='A'; j<=i; j++)
			{
				int a = 2*(int)i-(int)j;
				System.out.print((char)a);
			}
			System.out.println();
		}
	}
}