/*a java program to print following pattern
                    *
				*		*
			*		*		*
		*		*		*		* */
		
		
class pyramid
{
	public static void main(String args[])
	{
		for(int i=1;i<=4;i++)
		{
			for(int s=4;s>=i;s--)
				System.out.print("");
			for(int j=1;j<=i;j++)
				System.out.print("*");
			System.out.print("\n");
		}
	}
}