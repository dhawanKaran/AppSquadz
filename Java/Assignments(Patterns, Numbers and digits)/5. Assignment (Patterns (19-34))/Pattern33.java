/*
A
AB
ABC
ABCD
ABCDE
*/

class Pattern33
{
	public static void main(String... s)
	{
		for(char i='A'; i<='E'; i++)
		{
			for(char j='A'; j<=i; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
		