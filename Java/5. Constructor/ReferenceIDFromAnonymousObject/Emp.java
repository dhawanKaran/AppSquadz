class Emp
{
	int salary;
	
	Emp()
	{
		salary = 15000;
	}
	
	void show()
	{
		System.out.println(salary);
	}
	
	public static void main(String... s)
	{
		System.out.println(new Emp().salary);
		new Emp().show();
		System.out.println(new Emp());
	}
}