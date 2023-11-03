import java.util.Scanner;
class OddEven
{
	public static void main(String... s)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check, is it odd or even? ");
		int x = sc.nextInt();
		
		if(x%2==0)
		{
			System.out.println("This number is even number.");
		}
		else
		{
			System.out.println("This number is odd number.");
		}
	}
}