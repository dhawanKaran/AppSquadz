/*
ABCDE
BCDE
CDE
DE
E
*/
class Pattern47
{
	public static void main(String... s)
	{
		for(char i='A'; i<='E'; i++)
		{
			for(char j=i; j<='E'; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}