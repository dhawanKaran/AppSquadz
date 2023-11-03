package p1.sub.sub1;

public class Temp1
{
	public void show()
	{
		System.out.println("pkg show p1");
	}
	
	public void display()
	{
		System.out.println("pkg display p1");
	}
	
	public static void main(String... s)
	{
		new Temp1().show();
		new Temp1().display();
	}
}