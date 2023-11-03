/*
*   *
*   *
*   *
 * *
  *  
*/
class LetterV
{
    public static void main(String[] args)
    {
        int n = 5;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if(((j==1 || j==n) && i<=3) || (i==4 && j%2==0) || (i==n && j==3))
					System.out.print("*");
				else
					System.out.print(" ");
            }
			System.out.println();
        }
    }
}