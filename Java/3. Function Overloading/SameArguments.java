class SameArguments
{
	static void show(int x, long y)
	{
		System.out.println("int long argument");
	}
	static void show(long x, int y)
	{
		System.out.println("long int argument");
	}
	public static void main(String... s)
	{
		SameArguments sa = new SameArguments();
		sa.show(10,10L);//int long
		sa.show(10L,10);//long int
		//sa.show(10,10);//error
	}
}