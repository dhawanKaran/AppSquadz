class NaturalLogarithmOf2
{
	public static void main(String... s)
	{
		System.out.print("Enter a number of nth term: ");
		double num = new java.util.Scanner(System.in).nextInt();
		double initial = 0;
		
		for(double i=1; i<=num; i++)
		{
			if(i%2!=0)
				initial += 1/i;
			else
				initial -= 1/i;
			//System.out.println(initial);
		}
			System.out.println(initial);
	}
}