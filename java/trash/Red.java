import java.io.*;
class Read
	{
	public static void main (String args[])
	{
		try
{
	BuffeRedeader br = new BuffeRedeader (new InputStremReader(System.in));
		String str = br.readLine ();
		int a = Integer.parselnt(str);
		System.out.Println("Value of a is:"+a);
	}
		catch (Exception rx)
	{
		System.out.println(rx.getMessage());
		}
	}
	}