class Mobike
{
	String bno;
	String name;
	int days;
	int charge;

	void input()
	{
		System.out.println("Enter the bike number: ");
		bno = new java.util.Scanner(System.in).nextLine();
		System.out.println("Enter the customer name: ");
		name = new java.util.Scanner(System.in).nextLine();
		System.out.println("Enter the number of days: ");
		days = new java.util.Scanner(System.in).nextInt();
	}

	void compute()
	{
		if (days<=5)
		{
			charge = days * 500;
		}
		else if (days>5 && days<=10)
		{
			charge = 2500 + (days-5) * 400;
		}
		else if (days>10)
		{
			charge = 2500 + 2000 + (days-10) * 200;
		}
	}

	void display()
	{
		System.out.print("Bike Number"+"\t"+"Customer Name"+"\t"+"No. of Days" +"\t"+"charge");
		System.out.println(" ");
		System.out.print(bno+"\t\t");
		System.out.print(name+"\t\t");
		System.out.print(days+"\t\t");
		System.out.print(charge+"\t");
	}

	public static void main(String... s)
	{
		Mobike mo = new Mobike();
		mo.input();
		mo.compute();
		mo.display();
	}
}