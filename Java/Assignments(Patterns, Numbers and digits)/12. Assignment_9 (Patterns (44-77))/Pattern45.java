/*
ABCDE
ABCD
ABC
AB
A
*/
class Pattern45
{
	public static void main(String... s)
	{
		for(char i='E'; i>='A'; i--)
		{
			for(char j='A'; j<=i; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}