//FInd the sum of all digit in a number//
class Sum
{
	public static void main(String args[])
	{
		int num=123456789,rem,sum=0;
			while(num>0)
			{
				rem=num%10;
				num=num/10;
				sum=sum+rem;
			}
			System.out.println("the sum of all number is="+sum);
	}
}