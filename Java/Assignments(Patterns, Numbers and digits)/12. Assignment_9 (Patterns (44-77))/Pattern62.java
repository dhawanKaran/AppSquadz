/*
A
BB
CCC
DDDD
EEEEE
*/
class Pattern62
{
	public static void main(String... s)
	{
		for(char i='A'; i<='E'; i++)
		{
			for(char j='A'; j<=i; j++)
			{
				System.out.print(i);	
			}
			System.out.println();
		}
	}
}