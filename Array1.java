class Array1
{
	public static void main(String... s)
	{
		System.out.print("Please enter the value that you put in the array: ");
		int value = new java.util.Scanner(System.in).nextInt();
		
		int a[] = new int[value];
		
		for(int i=0; i<a.length; i++)
		{
			a[i] = new java.util.Scanner(System.in).nextInt();
		}
		
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
	}
}