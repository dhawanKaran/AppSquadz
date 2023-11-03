import java.io.*;
import java.net.*;
import java.util.*;

class ServerThread implements Runnable
{
	Socket s;
	ArrayList<Socket> al;
	HashMap<Socket,String> hm;
	
	ServerThread(Socket s, ArrayList<Socket> al, HashMap<Socket,String> hm)
	{
		this.s = s;
		this.al = al;
		this.hm = hm;
	}
	
	public void run()
	{
		try
		{
			DataInputStream dis = new DataInputStream(s.getInputStream());
			String s1 = "";
			while(!(s1.contains("logout")))
			{
				s1 = dis.readUTF();
				if(s1.contains("name9988"))
				{
					String names[] = s1.split("name9988");
					String name = names[1];
					sendPersonInGroup();
					hm.put(s, name);
				}
				if(s1.contains("privatemessage9988"))
				{
					String messagerec[] = s1.split(" : ");
					String sendername = messagerec[0].trim();
					String receivername = messagerec[2].trim();
					String message = "";
					if(messagerec.length<3)
					{
						message = "";
					}
					else
					{
						message = messagerec[3].trim();
					}
					
					Socket receiverSocket = null;
					Iterator<Map.Entry<Socket,String>> iter = hm.entrySet().iterator();
					while(iter.hasNext())
					{
						Map.Entry<Socket,String> entry = iter.next();
						if(receivername.equalsIgnoreCase(entry.getValue()))
						{
							receiverSocket = entry.getKey();
							break;
						}
					}
					
					if(!(receiverSocket == null))
					{
						//String messages = "privatemessage9988"+
						DataOutputStream dos = new DataOutputStream(receiverSocket.getOutputStream());
						dos.writeUTF(s1);
						dos.flush();
					}
					else
					{
						System.out.println("Receiver Socket is null");
					}
				}
				
				if(!(s1.contains("logout")))
				{
					if(!(s1.contains("privatemessage9988")))
					{
						broadcast(s1);
					}
				}
				else
				{
					String personLeft = "";
					System.out.println("Logout Received:----");
					al.remove(s);
					Iterator<Map.Entry<Socket,String>> iter = hm.entrySet().iterator();
					while(iter.hasNext())
					{
						Map.Entry<Socket,String> entry = iter.next();
						if(s == entry.getKey())
						{
							personLeft = entry.getValue();
							iter.remove();
							break;
						}
					}
					memberLeft(personLeft);
					System.out.println("Logout Received:----");
				}
			}
		}
		catch(Exception e)
		{
			System.out.println("Server Thread Exception:----"+e);
		}
	}
	
	public void broadcast(String s)
	{
		Iterator<Socket> i = al.iterator();
		while(i.hasNext())
		{
			try
			{
				Socket s1 = i.next();
				DataOutputStream dos = new DataOutputStream(s1.getOutputStream());
				dos.writeUTF(s);
				dos.flush();
			}
			catch(Exception e)
			{
				System.out.println("broadcast Method Error:----"+e);
			}
		}
	}
	
	void sendPersonInGroup()
	{
		try
		{
			Set set = hm.entrySet();
			Iterator i = set.iterator();
			String names = "";
			while(i.hasNext())
			{
				Map.Entry me = (Map.Entry)i.next();
				names = names+","+me.getValue();
			}
			names = "names9988"+names;
			DataOutputStream dos = new DataOutputStream(s.getOutputStream());
			dos.writeUTF(names);
			dos.flush();
		}
		catch(Exception e)
		{
			System.out.println("sendPersonInGroup Method Error:----"+e);
		}
	}
	
	void memberLeft(String personLeft)
	{
		String message = "left9988"+personLeft;
		broadcast(message);
	}
}