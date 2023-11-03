class Throwable extends Object
{
	String s;
	
	public String toString()
	{
		return s;
	}
}

class Exception extends Throwable
{
	Exception(String s)
	{
		this.s = s;
	}
}

class Temp
{
	public static void main(String... s)
	{
		Exception e = new Exception("Hello");
		System.out.print(e);
	}
}