/*
EDCBA
EDCB
EDC
ED
E
*/
class Pattern46
{
	public static void main(String... s)
	{
		for(char i='A'; i<='E'; i++)
		{
			for(char j='E'; j>=i; j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}