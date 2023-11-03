import java.net.*;
import java.util.*;

class Server
{
	ServerSocket ss;
	Socket s;
	ArrayList<Socket> al;
	HashMap<Socket,String> hm;
	
	Server()
	{
		try
		{
			hm = new HashMap<Socket,String>();
			ss = new ServerSocket(20);
			al = new ArrayList<Socket>();
			while(true)
			{
				s = ss.accept();
				al.add(s);
				Runnable r = new ServerThread(s,al,hm);
				Thread t = new Thread(r);
				t.start();
			}
		}
		catch(Exception e)
		{
			System.out.println("Server Exception :: "+e);
		}
	}
	
	public static void main(String... args)
	{
		new Server();
	}
}
				