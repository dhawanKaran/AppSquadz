//12345
//678910
//1112131415
//1617181920
//2122232425
class Pattern4
{
	public static void main(String... s)
	{
		int x=1;
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				System.out.print(x);
				x++;
			}
			System.out.println();
		}
	}
}