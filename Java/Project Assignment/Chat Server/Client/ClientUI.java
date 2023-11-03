import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.net.Socket;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.*;

class ClientUI extends JFrame implements ActionListener
{
	static String name;
	static JTextArea taPublicArea;
	JTextArea taEnterMessage;
	static JTextArea taClientNames;
	Socket socket;
	DataInputStream dis;
	DataOutputStream dos;
	static JList <String> jl;
	static Vector <String> v;
	JDesktopPane desktop;
	static PrivateChat[] pc = new PrivateChat[20];
	static int pcCounter = 0;
	static HashMap <String, PrivateChat> hm;
	
	ClientUI(String name)
	{
		super(name);
		System.out.println("Welcome, " + name +".");
		this.name = name;
		v = new Vector <String>(3,2);
		WindowListener windowListener = new WindowAdapter(){
			public void windowClosing(WindowEvent windowEvent){
				logOut();
			}
		};
		addWindowListener(windowListener);
		hm = new HashMap <String, PrivateChat>();
		taPublicArea = new JTextArea(20,20);
		taEnterMessage = new JTextArea(4,20);
		taClientNames = new JTextArea(20,10);
		jl = new JList<String>(v);
		MouseListener mouseListener = new MouseAdapter(){
			public void mouseClicked(MouseEvent mouseEvent){
				JList theList = (JList) mouseEvent.getSource();
				if(mouseEvent.getClickCount()==2){
					int index = theList.locationToIndex(mouseEvent.getPoint());
					if(index >= 0){
						Object o = theList.getModel().getElementAt(index);
						displayInternalframe(o.toString());
					}
				}
			}
		};
		
		jl.addMouseListener(mouseListener);
		Border publicAreaBorder = BorderFactory.createTitledBorder("Public Chat");
		Border publicMessageBorder = BorderFactory.createTitledBorder("Enter Message to BroadCast");
		Border clientList = BorderFactory.createTitledBorder("ClientList");
		taPublicArea.setBorder(publicAreaBorder);
		taEnterMessage.setBorder(publicMessageBorder);
		jl.setBorder(clientList);
		JScrollPane publicAreaScrollBar = new JScrollPane(taPublicArea);
		JScrollPane publicMessageScrollBar = new JScrollPane(taEnterMessage);
		JScrollPane clientListScrollBar = new JScrollPane(jl);
		clientListScrollBar.setPreferredSize(new Dimension(100,350));
		JButton sendMessage = new JButton("Send");
		JButton logout = new JButton("Logout");
		sendMessage.addActionListener(this);
		logout.addActionListener(this);
		JPanel topPanel = new JPanel();
		JPanel bottomPanel = new JPanel();
		JPanel btnPanel = new JPanel();
		topPanel.add(publicAreaScrollBar,BorderLayout.EAST);
		topPanel.add(clientListScrollBar,BorderLayout.WEST);
		btnPanel.add(sendMessage,BorderLayout.NORTH);
		btnPanel.add(logout,BorderLayout.CENTER);
		bottomPanel.add(publicMessageScrollBar,BorderLayout.EAST);
		bottomPanel.add(btnPanel,BorderLayout.WEST);
		add(topPanel,BorderLayout.NORTH);
		add(bottomPanel,BorderLayout.CENTER);
		setSize(380,540);
		setVisible(true);
		startClientThread();
	}
	
	ClientUI()
	{
		
	}
	
