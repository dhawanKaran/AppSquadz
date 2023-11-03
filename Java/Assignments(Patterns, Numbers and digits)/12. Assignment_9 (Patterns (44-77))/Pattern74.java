/*
    *
   abc
  *****
 abcdefg
*********
*/
class Pattern74
{
	public static void main(String... s)
	{
		System.out.print("Enter the number of rows: ");
		int n = new java.util.Scanner(System.in).nextInt();
		int x = 1;
		char a = 'a';
		for(int i=1; i<=n; i++)
		{
			for(int j=i; j<=n-1; j++)
			{
				System.out.print(" ");
			}
			
			if(i%2!=0)
			{
				for(int k=1; k<=x; k++)
				{
					System.out.print("*");
				}
			}
			else
			{
				for(char k='a'; k<=a; k++)
				{
					System.out.print(k);
				}
			}
			a+=2;
			x+=2;
			System.out.println();
		}
	}
}