import java.awt.*;

class MyFrame
{
	Frame f;
	
	MyFrame(String s)
	{
		f = new Frame(s);
		f.setSize(400,400);
		f.setVisible(true);
	}
	
	public static void main(String... s)
	{
		new MyFrame("FF");
		new MyFrame("SF");
	}
}