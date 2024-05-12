/*write a java programme to print the day of the week sing switch case statement*/
class Day
{
	public static void main(String args[])
	{
		int day=6;
		switch(day)
		{
			case 1: System.out.println("MONDAY");
				break;
			case 2: System.out.println("TUESDAY");
				break;
			case 3: System.out.println("WEDNESDAY");
				break;
			case 4: System.out.println("THURSDAY");
				break;
			case 5: System.out.println("FRIDAY");
				break;
			case 6: System.out.println("SATURDAY");
				break;
			case 7: System.out.println("SUNDAY");
				break;
				
				default:System.out.println("Invalid Input");
					break;
		}
	}
}