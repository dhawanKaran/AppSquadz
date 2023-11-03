class LargestSmallest
{
	public static void main(String... s)
	{
		int largest = 0,smallest = 0;
		
		while(true)
		{
			System.out.print("Enter a number: ");
			int num = new java.util.Scanner(System.in).nextInt();
			
			if(smallest==0 && largest==0)
			{	
				smallest = num;
				largest = num;
			}
			
			if(num<smallest)
				smallest = num;
			else if(num>largest)
				largest = num;
			
					
			System.out.println("Do you want to continue, press 1 for yes or press 0 for no!!! ");
			int startAgain = new java.util.Scanner(System.in).nextInt();
			if(startAgain==1)
				continue;
			else
			{
				System.out.println("Largest Number: " + largest + "\nSmallest Number: " + smallest);
				break;
			}
		}
	}
}