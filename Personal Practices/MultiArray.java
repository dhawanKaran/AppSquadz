class MultiArray
{
	public static void main(String[] s)
	{
		System.out.print("Enter a number for the rows of the Array: ");
		int rows = new java.util.Scanner(System.in).nextInt();
		System.out.print("Enter a number for the columns of the Array: ");
		int columns = new java.util.Scanner(System.in).nextInt();
		int arr[][] = new int[rows][columns];
		
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<columns; j++)
			{
				arr[i][j] = new java.util.Scanner(System.in).nextInt();
			}
		}
		
		//System.out.println();
		System.out.println("\nThe Array: ");
		
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<columns; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		int max = arr[0][0];
		
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<columns; j++)
			{
				if(arr[i][j] > max)
					max = arr[i][j];
			}
		}
		System.out.println("Largest number in the dynamic array is "+max);
	}
}
		
			
			