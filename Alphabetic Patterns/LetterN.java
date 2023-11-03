/*
*   *
**  *
* * *
*  **
*   *
*/
class LetterN
{
    public static void main(String[] args)
    {
        int n = 5;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if((j==1 || j==n) || /*(i==2 && j==2) || (i==3 && j==3) || (i==4 && j==4)*/ (i!=1 && i!=n && i==j))
					System.out.print("*");
				else
					System.out.print(" ");
            }
			System.out.println();
        }
    }
}