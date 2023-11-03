class Base
{
	private int x = 10;
	
	void show()
	{
		System.out.println(x);
	}
}


class Child extends Base
{	
	public static void main(String... s)
	{
		Child c1 = new Child();
		c1.show();
	}
}