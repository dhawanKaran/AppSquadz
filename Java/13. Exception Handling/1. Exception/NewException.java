class NewException
{
	public static void main(String s[])
	{
		try
		{
			int x =  10/s.length;
			System.out.println(x);
			int z[] = new int[s.length];
			z[10] = 100;
			System.out.println(z[10]);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e + " jajaja");
		}
		catch(Error e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		catch(Throwable e)
		{
			System.out.println(e);
		}
	}
}