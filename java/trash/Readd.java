import java.io.*;

class Readd
{
	public static void main (String args[])
	{
	 	try{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String temp1=br.readLine();
		int a=Integer.parseInt(temp1);
		String temp2=br.readLine();
		int b=Integer.parseInt(temp2);

		int c=a+b;

		System.out.println("sum of"+a+"and"+b+"is"+c);
	       }
    		
		catch(Exception ex)
		{
			System.out.println(ex.getMessage())		;
		}
	}
}