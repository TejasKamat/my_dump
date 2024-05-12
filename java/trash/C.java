package F;
public class C
	{
		public void fact(int x)
			{
			int fact=1;
			while(x>0)
			{
				fact*=x;
				x--;
			}
				System.out.println("Factorial is ="+fact);
			}
	}