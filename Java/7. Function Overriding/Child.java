class Base
{
	int x = 20;
	
	void show()
	{
		System.out.println("Base");
	}
}

class Child extends Base
{
	int x = 30;
	
	void show()
	{
		System.out.println("Child");
	}
	
	void display()
	{
		System.out.println("Display");
	}
	
	public static void main(String... s)
	{
		Base b = new Child(); //Upcasting
		b.show();
		Child c = (Child) b; //Downcasting
		//c.show();
		c.display();
		System.out.println(b.x);
	}
}