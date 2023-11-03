/*
ABCDE
abcde
ABCDE
abcde
ABCDE
*/

class Pattern24
{
	public static void main(String... s)
	{
		for(int i=1; i<=5; i++)
		{
			if(i%2!=0)
			{
				for(char j='A'; j<='E'; j++)
					System.out.print(j);
			}
			else
			{
				for(char k='a'; k<='e'; k++)
					System.out.print(k);
			}
			System.out.println();
		}
	}
}