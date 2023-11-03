/*
EDCBA
FEDCB
GFEDC
HGFED
IHGFE
*/

class Pattern19
{
	public static void main(String... s)
	{
		char a = 'E';
		for(char i='A'; i<='E'; i++) 
		{
			for(char j=a; j>=i; j--)
			{
				System.out.print(j);
			}
			a++;
			System.out.println();
		}
	}
}