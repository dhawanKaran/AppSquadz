import java.io.*;

class PrivateChatThread implements Runnable
{
	DataInputStream dis;
	PrivateChatThread(DataInputStream dis)
	{
		this.dis = dis;
	}
	
	public void run()
	{
		String s2 = " ";
		do
		{
			try
			{
				s2 = dis.readUTF();
				System.out.println("Received at privateChat------>>>"+s2);
				if(s2.contains("names9988"))
				{
					ClientUI.showNames(s2);
				}
				else if(s2.contains("left9988"))
				{
					ClientUI.removePerson(s2);
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
		System.out.println("ClientThread EXIT...");
	}
}