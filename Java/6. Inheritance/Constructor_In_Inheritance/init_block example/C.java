class A
{
	{
		System.out.println("init block of class A");
	}
	
	A()
	{
		System.out.println("A");
	}
}

class B extends A
{
	{
		System.out.println("init block of class B");
	}
	
	B(int x)
	{
		System.out.println(x);
	}
	
	B()
	{
		System.out.println("B");
	}
}

class C extends B
{
	{
		System.out.println("init block of class C");
	}
	
	C()
	{
		super(10);
		//this(10);
		System.out.println("C");
	}
	
	C(int x)
	{
		System.out.println(x);
	}
	
	public static void main(String... s)
	{
		//new C();
		new C(12);
	}
}