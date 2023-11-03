import java.util.Scanner;
class DivideWithout
{
	public static void main(String... s)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the dividend: ");
		int x = sc.nextInt(); //dividend
		System.out.print("Enter the divisor: ");
		int y = sc.nextInt(); //divisor
		int z=x;
		
		for(int i=1; i<z; i++)
		{
			x=x-y;
			if(x==0)
			{
				System.out.println(i);
			}
			
		}
		
		//int quotent = 0;
		
		//while(dividend>=divisor)
		//{
		//	dividend=dividend-divisor;
		//	quotent++;
		//}
		//System.out.println(quotent);
	}
}