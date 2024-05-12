//Write a java program to pint a table of any number//
class Table
{
	public static void main(String args[])
	{
		int num=4,res=0,i;
		
			System.out.println("Table of"+num+"is:");
			for(i=1;i<=10;i++);
			{
				res=num*i;
				System.out.println(num+"x"+i+"x"+res);
			}
	}		
}