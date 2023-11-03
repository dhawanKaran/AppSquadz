import java.util.Scanner;
class MaxArray
{
	int max(int x[])
	{
		int max = 0;
		
		for(int i=0; i<x.length; i++)
		{
			if(max < x[i])
				max = x[i];
		}
		return max;
	}
	
	void show(int x[])
	{
		for(int i=0; i<x.length; i++)
		{
			System.out.print(x[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of the array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the elements of the array: ");
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.print((i+1)+": ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("The Array is: ");
		MaxArray ma = new MaxArray();
		ma.show(arr);
		System.out.println("Largest number of the array is " + ma.max(arr));
	}
}