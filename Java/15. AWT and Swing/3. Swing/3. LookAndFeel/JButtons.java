import java.awt.*;
import javax.swing.*;

public class JButtons extends JFrame
{
	public static void main(String[] args)
	{
		new JButtons();
	}
	
	public JButtons()
	{
		super("Using JButton");
		WindowUtilities.setMotifLookAndFeel();
		//WindowUtilities.setNativeLookAndFeel();
		//WindowUtilities.setJavaLookAndFeel();
		addWindowListener(new ExitListener());
		Container content = getContentPane();
		//Content.setBackground(Color.YELLOW);
		Content.setLayout(new FlowLayout());
		JButton button1 = new JButton("first");
		Content.add(button1);
		
		JButton button2 = new JButton("second");
		Content.add(button2);
		JButton button3 = new JButton("third");
		Content.add(button3);
		JButton button4 = new JButton("forth");
		Content.add(button4);
		
		pack();
		setVisible(true);
	}
}
		