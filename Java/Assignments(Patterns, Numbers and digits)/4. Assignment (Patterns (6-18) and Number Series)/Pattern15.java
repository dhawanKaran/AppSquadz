/*
ABCDE
BCDEF
CDEFG
DEFGH
EFGHI
*/

class Pattern15
{
	public static void main(String... s)
	{
		char a = 'E';
		for(char i='A'; i<='E'; i++)
		{
			for(char j=i; j<=a; j++)
			{
				System.out.print(j);
			}
			a++;
			System.out.println();
		}
	}
}