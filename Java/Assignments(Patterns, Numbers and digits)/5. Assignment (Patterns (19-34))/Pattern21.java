/*
EDCBA
EDCBA
EDCBA
EDCBA
EDCBA
*/

class Pattern21
{
	public static void main(String... s)
	{
		for(char i='A'; i<='E'; i++) 
		{
			for(char j='E'; j>='A'; j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}