import java.io.*;

class ClientThread implements Runnable
{
	DataInputStream dis;
	ClientUI client;
	ClientThread(DataInputStream dis, ClientUI client)
	{
		this.dis = dis;
		this.client = client;
	}
	public void run()
	{
		String s2 = " ";
		do
		{
			try
			{
				s2 = dis.readUTF();
				System.out.println("Received at Client------>>>"+s2);
				if(s2.contains("names9988"))
				{
					ClientUI.showNames(s2);
				}
				else if(s2.contains("left9988"))
				{
					ClientUI.removePerson(s2);
				}
				else if(s2.contains("privatemessage9988"))
				{
					client.privateChatMessage(s2);
				}
				else
				{
					ClientUI.showMessage(s2);
				}
			}
			catch(Exception e)
			{
				System.out.println("Exception in Client Thread------>>>"+e);
			}
		}
		while(!s2.equals("stop"));
		System.out.println("Client Thread EXIT...");
	}
}
				