import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class ClientLogin extends JFrame implements ActionListener
{
	JTextField tfClientName;
	
	ClientLogin()
	{
		super("Welcome to ChatZone");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		JLabel jlbl = new JLabel("Enter your name: ");
		JButton enter = new JButton("Enter");
		enter.addActionListener(this);
		tfClientName = new JTextField(20);
		JPanel namePanel = new JPanel();
		JPanel btnPanel = new JPanel();
		btnPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		btnPanel.add(enter);
		namePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		namePanel.add(jlbl);
		namePanel.add(tfClientName);
		add(namePanel,BorderLayout.NORTH);
		add(btnPanel,BorderLayout.CENTER);
		setSize(400,200);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getActionCommand().equals("Enter"))
		{
			System.out.println();
			String clientName = tfClientName.getText();
			new ClientUI(clientName);
			setVisible(false);
		}
	}
	
	public static void main(String... args)
	{
		new ClientLogin();
	}
}