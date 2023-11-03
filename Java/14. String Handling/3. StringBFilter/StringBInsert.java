class StringBInsert
{
	public static void main(String... s)
	{
		StringBuffer sb = new StringBuffer("I Java");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		StringBuffer sb1 = sb.insert(2,"like ");
		System.out.println(sb);
		//System.out.println(sb.length());
		//System.out.println(sb.capacity());
		sb1 = sb.replace(2,6,"love ");
		System.out.println(sb);
		//System.out.println(sb.length());
		//System.out.println(sb.capacity());
		sb1 = sb.delete(2,6);
		System.out.println(sb);
		//System.out.println(sb.length());
		//System.out.println(sb.capacity());
		sb1 = sb.reverse();
		System.out.println(sb);
		//System.out.println(sb.length());
		//System.out.println(sb.capacity());
		
		if(sb1==sb)
			System.out.println("one object");
	}
}