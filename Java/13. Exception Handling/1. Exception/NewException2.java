class NewException2
{
	public static void main(String s[])
	{
		try
		{
			int x = 10/s.length;
			System.out.println(x);
			int z[] = new int[s.length];
			z[10] = 100;
			System.out.println(z[10]);
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
	}
}