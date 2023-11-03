/*
*****
*   *
** **
* * *
** **
*   *
*****
*/
class Pattern40
{
	public static void main(String... s)
	{
		for(int i=1; i<=7; i++)
		{
			for(int j=1; j<=5;j++)
			{
				if(i==1 || i==7 || j==1 || j==5 || (j==3 && i==4) || (i==3 && (j==2 || j==4)) || (i==5 && (j==2 || j==4)))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}