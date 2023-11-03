/*
12345
 2   4 
  3   3
   4   2
    54321
*/
class Pattern39
{
	public static void main(String... s)
	{
		int x=5, y=4;
		//outer loop
        for(int i=1; i<=5; i++)
        {
            //inner loop for spacing
			for(int j=1; j<=i-1; j++)
			{
				System.out.print(" ");
			}
			
			//inner loop for printing the pattern 
			for(int k=1; k<=5; k++)
			{
				
				/*if(i==1 || i==5 || k==1 || k==5)
				{
					System.out.print(k);
				}*/
				
				if(i==1)
				{
					System.out.print(k);
				}
				else if(i==5)
				{
					System.out.print(x--);
				}
				else if(k==1 && (i!=1 || i!=5))
				{
					System.out.print(i);
				}
				else if(k==5 && (i!=1 || i!=5))
				{
					System.out.print(y--);
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