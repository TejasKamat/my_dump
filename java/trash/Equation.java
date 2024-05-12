/*WRITE A JAVA PROGRAMME TO SOLVE THE FOLLOWING EQUATION USING IF ELSE STATEMENT
y={	2 when x>0
	0 when x=0
   -1 when x<0
  } */
  
class Equation
{
	public static void main(String args[])
	{
		int x=42, y=0;
		System.out.println("The value of x="+x);
			if (x>0)
				y=1;
		    else
		{
				if(x==0)	
					y=-1;
				else 
					y=-1;
		}
		System.out.println("The value of y="+y);			
	}
} 