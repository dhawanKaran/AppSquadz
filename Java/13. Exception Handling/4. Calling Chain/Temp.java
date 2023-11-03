class Temp
{
	void show()
	{
		int x = 10/0;
	}
	
	void display()
	{
		show();
	}
	
	void xyz()
	{
		display();
	}
	
	public static void main(String...s)
	{
		Temp t1 = new Temp();
		try
		{
			t1.xyz();
		}
		catch(ArithmeticException e)
		{
			//System.out.print(e);
			e.printStackTrace();
		}
	}
}