	public void startClientThread()
	{
		try
		{
			socket = new Socket("localhost",20);
			dis = new DataInputStream(socket.getInputStream());
			Runnable r = new ClientThread(dis,this);
			Thread t = new Thread(r);
			t.start();
			broadcastMessage("name9988"+name);
		}
		catch(Exception e)
		{
			System.out.println("Exception in Starting Client Thread---->"+e);
		}
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getActionCommand().equals("Send"))
		{
			String broadcastMessage = taEnterMessage.getText();
			taEnterMessage.setText("");
			broadcastMessage(broadcastMessage);
		}
		if(ae.getActionCommand().equals("Logout"))
		{
			logOut();
		}
	}
	
	public void broadcastMessage(String broadcastMessage)
	{
		try
		{
			broadcastMessage = name + ": " + broadcastMessage;
			dos = new DataOutputStream(socket.getOutputStream());
			dos.writeUTF(broadcastMessage);
			dos.flush();
		}
		catch(Exception e)
		{
			System.out.println("Exception in broadcastMessage method of ClientUI---->>>"+e);
		}
	}
	
	public static void showMessage(String messageRecieved)
	{
		System.out.println("messageRecieved----"+messageRecieved);
		
		if(messageRecieved.contains("name9988"))
		{
			String namess[] = messageRecieved.split("name9988");
			String name = namess[1];
			messageRecieved = name+" Connected";
			v.addElement(name);
		}
		
		messageRecieved = messageRecieved.trim();
		String s = taPublicArea.getText();
		s = s+"\n"+messageRecieved;
		appendNewText(taPublicArea,s);
		//taPublicArea.setText(s);
		jl.setListData(v);
	}
	
	public static void showNames(String messageRecieved)
	{
		try
		{
			Thread.sleep(1000);
			String names = taClientNames.getText();
			String name[] = messageRecieved.split(",");
			for(int i=1; i<name.length; i++)
			{
				v.addElement(name[i]);
			}
			jl.setListData(v);
		}
		catch(Exception e)
		{
			System.out.println("Exception in showing name----"+e);
		}
	}
	
	public static void appendNewText(JTextArea ta, String txt){
		SwingUtilities.invokeLater(new Runnable() {
			public void run(){
				ta.setText(txt);
			}
		});
	}
	
	void displayInternalframe(String internalFrameName)
	{
		pc[pcCounter] = new PrivateChat(this,internalFrameName,name);
		hm.put(internalFrameName,pc[pcCounter]);
		pcCounter++;
	}
	
	void logOut()
	{
		broadcastMessage("logout");
		System.exit(0);
	}
	
	public static void removePerson(String messageRecieved)
	{
		try
		{
			String name = messageRecieved.substring(8);
			System.out.println("person removed===="+name);
			v.remove(name);
			showMessage(name+" removed");
		}
		catch(Exception e)
		{
			System.out.println("Exception in removing person----"+e);
		}
	}
	
	public void privateChatMessage(String message)
	{
		String msg[] = message.split(" : ");
		String receiverName = msg[2].trim();
		String receiverMessage = "";
		String senderName = msg[0].trim();
		if(msg.length<3)
		{
			receiverMessage = "";
		}
		else
		{
			receiverMessage = msg[3].trim();
		}
		PrivateChat pvc = null;
		Iterator <Map.Entry<String, PrivateChat>> iter = hm.entrySet().iterator();
		
		if(!iter.hasNext())
		{
			System.out.println("Empty Hash Map");
		}
		else
		{
			while(iter.hasNext()){
				Map.Entry<String, PrivateChat> entry = iter.next();
				if(senderName.equalsIgnoreCase(entry.getKey())){
					pvc = (PrivateChat)entry.getValue();
					break;
				}
			}
		}
		
		if(pvc == null)
		{
			if(receiverMessage.contains("left"))
			{
				
			}
			else
			{
				pc[pcCounter] = new PrivateChat(this,senderName,name);
				hm.put(senderName,pc[pcCounter]);
				pc[pcCounter].updateTextArea(senderName+" : "+receiverMessage);
				pcCounter++;
			}
		}
		else
		{
			if(receiverMessage.contains("left"))
			{
				pvc.updateTextArea(receiverMessage);
			}
			else
			{
				pvc.updateTextArea(senderName+" : "+receiverMessage);
			}
		}
	}
}