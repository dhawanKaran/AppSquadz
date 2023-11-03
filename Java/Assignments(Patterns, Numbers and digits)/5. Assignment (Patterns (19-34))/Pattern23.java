/*
*****
ABCDE
*****
ABCDE
*****
*/

class Pattern23
{
	public static void main(String... s)
	{
		for(int i=1; i<=5; i++)
		{
			for(char j='A'; j<='E'; j++)
			{
				if(i%2==0)
					System.out.print(j);
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}
}