/*
EDCBA
DCBA
CBA
BA
A
*/
class Pattern48
{
	public static void main(String... s)
	{
		for(char i='E'; i>='A'; i--)
		{
			for(char j=i; j>='A'; j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}