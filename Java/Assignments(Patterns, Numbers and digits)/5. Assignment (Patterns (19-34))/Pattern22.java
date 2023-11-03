/*
ABCDE
FGHIJ
KLMNO
PQRST
UVWXYZ
*/

class Pattern22
{
	public static void main(String... s)
	{
		char a = 'A';
		int r=5;
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=r; j++)
			{
				if(i==5)
					r=6;
				System.out.print(a);
				a++;	
			}
			System.out.println();
		}
	}
}