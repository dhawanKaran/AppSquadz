import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class SFrame implements ActionListener
{
	JFrame jf;
	JButton jb;
	Button b;
	JTextField jtf;
	
	SFrame(String s)
	{
		jf = new JFrame(s);
		jtf = new JTextField();
		jtf.setBounds(150,40,100,100);
		
		jb = new JButton("Swing");
		b = new Button("AWT");
		jb.setBounds(40,40,100,100);
		b.setBounds(40,150,50,50);
		Container c = jf.getContentPane();
		c.add(jtf);
		c.add(jb);
		c.add(b);
		jb.addActionListener(this);
		b.addActionListener(this);
		c.setLayout(null); //WindowConstants
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(400,400);
		jf.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==jb)
			jtf.setText("Swing");
		if(e.getSource()==b)
			jtf.setText("AWT");
	}
	
	public static void main(String s[])
	{
		new SFrame("Swing Frame");
	}
}