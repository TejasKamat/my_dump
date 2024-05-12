import java.io.DataInputStream;
class Read
{
	public static void main(String args[])
	{
		DataInputStream in=new DataInputStream(System.in);
		int a=0;
		float b=0.0f;
		try{
			System.out.println("Enter an integer variable");
		    a=Integer.parseInt(in,readLine90());
			System.out.println(enter a float variable);
			b=Float.valueof(in.readLine()).floatValue();
		   }
		catch(Expectation e)
		{}
		System.out.println("Enter an Integer value a="+a);
		System.out.println("Enter a Float b="+b);
	}
}