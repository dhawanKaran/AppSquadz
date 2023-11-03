class PosNegZeros
{
	public static void main(String... s)
	{
		int positive = 0, negative = 0, zeros = 0;
	
		while(true)
		{
			System.out.print("Enter a number: ");
			int num = new java.util.Scanner(System.in).nextInt();
			
			if(num>0)
				positive++;
			else if(num<0)
				negative++;
			else
				zeros++;
			
			System.out.println("Do you want to continue, press 1 for yes or press 0 for no!!! ");
			int x = new java.util.Scanner(System.in).nextInt();
			if(x==1)
				continue;
			else
			{
				System.out.println("Positive: " + positive + "\nNegative: " + negative + "\nZeros" + zeros);
				break;
			}
		}
	}
}