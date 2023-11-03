import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class CLayout implements ActionListener
{
	JFrame jf;
	JPanel jp;
	JButton jb[];
	CardLayout cl;
	
	CLayout(String s)
	{
		jp = new JPanel();
		cl = new CardLayout();
		jp.setLayout(cl);
		jf = new JFrame(s);
		jb = new JButton[5];
		
		String s1[] = {"north","south","east","west","center"};
		
		for(int i=0; i<jb.length; i++)
		{
			jb[i] = new JButton(s1[i]);
			jb[i].addActionListener(this);
			jp.add(jb[i],"t"+i);
		}
		
		jf.add(jp);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(400,400);
		jf.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		cl.next(jp);
		//cl.last(jp);
	}
	
	public static void main(String s[])
	{
		new CLayout("CardLayout");
	}
}