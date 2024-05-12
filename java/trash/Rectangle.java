//A JAVA PROGRAM TO CALCULATE AREA OF RECTANGLE USING CLASSES , OBJECTS AND METHODS//
class Rectangle
{
	int length,width;
	
	void getData(int x,int y);
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
class RectArea
{
	public static void main(String args[])
	{
		int area;
		Rectangle r1=new Rectangle(2,3);
		area=r1.rectArea();
		System.out.println("Area="+area);
	}
}