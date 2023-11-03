/*
*****
1234
***
12
*
*/
class Pattern56
{
	public static void main(String... s)
	{
		for(int i=5; i>=1; i--)
		{
			for(int j=1; j<=i; j++)
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