class Student
{
	int Roll_no;
	String Name,Dept;
	
	Student(int x, String y, String z)
	{
		this.Roll_no=x;
		this.Name=y;
		this.Dept=z;
	}
	
	void display()
	{
		System.out.println("Name:"+Name);
		System.out.println("Roll_no:"+Roll_no);
		System.out.println("Dept:"+Dept);		
	}
}

class Result extends Student
{
	int Science,Maths,English,Total;
	
	Result(int x, String y, String z, int a, int b, int c)
	{
		super(x,y,z);
		this.Science=a;
		this.Maths=b;
		this.English=c;
	}
	void display()
	{
		System.out.println("Name:"+Name);
		System.out.println("Roll_no:"+Roll_no);
		System.out.println("Dept:"+Dept);	
		System.out.println("Science:"+Science);
		System.out.println("Maths:"+Maths);
		System.out.println("English:"+English);
		
		Total=Science+Maths+English;
		System.out.println("The Total is:"+Total);		
	}
}
class Total
{
	public static void main(String args[])
	{
		Result r1=new Result(73,"CHRIS","comp",70,80,90);
		r1.display();
	}
}