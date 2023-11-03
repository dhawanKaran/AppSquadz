/*
ABCDE
B   D
C   C
D   B
EDCBA
*/
class Pattern76
{
	public static void main(String... s)
	{
		System.out.print("Enter the number of rows: ");
		int n = new java.util.Scanner(System.in).nextInt();
		char a = 'A';
		int b = (int)a;
		int c = b+n-1 ;
		int x=c, y=c-1;
		
        for(int i=b; i<=c; i++)
        {
			for(int k=b; k<=c; k++)
			{
				if(i==b)
				{
					System.out.print((char)k);
				}
				else if(i==c)
				{
					System.out.print((char)x--);
				}
				else if(k==b && (i!=b || i!=c))
				{
					System.out.print((char)i);
				}
				else if(k==c && (i!=b || i!=c))
				{
					System.out.print((char)y--);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}