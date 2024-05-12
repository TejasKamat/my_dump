class Student
{
	int roll;
	void getNumber(int n)
	{
		roll=n;
	}
	void putNumber()
	{
		System.out.println("RollNo="+roll);
	}
}
class Test extends Student
{
	float marks1,marks2;
	void getMarks(float m1,float m2)
	{
		marks1=m1;
		marks2=m2;
	}
	void putMarks()
	{
		System.out.println("Marks obtained");
		System.out.println("Marks 1"+marks1);
		System.out.println("Marks 2"+marks2);
	}
}
interface Sports
{
	float sportMarks=6.0F;
	void putsportMarks();
}
class Results extends Test implements Sports
{
	float total;
	public void putsportMarks()
	{
		System.out.println("Sports Marks="+sportMarks);
	}
	void display()
	{
		total=marks1+marks2+sportMarks;
		putNumber();
		putMarks();
		putsportMarks();
		System.out.println("Total score"+total);
	}
}	
class Hybrid
{
	public static void main(String args[])
	{
		Results student1=new Results();
		student1.getNumber(1234);
		student1.getMarks(27.5F,33.0F);
		student1.display();
	}
}