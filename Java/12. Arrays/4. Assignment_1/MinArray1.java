import java.util.Scanner;

class MinArray1
{
	int rows;
	int columns;
	
	void getRows(int rows)
	{
		this.rows = rows;
	}
	
	void getColumns(int columns)
	{
		this.columns = columns;
	}
	
	int min1(int x[][])
	{
		int y[][] = new int[rows][columns];
		y = x;
		int min1 = x[0][0];
		
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<columns; j++)
			{
				if(min1 > x[i][j])
					min1 = x[i][j];
			}
		}
		return min1;
	}
	
	void show(int x[][])
	{
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<columns; j++)
			{
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String... s)
	{
		Scanner sc = new Scanner(System.in);
		MinArray1 ma1 = new MinArray1();
		
		System.out.print("Enter a number for the rows of the Array: ");
		ma1.getRows(sc.nextInt());
		System.out.print("Enter a number for the columns of the Array: ");
		ma1.getColumns(sc.nextInt());
		int arr[][] = new int[ma1.rows][ma1.columns];
		
		System.out.println("Enter the elements of the Dynamic Array: ");
		for(int i=0; i<ma1.rows; i++)
		{
			for(int j=0; j<ma1.columns; j++)
			{
				System.out.print(i + ",");
				System.out.print(j + ": ");
				arr[i][j] = sc.nextInt();
			}
		}	
		System.out.println("The Dynamic Array is: ");
		ma1.show(arr);
		System.out.println("Smallest number of the Dynamic Array is " + ma1.min1(arr));
	}
}