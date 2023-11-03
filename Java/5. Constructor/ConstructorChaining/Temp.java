class Temp
{
	Temp()
	{
		this(10);
		System.out.println("default");
	}
	
	Temp(int x)
	{
		this(10,20);
		System.out.println(x);
	}
	
	Temp(int x, int y)
	{
		System.out.println(x+y);
	}
	
	public static void main(String... s)
	{
		new Temp();
	}
}