import java.util.Vector;

public class MyVectorArrayCopy
{
	public static void main(String s[])
	{
		Vector<String> vct = new Vector<String>();
		vct.add("First");
		vct.add("Second");
		vct.add("Third");
		vct.add("Random");
		System.out.println("Actual vector: "+vct);
		
		String[] copyArr = new String[vct.size()];
		vct.copyInto(copyArr);
		//vct.toArray(copyArr);
		
		System.out.println("Copied Array Content: ");
		for(String str : copyArr)
		{
			System.out.println(str);
		}
	}
}