import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class FLayout
{
	JFrame jf;
	JButton jb[];
	
	FLayout(String s)
	{
		jf = new JFrame(s);
		jb = new JButton[5];
		
		String s1[] = {"north","south","east","west","center"};
		
		for(int i=0; i<jb.length; i++)
		{
			jb[i] = new JButton(s1[i]);
			jf.add(jb[i]);
		}
		
		jf.setLayout(new FlowLayout(FlowLayout.LEFT,30,30));
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(400,400);
		jf.setVisible(true);
	}
	
	public static void main(String s[])
	{
		new FLayout("FlowLayout");
	}
}