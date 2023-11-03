import java.util.Scanner;

class MinArray
{
	int min(int x[])
	{
		int min = x[0];
		
		for(int i=0; i<x.length;i++)
		{
			if(x[i] < min)
				min = x[i];
		}
		return min;
	}
	
	void show(int x[])
	{
		for(int i=0; i<x.length; i++)
		{
			System.out.print(x[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String... s)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the Array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the elements of the Array: ");
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.print((i+1)+" : ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("The Array is: ");
		MinArray ma = new MinArray();
		ma.show(arr);
		System.out.print("The Smallest number of the Array is "+ma.min(arr));
	}
}