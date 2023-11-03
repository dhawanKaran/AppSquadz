/*
    A
   BCB
  CDEDC
 DEFGFED
EFGHIHGFE
*/
class Pattern73
{
	public static void main(String... s)
	{
		System.out.print("Enter the number of rows: ");
		int n = new java.util.Scanner(System.in).nextInt();
		char a = 'A';
		int b = (int)a;// A = 65
		int c = b+n-1 ;// E = 69
		
		for(int i=b; i<=c; i++)
		{
			for(int j=i ; j<c; j++)
			{
				System.out.print(" ");
			}
			
			for(int k=i; k<=2*i-b; k++)
			{
				System.out.print((char)k);
			}
			 
			for(int l=2*i-(b+1); l>=i; l--)
			{
				System.out.print((char)l);
			}
			System.out.println();
		}
	}
} 