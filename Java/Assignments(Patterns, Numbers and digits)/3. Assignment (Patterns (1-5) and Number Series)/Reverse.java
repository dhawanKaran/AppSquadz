class Reverse
{
	public static void main(String... s)
	{
		while(true)
		{
			System.out.print("Enter a number: ");
			int x = new java.util.Scanner(System.in).nextInt();
			int rev=0;
			int z;
			while(x>0)
			{
				z=x%10;
				x=x/10;
				rev=rev*10+z;
			}
			System.out.println(rev);
			rev=0;
			
			System.out.println("Do you want to continue, press 1 for yes or press 0 for no!!! ");
			int x2 = new java.util.Scanner(System.in).nextInt();
			if(x2==1)
				continue;
			else
				break;
		}
	}
}