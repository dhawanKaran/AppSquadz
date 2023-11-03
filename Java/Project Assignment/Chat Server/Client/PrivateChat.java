import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.*;

class PrivateChat implements ActionListener
{
	String clientName;
	String loginName;
	JTextArea ifmessageTextArea;
	ClientUI client;
	JTextArea ifChatTextArea;
	
	PrivateChat(ClientUI client, String internalFrameName, String loginName)
	{
		clientName = internalFrameName;
		this.client = client;
		this.loginName = loginName;
		JInternalFrame jiFrame = new JInternalFrame(internalFrameName,true,true,true,true);
		jiFrame.addInternalFrameListener(new FrameListener(this));
		jiFrame.setLocation(10,10);
		jiFrame.setSize(100,100);
		jiFrame.moveToFront();
		jiFrame.setResizable(true);
		ifChatTextArea = new JTextArea(10,10);
		ifmessageTextArea = new JTextArea(3,20);
		JButton ifSendButton = new JButton("Send");
		JPanel ifSouthPanel = new JPanel();
		//JPanel ifNorthPanel = new JPanel();
		JScrollPane ifTextAreaScrollBar = new JScrollPane(ifChatTextArea);
		JScrollPane ifTextFieldScrollbar = new JScrollPane(ifmessageTextArea);
		//ifNorthPanel.add(ifTextAreaScrollBar,BorderLayout.CENTER);
		ifSouthPanel.add(ifTextFieldScrollbar,BorderLayout.EAST);
		ifSouthPanel.add(ifSendButton,BorderLayout.WEST);
		jiFrame.add(ifTextAreaScrollBar,BorderLayout.NORTH);
		jiFrame.add(ifSouthPanel,BorderLayout.SOUTH);
		
		client.add(jiFrame,BorderLayout.SOUTH);
		jiFrame.setVisible(true);
		ifSendButton.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getActionCommand().equals("Send"))
		{
			System.out.println("Send Clicked====");
			String message = ifmessageTextArea.getText();
			sendMessage(message);
		}
	}
	
	public void sendMessage(String message)
	{
		String broadcastMessage = "privatemessage9988: "+clientName+" : "+message;
		System.out.println("message===="+broadcastMessage);
		client.broadcastMessage(broadcastMessage);
		updateTextArea(loginName+" : "+message);
		ifmessageTextArea.setText("");
	}
	
	public void updateTextArea(String message)
	{
		String s = ifChatTextArea.getText();
		s = s+"\n"+message;
		System.out.println("s---"+s);
		appendNewText(s);
		ifmessageTextArea.setText("");
	}
	
	public void appendNewText(String txt)
	{
		SwingUtilities.invokeLater(new Runnable(){
			public void run()
			{
				ifChatTextArea.setText(txt);
				//outputText.setText(outputText.getText + "\n" + txt); Windows LineSeparator
			}
		});
	}
}

class FrameListener extends InternalFrameAdapter
{
	PrivateChat pc;
	FrameListener(PrivateChat pc)
	{
		this.pc = pc;
	}
	
	public void internalFrameClosing(InternalFrameEvent e)
	{
		System.out.println("Window Closing");
		pc.sendMessage(pc.loginName+"left");
	}
}