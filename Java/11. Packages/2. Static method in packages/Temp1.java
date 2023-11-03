package p1;

public class Temp1
{
	static int x = 300;
	static void show()
	{
		System.out.println("pkg show p1");
	}
	
	static void display()
	{
		System.out.println("pkg display p1");
	}
	
	public static void main(String... s)
	{
		new Temp1().show();
	}
}