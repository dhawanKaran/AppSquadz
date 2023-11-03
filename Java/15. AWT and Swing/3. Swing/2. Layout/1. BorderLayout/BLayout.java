import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class BLayout
{
	JFrame jf;
	JButton jb[];
	
	BLayout(String s)
	{
		jf = new JFrame(s);
		jb = new JButton[5];
		String s1[] = {"north","south","east","west","center"};
		String x[] = {BorderLayout.NORTH, BorderLayout.SOUTH, BorderLayout.EAST, BorderLayout.WEST, BorderLayout.CENTER};
		
		for(int i=0; i<jb.length; i++)
		{
			jb[i] = new JButton(s1[i]);
			jf.add(jb[i],x[i]);
		}
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(400,400);
		jf.setVisible(true);
	}
	
	public static void main(String s[])
	{
		new BLayout("BorderLayout");
	}
}