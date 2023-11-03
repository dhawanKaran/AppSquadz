class FunOver
{
	static void show()
	{
		System.out.println("Zero Arguments");
	}
	static void show(int x)
	{
		System.out.println("One Arguments");
	}
	static void show(int x, int y)
	{
		System.out.println("Two Arguments");
	}
	static void show(int x, int y, int z)
	{
		System.out.println("Three Arguments");
	}
	public static void main(String... s)
	{
		FunOver fo = new FunOver();
		fo.show();
		fo.show(10);
		fo.show(10,10);
		fo.show(10,10,10);
	}
}