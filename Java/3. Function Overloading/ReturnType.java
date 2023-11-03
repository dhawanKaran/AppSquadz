class ReturnType
{
	static void show(char x)
	{
		System.out.println("no return type");
	}
	static int show(int z)
	{
		System.out.println("with return type");
		return z;
	}
	public static void main(String... s)
	{
		ReturnType rt = new ReturnType(); 
		//show('a');
		rt.show(10);
		//int a = show(10);
		//System.out.println(a);
	}

}