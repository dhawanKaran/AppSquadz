/*
ABCDE
FGHI
JKL
MN
O
*/
class Pattern52
{
	public static void main(String... s)
	{
		//System.out.print("Enter the number of rows: ");
		//int n = new java.util.Scanner(System.in).nextInt();
		char a = 'A';
		for(int i=1; i<=5; i++)
		{
			for(int j=i; j<=5; j++)
			{
				System.out.print(a);
				a++;
			}
			System.out.println();
		}
	}
}