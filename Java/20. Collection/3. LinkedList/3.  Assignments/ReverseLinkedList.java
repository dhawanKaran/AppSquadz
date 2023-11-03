import java.util.LinkedList;
import java.util.Iterator;
//import java.util.Scanner;

class ReverseLinkedList
{
	public static void main(String args[])
	{
		LinkedList<String> theList = new LinkedList<String>();
		
		theList.add("First");
		theList.add("Second");
		theList.add("Third");
		theList.add("Forth");
		theList.add("Random");
		
		Iterator<String> itr = theList.descendingIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
		