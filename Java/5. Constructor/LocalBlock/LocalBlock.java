class LocalBlock
{
	public static void main(String... s)
	{
		int y=10;
		{
			int x=20;
			System.out.println(x);
		}
		System.out.println(y);
		//System.out.println(x);
	}
}