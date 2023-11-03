class Temp
{
	final int x;
	
	Temp(int x)
	{
		this.x=x;
	}
	
	public static void main(String... s)
	{
		Temp t1 = new Temp(10);
		System.out.println(t1.x);
		//t1.x = t1.x + 10; //error
		
		Temp t2 = new Temp(100);
		System.out.println(t2.x);
		//t2.x = t2.x + 10; //error
	}
}