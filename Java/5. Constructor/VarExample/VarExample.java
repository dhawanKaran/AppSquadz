class VarExample
{
	//var s=10; //error
	
	public static void main(String... s)
	{
		var s1 = new VarExample();
		System.out.println(s1);
		
		var ch=10;
		//ch=true;
		var z="hello";
		var b=true;
		System.out.println(ch);
		System.out.println(z);
		System.out.println(b);
	}
}