 /*
EEEEE
DDDDD
CCCCC
BBBBB
AAAAA
*/

class Pattern20
{
	public static void main(String... s)
	{
		for(char i='E'; i>='A'; i--) 
		{
			for(char j='E'; j>='A'; j--)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
}