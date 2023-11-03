class ArmstrongNumber
{
	public static void main(String... s)
	{	
		for(int num=1; num<=500; num++)
		{
			int rem, sum=0; 
			int x=num;
			
			while(x!=0)
			{
				rem = x%10;
				x = x/10;
				sum = sum+(rem*rem*rem);
			}
			if (num==sum)
				System.out.println(num+" is an armstrong number.");
		}
	}
}
				
		
		
		
		
		
		
		
		