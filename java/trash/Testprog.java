//A JAVA PROGRAM TO CALCULATE AREA OF RECTANGLE USING CLASSES , OBJECTS AND METHODS
class Rectangle
{
	int length,width;
	void getData(int x,int y)
	{
		length=x;
		width=y;
	}
	int rectArea()
		{
			int area=length*width;
			return(area);
		}
}
class Testprog
{
	public static void main(String args[])
	{
		int area2;
		Rectangle r1=new Rectangle();
		r1.getData(20,23);
		area2=r1.rectArea();
		System.out.println("Area2="+area2);
	}
}