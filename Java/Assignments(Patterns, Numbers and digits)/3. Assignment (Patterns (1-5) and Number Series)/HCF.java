class HCF
{
	public static void main(String... s)
	{
		System.out.print("Enter a first number: ");
		int num1 = new java.util.Scanner(System.in).nextInt();
		System.out.print("Enter a second number: ");
		int num2 = new java.util.Scanner(System.in).nextInt();		
		int dividend=0, divisor=0, hcf=0;
			
		if(num2>num1)
		{
			dividend = num2;
			divisor = num1;
		}
		else
		{
			dividend = num1;
			divisor = num2;
		}
		int remainder = dividend%divisor;
			
		if(remainder==0)
			hcf = divisor;
		else
		{		
			while(remainder>0)
			{
				dividend=divisor;
				divisor=remainder;
				remainder = dividend%divisor;
				hcf = divisor;
			}			
		}
		System.out.println(hcf + " is the hcf of "+ num1 +" and "+ num2);
	}
}