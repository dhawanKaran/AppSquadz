class WithoutLoop
{	
	
	static void printNum(int num)
	{
		
		if(num <= 0)
			return;
		else
		{
			printNum(num-1);
			System.out.println(num);
			
		}
	}
    
	public static void main(String[] args) 
    {
		System.out.print("Enter the number: ");
		int n = new java.util.Scanner(System.in).nextInt();
		
		printNum(n);
	}
}