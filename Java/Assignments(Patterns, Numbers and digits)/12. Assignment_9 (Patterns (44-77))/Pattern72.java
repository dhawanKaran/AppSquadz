/*
    A
   ABA
  ABCBA
 ABCDCBA
ABCDEDCBA
*/
class Pattern72
{
	public static void main(String... s)
	{
		System.out.print("Enter the number of rows: ");
		int n = new java.util.Scanner(System.in).nextInt();
		char a = 'A';
		int b = (int)a;
		int c = b+n-1 ;
		//char d = (char)c;
		
		for(int i=b; i<=c; i++)
		{
			for(int j=i; j<=c-1; j++)
			{
				System.out.print(" ");
			}
			
			for(int k=b; k<=i; k++)
			{
				System.out.print((char)k);
			}
			
			for(int l=i-1; l>=b; l--)
			{
				System.out.print((char)l);
			}
			System.out.println();
		}
	}
}