/*A JAVA PROGRAM TO CALCULATE THE TOTAL MARKS OF 2 DIFFERENT STUDENTS BY CREATING A STUDENT CLASS.THIS CLASS HAS FOLLOWING DATA FIELDS AND METHODS.
data fields (roll no,marks....3,name)
methods(getdata and total)*/

class Student
{
	int roll_no;
	float  m1,m2,m3,total;
	String name;
	
	void getData(int x,float a,float b,float c,String y)
	{
		roll_no=x;
		m1=a;
		m2=b;
		m3=c;
		name=y;
	}
	void total()
	{
		total=m1+m2+m3;
	}
	void display()
	{
		System.out.println("The Name of the student is:"+name);
		System.out.println("The Roll_no is:"+roll_no);
		System.out.println("The marks of m1:"+m1);
		System.out.println("The marks of m2:"+m2);
		System.out.println("The marks of m3:"+m3);
		System.out.println("The Total marks of the student are:"+total);
	}
}
class Test123
{
	public static void main(String args[])
	{
		int Test123;
		Student s1=new Student();
		Student s2=new Student();
		s1.getData(6,50,49,48,"Rayden");
		s1.total();
		s1.display();
		s2.getData(4,45,46,48,"Ravji");
		s2.total();
		s2.display();
	}
}