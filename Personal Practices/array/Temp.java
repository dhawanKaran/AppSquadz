import java.util.Scanner;
class Temp
{
	static int max()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements in first matrix: ");
		int first = sc.nextInt();
		int x[] = new int[first];
		System.out.println("Please enter the elements of first matrix: ");
		
		for(int i=0; i<x.length; i++)
		{
			System.out.print((i+1)+": ");
			x[i] = sc.nextInt();
		}
		int y = x[0];
		
		for(int i=0; i<x.length; i++)
		{
			if(y<x[i])
				y=x[i];
		}
		return y;
	}
	
	public static void main(String[] args)
	{
		int n = max();
		System.out.println("Largest number is " + n);
	}
}