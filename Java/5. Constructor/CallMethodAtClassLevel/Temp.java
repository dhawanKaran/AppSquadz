class Temp
{
	int x = getX();
	
	int getX()
	{
		System.out.println(x);
		return 10;
	}
	
	Temp()
	{
		x=getX();
		System.out.println(x);
	}
	
	public static void main(String... s)
	{
		Temp t1 = new Temp();
		
	}
}