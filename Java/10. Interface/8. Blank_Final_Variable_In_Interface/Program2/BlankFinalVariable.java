class BlankFinalVariable
{
	final int x = getX();
	
	int getX()
	{
		System.out.println(x + " via get fuction");
		return 10;
	}
	
	
	BlankFinalVariable()
	{
		//x = getX(); //error
		System.out.println(this.x + " via constructor");
	}
	
	public static void main(String... s)
	{
		new BlankFinalVariable();
	}
}
	
	